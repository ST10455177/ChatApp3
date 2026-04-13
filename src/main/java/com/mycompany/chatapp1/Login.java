package com.mycompany.chatapp1;

import java.util.Scanner;

public class Login {
    //This stores the users login details private
    private String userName;
    private String userPassword;
    
    public Login(String userName, String userPassword){//This contructer modifies the users login data
        //It uses this variables to assign the parameter value
        this.userName = userName;
        this.userPassword = userPassword;
        
    }
    
    public boolean check_forUserName(String userName){//This confirms the user name login format
        Scanner inputObject = new Scanner(System.in);
        
        boolean isUserNameValid;
        
        this.userName = userName;//This stores the provided user name
        String UserName = inputObject.nextLine();
        
        if(userName.contains("_") && userName.length()<= 5){//This makes sure the user name includes an under score and the length is grater or equals to 5 
            this.userName = userName;
            System.out.println("User Name Is Successfully Captured!!");
            isUserNameValid = true;//If the user name includes the user name includes an under score and the length is grater or equals to 5 it returns true
        }
        else{
            System.out.println("Your User Name Is Invaild!!");
            isUserNameValid = false;//If not it returns false
        }
        
        while(!isUserNameValid);
        
        return isUserNameValid;
        
    }
    
    public boolean check_forUserPassword(String userPassword){//
        Scanner inputObject = new Scanner(System.in);
        
        boolean isUserPasswordValid;
        
        do{
            this.userPassword = userPassword;
            String UserPassword = inputObject.nextLine();
            
            boolean hasUpperCase = false;
            boolean hasNumber = false;
            boolean hasUniqueCharacter = false;
            boolean passwordHasLength = userPassword.length()>=8;
            
            int i = 0;
            
            while(i < userPassword.length()){
                char a = userPassword.charAt(i);
                
                if(Character.isUpperCase(a)){
                hasUpperCase = true;
                
            }
                else if(Character.isDigit(a)){
                    hasNumber = true;
                    
                }
                else if(Character.isLetterOrDigit(a)){
                    hasUniqueCharacter = true;
                    
                }
                    i++;
            }
            if(hasUpperCase && hasNumber && hasUniqueCharacter && passwordHasLength){
                this.userPassword = userPassword;
                System.out.println("Password Is Successfully Captured!");
                isUserPasswordValid = true;
                
        }
            else{
                System.out.println("Password Is Captured Is Incorrectly!");
                isUserPasswordValid = false;
            }
    }
        while(!isUserPasswordValid);
        
        return isUserPasswordValid;
        
    }
    
    
    public void LoginDetails(){
        System.out.println("======Login=======");
        System.out.println("Enter your user name: " + userName);
        System.out.println("Enter Your Password: " + userPassword);
    }
   
}
