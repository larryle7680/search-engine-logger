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


            }else{
                isRunning = false;
            }


        }

    }

    public static void logger(){
        //Imported the datetime/formatter in the method
        LocalDateTime dateTimeLogger = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Create File Writer/Buffer Writer
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/main/resources");
            BufferedWriter bufWriter = new BufferedWriter(writer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }










}

