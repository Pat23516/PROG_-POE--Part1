/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginandregister;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class EasyKanban {
    public static void main(String[] args) {
        // Display the welcome message
        JOptionPane.showMessageDialog(null, "Welcome to Kanban", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        // Main loop for the user menu
        boolean running = true;
        int totalHours = 0; // Total hours counter

        while (running) {
            // Main menu options
            String menu = "1. Add tasks\n"
                        + "2. Show Report (Coming soon)\n"
                        + "3. Quit";
            
            // Get user's choice
            String choice = JOptionPane.showInputDialog(null, menu);

            switch (choice) {
                case "1":
                    // Ask the user how many tasks they want to enter
                    int taskCount = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to add?"));
                    Task[] tasks = new Task[taskCount];  // Array to store tasks

                    // For adding tasks
                    for (int i = 0; i < taskCount; i++) {
                        String taskName = JOptionPane.showInputDialog("Enter task name (e.g., Add Login Feature):");

                        String taskDescription;
                        while (true) {
                            taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
                            if (taskDescription.length() <= 50) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        String developerName = JOptionPane.showInputDialog("Enter the developer's name:");

                        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter the estimated duration (in hours):"));

                        // Ask for task status
                        String[] statuses = {"To Do", "Doing", "Done"};
                        String taskStatus = (String) JOptionPane.showInputDialog(
                            null, "Select task status", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);

                        // Create a new task
                        Task task = new Task(taskName, taskDescription, developerName, taskDuration, taskStatus);

                        // Check if the description is valid and display task details
                        if (task.checkTaskDescription()) {
                            tasks[i] = task;
                            JOptionPane.showMessageDialog(null, task.printTaskDetails(), "Task Details", JOptionPane.INFORMATION_MESSAGE);
                            totalHours += task.getTaskDuration();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Task description must be less than 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                case "2":
                    // Show "Coming soon" message as report is not implemented
                    JOptionPane.showMessageDialog(null, "Coming soon", "Feature", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "3":
                    // Show the total accumulated hours and exit
                    JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + totalHours, "Total Hours", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Exiting application.", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
                    running = false; // Set running to false to exit the loop
                    break;

                default:
                    // If the user selects an invalid option, show an error message
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please select a valid option.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    

    }
}