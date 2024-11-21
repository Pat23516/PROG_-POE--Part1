/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginandregister;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class LoginClass {
    // method to Check username 
    //username should contain an underscore and not be more than 5 characters 
    public boolean CheckUsername (String username) {
        //temp variable for checking
        boolean Found = false;
        //check userName
        
         if(username.contains("_")&& username.length()<=5){
             //then assign the variable to true
             Found= true;
            System.out.println("Username successfully captured");
        }
         else{
             //assign to false
             Found= false;
            System.out.println("Username not correctly formated, please ensure that your username contains an underscore and is no more than 5 chatacters");
        }
        
        return username.contains("_")&& username.length()<=5;
    }
    //Checking password 
    //password must contain 8 characters,special characters,a number and capital letters
    public boolean CheckPassword (String password){
        //check if the password is
        
        //pattern regex
        Pattern check_num= Pattern.compile("[0-7]");
        Pattern check_special= Pattern.compile("[~!_*@*#&%^]");
        Pattern check_upper =Pattern.compile("[A-Z]");
        
        //TEMP VARIABLE FOUND 
        boolean Found = false;
        if(password.length()>=8 && password.matches(".*[A-Z]*.") &&password.matches(".*[a-z]*.") &&password.matches(".*[0-7]*.")
                &&password.matches(".*[@#$%^+]*.")){
            //assign to true 
            Found = true;
        System.out.println("Password successfully captured");
        return Found;
        }
     else{
    Found = false;
    
    System.out.println("Password is not correctly formatted,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character.");
     
        }
        return Found;
    }
    
    
    
    //Method to resgiter a user by username and password validility
    //If both the username and password are valid, the user is regitered, if not error message and is returned
    public String registerUser (String username, String password){
        if(!CheckUsername(username)){
            //username is invalid,return an error message 
            return " The username is incorrectly formated ";
        }
        else if(!CheckPassword(password)){
            //password does not meet the requirements ,return error message 
            return "The password does not meet the complexity requirements";
        }
        else{
            //the two conditions have been met
            return "User has been sucessfully registered";
        }
       
       }
    
    //method verifies login credentials by comparing entered username and password with stored credentials
    public boolean loginStatus (String username,String password){
        //should return if login details match or false if they don't
        return true;
    }
    
    //Method to return login status message based on wether login was successfull
    public String returnLoginStatus (boolean loginSuccessful){
        if(loginSuccessful){
            //login successfull
            return "Login Successfull!";
        }else{
            //login failed due to incorrect username and password 
            return "Username or password incorrect.Please try again";
        }
    }
        
    
        
    
    
    
}
