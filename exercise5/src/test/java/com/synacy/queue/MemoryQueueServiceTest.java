/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synacy.queue;

import java.util.Queue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel Ortega Jr
 */
public class MemoryQueueServiceTest {
    
    public static void main(String[] args)
    {
        
        for(int i = 0; i < 5; i++)
        {
            Message msg = new Message();
            msg.messageBody = i + "A";
            testPush(msg);
        }
        
        testPop();
        
        testDelete();
        
        testMessages();
        
    }
    
    public MemoryQueueServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class MemoryQueueService.
     */
    @Test
    public static void testPush(Message msg) {
        System.out.println("push");
        Message message = msg;
        MemoryQueueService instance = new MemoryQueueService();
        instance.push(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class MemoryQueueService.
     */
    @Test
    public static void testPop() {
        System.out.println("pop");
        MemoryQueueService instance = new MemoryQueueService();
        String expResult = "4A";
        String result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MemoryQueueService.
     */
    @Test
    public static void testDelete() {
        System.out.println("delete");
        MemoryQueueService instance = new MemoryQueueService();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of messages method, of class MemoryQueueService.
     */
    @Test
    public static void testMessages() {
        System.out.println("messages");
        MemoryQueueService instance = new MemoryQueueService();
        Queue<String> expResult = null;
        for (int i = 0; i < 3; i++) {
            expResult.add(i + "A");
        }
        Queue<String> result = instance.messages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
