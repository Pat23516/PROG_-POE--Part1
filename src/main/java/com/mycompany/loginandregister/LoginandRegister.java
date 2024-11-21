/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginandregister;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
public class LoginandRegister {

   public static void main(String[] args) {
        //pass the external class
        LoginClass log= new LoginClass ();
        
      
        
       //declarations
       String firstname;
       String lastname;
       String username;
       String password= null;
        








        //Creating object of scanner 
        Scanner sc=new Scanner(System.in);
        
        //Prompting user for their first name 
        System.out.print("Please enter your firstName:");
        String firstName= sc.next();
        
        //prompting user for their last name
        System.out.print("Please enter your lastName:");
        String lastName= sc.next();
        
        //prompt user for their username with specific conditions
        System.out.print("Please enter your username:" );
        String userName= sc.next();
        
        //Validate username 
        if(userName.contains("_")&& userName.length()<=5){
            System.out.println("Username successfully captured");
        }
   
        else{
            System.out.println("Username not correctly formated, please ensure that your username contains an underscore and is no more than 5 chatacters");
        }
        
        //Prompting user for the password with specific conditions
        System.out.print("Please enter your password:");
         password = sc.next();
         log.CheckPassword(password);
         
         
        
            
        
            
        
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
   
   }
}


      