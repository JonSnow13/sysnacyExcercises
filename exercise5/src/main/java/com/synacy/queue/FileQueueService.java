package com.synacy.queue;

import java.util.concurrent.*;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileQueueService implements QueueService {
	
	// Implement me third.
    
    private static BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    
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
        return this.queue.poll();
    }
    
    public void delete()
    {
        this.queue.remove();
    }
    
    public Queue<String> messages()
    {
        return this.queue;
    }
    
    public void removeAllQueueMessages()
    {
        queue.clear();
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
