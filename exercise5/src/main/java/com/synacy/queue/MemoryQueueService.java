package com.synacy.queue;

import java.util.concurrent.*;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemoryQueueService implements QueueService {
	
	// Implement me second.
//    private Queue<String> queue = new ConcurrentLinkedQueue<String>()
    private final static BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    
    public void push(Message message)
    {
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
        return queue.poll();
    }
    
    public void delete()
    {
        queue.remove();
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
