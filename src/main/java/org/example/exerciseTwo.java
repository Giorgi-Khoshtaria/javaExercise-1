package org.example;

import java.util.Scanner;

public class exerciseTwo {
  static void main() {
    Scanner scanner=new Scanner(System.in);

    String username="giorgi";
    String password= "Armaxsovs-123!";

    System.out.println("Enter username: ");
    String  enteredUsername=scanner.nextLine();

    System.out.print("Enter password: ");
    String enteredPassword = scanner.nextLine();

    if( username.equals(enteredUsername)&& password.equals(enteredPassword)){
      System.out.println("Login successful");
    }
    else {
      System.out.println("Invalid username or password.");
    }





  }
}
