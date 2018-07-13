package com.synacy.queue;

import java.util.List;
import java.util.concurrent.*;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileQueueService implements QueueService {
	
	// Implement me third.
//    final CreateQueueRequest createQueueRequest = new CreateQueueRequest("MyQueue");
//    final String myQueueUrl = sqs.createQueue(createQueueRequest).getQueueUrl();
    
    private final static BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    private final static BlockingQueue<String> producerQueue = new LinkedBlockingQueue<String>();
    private final static BlockingQueue<String> consumerQueue = new LinkedBlockingQueue<String>();
    private final static List msgList = null;
   
    
    public void push(Message message)
    {
        queue.add(message.messageBody);
        msgList.add(queue); //the message is stored in msgList to secure the messages
    }
    
    public String pop()
    {
        try {
            producer(queue.peek());
        } catch (InterruptedException ex) {
            Logger.getLogger(MemoryQueueService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consumerQueue.poll();
    }
    
    public void delete()
    {
    }
    
    public Queue<String> messages()
    {
        return queue;
    }
    
    private static void producer(String data) throws InterruptedException
    {
        producerQueue.add(data); //producerQueue stores the data
        try {
            consumer(producerQueue.poll()); //consumerQueue gets the data from producerQueue
        } catch (InterruptedException ex) {
            Logger.getLogger(MemoryQueueService.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private static void consumer(String data) throws InterruptedException
    {
       consumerQueue.add(data);
       consumerQueue.take();
    }
	
}
