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
public class TaskManagerapp {
     // Declare arrays for storing task data
    static String[] developers = new String[4];
    static String[] taskNames = new String[4];
    static String[] taskIds = new String[4];
    static int[] taskDurations = new int[4];
    static String[] taskStatuses = new String[4];

    public static void main(String[] args) {
        // Populate arrays with test data
        developers[0] = "Mike Smith";
        taskNames[0] = "Create Login";
        taskDurations[0] = 5;
        taskStatuses[0] = "To Do";
        taskIds[0] = taskNames[0].substring(0, 2) + ":" + "T001" + ":" + taskStatuses[0].substring(taskStatuses[0].length() - 3);

        developers[1] = "Edward Harrison";
        taskNames[1] = "Create Add Features";
        taskDurations[1] = 8;
        taskStatuses[1] = "Doing";
        taskIds[1] = taskNames[1].substring(0, 2) + ":" + "T002" + ":" + taskStatuses[1].substring(taskStatuses[1].length() - 3);

        developers[2] = "Samantha Paulson";
        taskNames[2] = "Create Reports";
        taskDurations[2] = 2;
        taskStatuses[2] = "Done";
        taskIds[2] = taskNames[2].substring(0, 2) + ":" + "T003" + ":" + taskStatuses[2].substring(taskStatuses[2].length() - 3);

        developers[3] = "Glenda Oberholzer";
        taskNames[3] = "Add Arrays";
        taskDurations[3] = 11;
        taskStatuses[3] = "To Do";
        taskIds[3] = taskNames[3].substring(0, 2) + ":" + "T004" + ":" + taskStatuses[3].substring(taskStatuses[3].length() - 3);

        // create  Main loop to display options and process user input
        while (true) {
            String menu = "1. Display Developer, Task Name and Duration for all tasks that are 'Done'\n"
                        + "2. Display Developer and Duration of the task with the longest duration\n"
                        + "3. Search for a Task Name\n"
                        + "4. Search tasks assigned to a Developer\n"
                        + "5. Delete a task by Task Name\n"
                        + "6. Display full details of all tasks\n"
                        + "7. Exit";
            String choice = JOptionPane.showInputDialog(null, menu);

            if (choice == null) break; // If user clicks Cancel or exits

            switch (choice) {
                case "1":
                    displayDoneTasks();
                    break;
                case "2":
                    displayLongestTask();
                    break;
                case "3":
                    String taskName = JOptionPane.showInputDialog("Enter task name to search:");
                    searchTaskByName(taskName);
                    break;
                case "4":
                    String developerName = JOptionPane.showInputDialog("Enter developer name to search tasks:");
                    searchTasksByDeveloper(developerName);
                    break;
                case "5":
                    String deleteTask = JOptionPane.showInputDialog("Enter task name to delete:");
                    deleteTask(deleteTask);
                    break;
                case "6":
                    displayAllTasks();
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Exiting application.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice, please try again.");
            }
        }
    }

    // Display all tasks with status "Done"
    public static void displayDoneTasks() {
        StringBuilder doneTasks = new StringBuilder();
        for (int i = 0; i < taskStatuses.length; i++) {
            if (taskStatuses[i].equalsIgnoreCase("Done")) {
                doneTasks.append("Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Duration: " + taskDurations[i] + " hours\n");
            }
        }
        if (doneTasks.length() > 0) {
            JOptionPane.showMessageDialog(null, doneTasks.toString(), "Done Tasks", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No tasks are marked as 'Done'.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Display task with longest duration
    public static void displayLongestTask() {
        int longestDuration = taskDurations[0];
        String developer = developers[0];
        String taskName = taskNames[0];

        for (int i = 1; i < taskDurations.length; i++) {
            if (taskDurations[i] > longestDuration) {
                longestDuration = taskDurations[i];
                developer = developers[i];
                taskName = taskNames[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Task with longest duration: " + taskName + ", Developer: " + developer + ", Duration: " + longestDuration + " hours", "Longest Task", JOptionPane.INFORMATION_MESSAGE);
    }

    // Search for a task by its name
    public static void searchTaskByName(String taskName) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                result.append("Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Status: " + taskStatuses[i] + "\n");
            }
        }
        if (result.length() > 0) {
            JOptionPane.showMessageDialog(null, result.toString(), "Task Search Results", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Search for tasks assigned to a specific developer
    public static void searchTasksByDeveloper(String developerName) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equalsIgnoreCase(developerName)) {
                result.append("Task Name: " + taskNames[i] + ", Status: " + taskStatuses[i] + "\n");
            }
        }
        if (result.length() > 0) {
            JOptionPane.showMessageDialog(null, result.toString(), "Developer's Tasks", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found for the specified developer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Delete a task by its name
    public static void deleteTask(String taskName) {
        boolean deleted = false;
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                taskNames[i] = null;
                developers[i] = null;
                taskDurations[i] = 0;
                taskStatuses[i] = null;
                taskIds[i] = null;
                deleted = true;
                break;
            }
        }
        if (deleted) {
            JOptionPane.showMessageDialog(null, "Task deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Display all the  tasks
    public static void displayAllTasks() {
        StringBuilder allTasks = new StringBuilder();
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i] != null) {
                allTasks.append("Task ID: " + taskIds[i] + ", Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Duration: " + taskDurations[i] + " hours, Status: " + taskStatuses[i] + "\n");
            }
        }
        JOptionPane.showMessageDialog(null, allTasks.toString(), "All Tasks", JOptionPane.INFORMATION_MESSAGE);
    }
}

    

 



