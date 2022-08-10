package com.bdse.pfs;

import java.util.regex.*;

public class Display extends McqQuestion {
    // create the menuFunction that will display the MCQ's topic
    public static void showMenu() {
        System.out.println("Please Select The Mcq's topic : ");
        System.out.println("================================");
        System.out.println("[1] HTML");
        System.out.println("[2] Javascript");
        System.out.println("================================");
        System.out.println("Please type [1] or [2] as the input format");
        System.out.print("your Input is : ");
    }

    // Create the function that's taking the username
    public void inputName() {
        System.out.println();
        System.out.print("Please Input Your Name : ");
        name = input.nextLine();
        //if the name is true then print the welcome message
        if (isValidName(name)) {
            System.out.println();
            System.out.println("==========================");
            System.out.println("welcome " + name);
            System.out.println("==========================");
            System.out.println();
        } else {
            //if false repeat this function
            inputName();
        }
    }

    // create function that validate the name
    public static boolean isValidName(String name) {
        // Regex to check valid username.
        String regex = "^[A-Za-z ]+$";
        Pattern p = Pattern.compile(regex);
        // if name is null
        if (name == null) {
            System.out.println("\nPlease use letter only");
            return false;
        }
        java.util.regex.Matcher m = p.matcher(name);
        return m.matches();
    }
}
