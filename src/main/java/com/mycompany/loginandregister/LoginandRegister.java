/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginandregister;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class LoginandRegister {

    public static void main(String[] args) {
        //Creating object of scanner 
        Scanner sc=new Scanner(System.in);
        
        //Prompting user for their first name 
        System.out.println("Please enter your firstName:");
        String firstName= sc.next();
        
        //prompting user for their last name
        System.out.println("Please enter your lastName:");
        String lastName= sc.next();
        
        //prompt user for their username with specific conditions
        System.out.println("Please enter your username:Username must contain an underscore and must not be more than 5 characters" );
        String userName= sc.next();
        
        //Validate username 
        if(userName.contains("_")&& userName.length()<=5){
            System.out.println("Username successfully captured");
        }
   
        else{
            System.out.println("Username not correctly formated, please ensure that your username contains an underscore and is no more than 5 chatacters");
        }
        
        //Prompting user for the password with specific conditions
        System.out.println("Please enter your password:Password must meet the following " +"Atleast 8 characters long" +"Contain a capital letter" +
                "Contain a number" +"Contain a special character");
        String password= sc.next();
            
        //Validate passowrd
        if(password.length()>=8 && password.matches(".*[A-Z]*.") &&password.matches(".*[a-z]*.") &&password.matches(".*[0-7]*.")
                &&password.matches(".*[@#$%^+]*.")){
            System.out.println("Password successfully captured");
        }
        else{
            System.out.println("Password is not correctly formatted,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character.");
            
        }
        // Ask the user to enter thier username and password for login
        System.out.println("Please enter your username to login");
        String enteredUsername =sc.next();
        
        System.out.print("Please enter your password to login");
        String enteredPassword= sc.next();
        
        //Verifying that the entered credentials match the registered credentials
        if(enteredUsername.equals(userName)&& enteredPassword.equals(password)){
            //if login is successful, a welcome message is displayed 
            System.out.println("Welcome" +firstName + "" +lastName +",it is great to see you again");
        }
        //if login fails , error message is shown
        System.out.println("Username or password is incorrect, please try again");
            
            
            
        }
   
    // Creating an instance of the LoginForm class
    
 Login status = new Login();
//creating an object of scanner 
Scanner sc= new Scanner(System.in);
//prompt the user for username and password
String username;
String password;
        // Registering the user using the LoginForm methods

    
    
    
    
   
  
    
   
        
     
    
    
    
    
    
}
    
        
       
    

