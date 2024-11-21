/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.loginandregister;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagerappTest {
    
    public TaskManagerappTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Calling the @BeforeClass Method!");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Calling the @AfterClass Method!");
    }
    
    @Before
    public void setUp() {
        System.out.println("Calling the @Before Method(before each test method !");
    }
    
    @After
    public void tearDown() {
         System.out.println("Calling the @After Method(before each test method !");
        
    }

    /**
     * Test of main method, of class TaskManagerapp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TaskManagerapp.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayDoneTasks method, of class TaskManagerapp.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("displayDoneTasks");
        TaskManagerapp.displayDoneTasks();
        // Expected output (based on the initialized data)
        String expectedOutput = "Developer: Samantha Paulson, Task Name: Create Reports, Duration: 2 hours\n";
        
        // Call the method and get the actual output
        String actualOutput = TaskManagerApp.displayDoneTasks();
        
        // Print the output for debugging purposes
        System.out.println("Expected: " + expectedOutput);
        System.out.println("Actual: " + actualOutput);
        
        // Assert that the expected output matches the actual output
        assertEquals(expectedOutput, actualOutput);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class TaskManagerapp.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskManagerapp.displayLongestTask();
        // Add more tasks to test longest task logic
          String expectedOutput = "Task with longest duration: Add Arrays, Developer: Glenda Oberholzer, Duration: 11 hours";
        
        String actualOutput = TaskManagerApp.displayLongestTask();
        
        // Print for debugging
        System.out.println("Expected: " + expectedOutput);
        System.out.println("Actual: " + actualOutput);
        
         assertEquals(expectedOutput, actualOutput);
    }
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    

    /**
     * Test of searchTaskByName method, of class TaskManagerapp.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = null;
       
        TaskManagerapp.searchTaskByName(taskName);
        
        String expectedOutput = "Task Name: Create Reports, Developer: Samantha Paulson, Status: Done\n";
        
        String actualOutput = TaskManagerApp.searchTaskByName(taskName);
        
        // Print for debugging
        System.out.println("Expected: " + expectedOutput);
        System.out.println("Actual: " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    

    /**
     * Test of searchTasksByDeveloper method, of class TaskManagerapp.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "";
        TaskManagerapp.searchTasksByDeveloper(developerName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class TaskManagerapp.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "";
        TaskManagerapp.deleteTask(taskName);
         // Before deletion, ensure the task exists
        String taskToDelete = "Create Reports";
        String resultBeforeDeletion = TaskManagerApp.displayAllTasks();
        assertTrue(resultBeforeDeletion.contains(taskToDelete));
        
          // Now, delete the task
        TaskManagerApp.deleteTask(taskToDelete);
        
        // After deletion, the task should not be present
        String resultAfterDeletion = TaskManagerApp.displayAllTasks();
        assertFalse(resultAfterDeletion.contains(taskToDelete));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasks method, of class TaskManagerapp.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        TaskManagerapp.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    private static class TaskManagerApp {

        private static String displayAllTasks() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void deleteTask(String taskToDelete) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static String searchTaskByName(String taskName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static String displayLongestTask() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static String displayDoneTasks() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public TaskManagerApp() {
        }
    }
    
}
