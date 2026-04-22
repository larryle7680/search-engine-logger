package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDateTime;

public class SearchEngineLoggerApp {
    //Importing Static stuff to help with code
    static Scanner theScanner = new Scanner(System.in);


    public static void main(String[] args) {

        //Prompt the user to choose an option and store the value
        System.out.println("=== Main Menu ===");
        System.out.println();
        System.out.println("1. Launch the Application");
        System.out.println("2. Search for term");
        System.out.println("3. Exit the Program");
        System.out.println();
        System.out.print("Please select the option: ");
        int usersChoice = theScanner.nextInt();

        //Creating the menu
        //Variable for menu running
        boolean isRunning = true;
        while(isRunning){
            if(usersChoice == 1){
                System.out.println("Application is Launched!");
                break;
            }
            else if(usersChoice == 2){
            //Create a method to help with choice 2 what is the users search

            }else{
                isRunning = false;
            }
        }
        logger(usersChoice);


    }

    public static void logger(int usersChoice){
        //Imported the datetime/formatter in the method
        LocalDateTime dateTimeLogger = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateTimeLogger.format(formatter);

        //Create File Writer/Buffer Writer
        FileWriter writer = null;
        try {
            //prompt the user to name the file of the logger and store it
            System.out.println("What do you want to call the file name?");


            writer = new FileWriter("src/main/resources");
            BufferedWriter bufWriter = new BufferedWriter(writer);

            //use the writer to log in the information that has been processed in the menu
            if(usersChoice == 1) {
                bufWriter.write("Application is Launched! " + formattedDate);
            }else if(usersChoice == 2){

            }

        } catch (Exception e) {

            //Print to users that we couldn't find the file
            System.out.println("File was not found");
            throw new RuntimeException(e);
        }




    }










}

