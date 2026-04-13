package com.mycompany.chatapp1;

import java.util.Scanner;

public class ChatApp1 {
 
    private String userName;
    private String userPassword;
    private String userCellPhoneNumber;
    private String Register;
    private String Login;
    
    public ChatApp1 (String userName, String userPassword, String userCellPhoneNumber, String Register, String Login){
        
        this.userName = userName;
        this.userPassword = userPassword;
        this.userCellPhoneNumber = userCellPhoneNumber;
        this.Register = Register;
        this.Login = Login;
        
    }
    
    public static void main(String[] args) {
        
        Scanner inputObject = new Scanner(System.in);
        ChatApp1 app = new ChatApp1("","","","","");

        System.out.println("\n======Welcome To The Chat App!!======");
        System.out.println("1. Register");
        System.out.println("2. Login");
        
        int choice = inputObject.nextInt();
        inputObject.nextLine();
        
        switch(choice){
            case 1 :
                app.Registration();
                break;
                
            case 2 :
                app.Login();
                break;
                
            case 3 : 
                System.out.println("Invaild Choice");
                break;
        }
        inputObject.close();
        
    }
    private boolean check_forUserName(String userName){
        return userName.contains("") && userName.length() <=5;
    }
    
    private boolean check_forUserPassword(String userPassword){
        boolean hasUpperCase = !userPassword.equals(userPassword.toLowerCase());
        boolean hasSpecialCharacter = !userPassword.matches("[A-Za-z0-9]*");
        boolean hasNumber = userPassword.matches(".*\\d.*");
        
        return userPassword.length()>= 8 && hasUpperCase && hasSpecialCharacter && hasNumber;
    }
    private boolean check_forUserCellPhoneNumber(String userCellPhoneNumber){
        return userCellPhoneNumber.startsWith("+27") && userCellPhoneNumber.length() == 12;
    }
    
   public void Registration (){
       Scanner inputObject = new Scanner(System.in);
       
       System.out.println("\n========REGISTRATION!========");
       
       boolean isUserNameValid;
       
       do{
           System.out.println("Please Enter Your User Name: ");
           userName = inputObject.nextLine();
           this.userName = userName;
           
           isUserNameValid = check_forUserName(userName);
           
           if(!isUserNameValid){
               System.out.println("Your User Is Incorrect ");
           }
           
           else{
               System.out.println("Your User Name Is Correct");
       }
   }
       
       while(!isUserNameValid);
       
       boolean isUserPasswordValid;
       
       do{
           System.out.println("Please Enter Your Password: ");
           userPassword = inputObject.nextLine();
           this.userPassword = userPassword;
           
           isUserPasswordValid = check_forUserPassword(userPassword);
           
           if(!isUserPasswordValid){  
       }
           else{
               System.out.println("Your User Password Is Incorrect");
           }
       }
       while(!isUserPasswordValid);
       
       boolean isUserCellPhoneNumberValid;
       
       do{
           System.out.println("Please Enter Your Cell Phone Number: ");
           userCellPhoneNumber = inputObject.nextLine();
           this.userCellPhoneNumber = userCellPhoneNumber;
           
           isUserCellPhoneNumberValid = check_forUserCellPhoneNumber(userCellPhoneNumber);
           
           if(isUserCellPhoneNumberValid){
               System.out.println("User Cell Phone Number Is Correct");
       }
           else{
               System.out.println("Your Cell Phone Number Is Incorrect");
           }
       }
       while (!isUserCellPhoneNumberValid);
       System.out.println("\n========REGISTRATION SUCCESSUFULLY");
   }
   
        public void Login(){
               
       Scanner inputObject = new Scanner(System.in);
       System.out.println("\n=====Login=====");
       
       while(true){
       
           System.out.println("Enter Your Name: ");
           String name = inputObject.nextLine();
           
           if(name.equals(this.userName)){
               System.out.println("Your User Name Is Correct");
               break;//It allows to end or exist the loop
       }
           else{
               System.out.println("Your User Name Is Incorrect");
               
           }
           
       }
       
       while(true){

          System.out.println("Enter Your Password: ");
           String password = inputObject.nextLine();
           
          if(!password.equals(this.userPassword)){
               System.out.println("Your User Password Is Incorrect");
               break;
       }
           else{
               System.out.println("User Password Is Incorrectly");
               break;
          }
       }
            System.out.println("\nWelcome back," + this.userName +"!");
   }
}
   

