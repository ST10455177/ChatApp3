package com.mycompany.chatapp1;

import java.util.Scanner;

public class Registration {
    //This stores the users registration data privately
    private String userName;
    private String userPassword;
    private String userCellPhoneNumber;
    
public Registration(String userName, String userPassword, String userCellphoneNumber){// This contructer modifies the user registration data
//It uses the this variable to assign the parameter value
        this.userName = userName;
        this.userPassword = userPassword;
        this.userCellPhoneNumber = userCellphoneNumber;
}

    public boolean check_forUserName(String userName){//This confirms the user name format
        Scanner inputObject = new Scanner(System.in); 
        
        this.userName = userName;//This stores the provided user name
        String nameOfTheUser = inputObject.nextLine();
        //It checks whether the user name contains an underscore, and the length is greater than 5
        if(userName.contains("_") && userName.length() <= 5){
            this.userName = userName;
            System.out.println("User Name is Successfully Captured! ");
            return true;

        }else{//If the username doesn't contains an underscore and the length is not greater than 5
            System.out.println("Your User Name Is Not Succefully Caption! Try Again! ");
            return false;
        }
    }
    public boolean check_forUserPassword (String userPassword){// This confirms whether the password has an upper case, a number number,a unique character and the length of the password is greater or equals to 8
        Scanner inputObject = new Scanner(System.in);
        do{
            
        this.userPassword = userPassword;//This stores the provided user name
        String password = inputObject.nextLine();
        
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasUniqueCharacter = false;
        boolean passwordHasLength = userPassword.length()>=8;

        int i = 0;
        while(i < userPassword.length()){
            char a = userPassword.charAt(i);
            
            if(Character.isUpperCase(a)){//This checks if the password has an upper case
            hasUpperCase = true;
        }
            else if(Character.isDigit(a)){//This checks whether the password has a number
                hasNumber = true;
            }
            
            else if(Character.isLetterOrDigit(a)){//This checks whether the password has a unique character
                hasUniqueCharacter = true;
            }

            i++;
        }
        if (hasUpperCase && hasNumber && hasUniqueCharacter && passwordHasLength){// This makes sure that the password has a upper case, a number, unique character and the password length is greater or equals to 8 should be true
            this.userPassword = userPassword;// This stores the provided user password
            System.out.println("Password is Successfully Captured! ");
            return true;
        }
        else {//If the password doesn't include include a number, unique character, an upper case, and the password length is not greater or equals to 8
            System.out.println("Password is Captured Incorrectly! ");
            return false;
        }
        
      }
         while(userPassword.equalsIgnoreCase("Retry"));
        
        }
    
        
    public boolean check_forCellPhoneNumber(String userCellPhoneNumber){// This confirms whether the as the south african code and it has 9 digits
        Scanner inputObject = new Scanner(System.in);

        this.userCellPhoneNumber = userCellPhoneNumber;//This stores the provided user cell phone number
        String phoneNumber = inputObject.nextLine();
        
        
        if(phoneNumber.matches("^\\+27\\d{10}$")){//This makes sure if the user cell phone number has a south african code and has 9 digits
            System.out.println("");
            this.userCellPhoneNumber = phoneNumber;
            return true;
        }
        else{//If the user cell phone number doesn't include a south african cell phone code and 9 digits it will allow the user to retry to prompt their cell phone number again
            System.out.println("");
            return false;
        }
    }
    
    public String getcheck_CellPhoneNumber(){// This retrieves cell phone number using a getter method
        return userCellPhoneNumber;
    }
    
    public String getcheck_UserName(){// This retrieves user name using a getter method
        return userName;
    }
    
    public String getcheck_UserPassword(){// This retrieves the user password using a getter method
        return userPassword;
    }
    
    public void RegistrationDetails(){//This displays of all registrationdetails
        System.out.println("====== Registration========");
        //This shows all user registration information
        System.out.println("Enter Your User Name: " + userName);
        System.out.println("Enter Your Password: " + userPassword);
        System.out.println("Enter Your Cell Phone Number: " + userCellPhoneNumber);

  } 
}
