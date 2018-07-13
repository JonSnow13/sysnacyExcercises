package com.synacy.queue;

import java.util.concurrent.*;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemoryQueueService implements QueueService {
	
	// Implement me second.
//    private Queue<String> queue = new ConcurrentLinkedQueue<String>()
    private final static BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    private final static BlockingQueue<String> producerQueue = new LinkedBlockingQueue<String>();
    private final static BlockingQueue<String> consumerQueue = new LinkedBlockingQueue<String>();
    
    public void push(Message message)
    {
        
        queue.add(message.messageBody); //adds the message to queue
        
    }
    
    public String pop()
    {
        try {
            producer(queue.peek()); // the producerQueue gets the latest message from the queue
        } catch (InterruptedException ex) {
            Logger.getLogger(MemoryQueueService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consumerQueue.peek(); //consumerQueue returns the message that recieved from producerQueue. 
    }
    
    public void delete()
    {
        queue.remove();
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
