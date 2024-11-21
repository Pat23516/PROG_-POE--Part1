/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginandregister;



/**
 *
 * @author RC_Student_lab
 */
public class Task {

   private String taskName;
    private String taskDescription;
    private String developerName;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    private static int taskNumber = 0;  // To auto-increment task number
    private final int currentTaskNumber;  // Store the current task number
    
// Constructor to initialize task details
    public Task(String taskName, String taskDescription, String developerName, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerName = developerName;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.currentTaskNumber = taskNumber++;
        this.taskID = createTaskID();
    }
// Method to check if task description is within 50 characters
    public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }

    // Method to create a TaskID
    public String createTaskID() {
        String taskPrefix = taskName.substring(0, 2).toUpperCase();  // First 2 letters of task name
        String developerSuffix = developerName.substring(developerName.length() - 3).toUpperCase();  // Last 3 letters of developer name
        return taskPrefix + ":" + currentTaskNumber + ":" + developerSuffix;
    }

    // Method to print full task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer: " + developerName + "\n" +
               "Task Number: " + currentTaskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Task Duration: " + taskDuration + " hours";
    }

    // Method to return total hours of the task
    public int getTaskDuration() {
        return taskDuration;
    }    

}