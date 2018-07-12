package com.synacy.queue;
import java.util.Queue;

public interface QueueService {
	
	// Implement me first.
	
	// Main methods include:
	// - push
	// - pop
	// - delete
    public void push(Message message);
    public String pop();
    public void delete();
    
    public Queue<String> messages();
            
	
	// Feel free to add any additional methods if you decide they're needed.

}
