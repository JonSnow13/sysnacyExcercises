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
    
    private static BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    private static final List msgList = null;
   
    
    public void push(Message message)
    {
        msgList.add(message);
        try {
            producer(message.messageBody);
        } catch (InterruptedException ex) {
            Logger.getLogger(MemoryQueueService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            consumer();
        } catch (InterruptedException ex) {
            Logger.getLogger(MemoryQueueService.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public String pop()
    {
        return this.queue.peek();
    }
    
    public void delete()
    {
    }
    
    public Queue<String> messages()
    {
        return this.queue;
    }
    
    private static void producer(String data) throws InterruptedException
    {
        queue.put(data);
    }
    
    private static void consumer() throws InterruptedException
    {
       queue.take();
    }
	
}
