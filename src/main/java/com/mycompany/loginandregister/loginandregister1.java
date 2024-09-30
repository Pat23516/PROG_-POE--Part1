/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginandregister;

/**
 *
 * @author RC_Student_lab
 */
public class loginandregister1 {
    //Declarations
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    
    //Creating getters and setters
    
    public void setUsername (String i){
        this.username=username;
    }
    String getUsername (){
        return username;
    }
    public void setFirstname (String i){
        this.firstName=firstName;
    }
    String getFirstname (){
        return firstName;
    }
   public void setLastname (String i) {
       this.lastName=lastName;
   }
   String getLastname (){
       return lastName;
   }
   public void setPassword (String i){
       this.password=password;
   }
   String getPassword (){
       return password;
   }
   
   void message () {
      System.out.println("Username" + username);
      System.out.println("Firstname" +firstName);
      System.out.println("Lastname" + lastName);
      System.out.println("Password" +password);
       
       
   }
   
   
}
