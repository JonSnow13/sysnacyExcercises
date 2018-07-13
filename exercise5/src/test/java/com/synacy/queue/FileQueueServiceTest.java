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
public class FileQueueServiceTest {
    
    public static void main(String[] args)
    {
        
        for(int i = 0; i < 5; i++)
        {
            Message msg = new Message();
            msg.messageBody = i + "A";
            testPush(msg);
        }
        
        testPop();
        
        testMessages();
        
    }
    
    public FileQueueServiceTest() {
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
     * Test of push method, of class FileQueueService.
     */
    @Test
    public static void testPush(Message msg) {
        System.out.println("push");
        Message message = msg;
        FileQueueService instance = new FileQueueService();
        instance.push(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class FileQueueService.
     */
    @Test
    public static void testPop() {
        System.out.println("pop");
        FileQueueService instance = new FileQueueService();
        String expResult = "";
        String result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of messages method, of class FileQueueService.
     */
    @Test
    public static void testMessages() {
        System.out.println("messages");
        FileQueueService instance = new FileQueueService();
        Queue<String> expResult = null;
        Queue<String> result = instance.messages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
