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
    public void testPush() {
        System.out.println("push");
        Message message = null;
        MemoryQueueService instance = new MemoryQueueService();
        instance.push(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class MemoryQueueService.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        MemoryQueueService instance = new MemoryQueueService();
        String expResult = "";
        String result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MemoryQueueService.
     */
    @Test
    public void testDelete() {
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
    public void testMessages() {
        System.out.println("messages");
        MemoryQueueService instance = new MemoryQueueService();
        Queue<String> expResult = null;
        Queue<String> result = instance.messages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllQueueMessages method, of class MemoryQueueService.
     */
    @Test
    public void testRemoveAllQueueMessages() {
        System.out.println("removeAllQueueMessages");
        MemoryQueueService instance = new MemoryQueueService();
        instance.removeAllQueueMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
