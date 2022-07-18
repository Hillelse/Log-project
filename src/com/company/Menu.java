package com.company;

import java.io.*;
import java.util.Scanner;




public class Menu {


    public Pattern createPattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? \r");
        String name = scanner.nextLine();
        System.out.println("Enter subject: \r");
        String subject = scanner.nextLine();
        System.out.println("Enter the description \r");
        String description = scanner.nextLine();
        Pattern pattern = new Pattern(name , subject , description);
        pattern.showProblem();
        return pattern;
    }

    public Pattern showPattern(String fileName) throws IOException, ClassNotFoundException {
        try {
            return PatternCreator.readPatternFromFile(fileName);

        }catch (Exception error){
            System.out.println("File does not exist!");
        }return null;


    }
    public void show() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit){
            instructions();
            System.out.println("Enter your choice: ");
            if(!scanner.hasNextInt()) {
                System.out.println("Enter a NUMBER!!!");
                scanner.nextLine();
                continue;
            }
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("quiting");
                    quit = true;
                    break;
                case 1:
                    Pattern pattern = createPattern();
                    PatternCreator.WriteFileToFile(pattern, pattern.getSubject());
                    break;
                case 2:
                    System.out.println("Enter the file name: ");
                    System.out.println(showPattern(scanner.nextLine()));
                    break;
                case 3:
                    PatternCreator.showAllFiles();
                    break;
                default:
                    System.out.println("this is not an option" );




            }



        }
    }


    public static void instructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Quit.");
        System.out.println("\t 1 - To add a new Problem.");
        System.out.println("\t 2 - To show a problem.");
        System.out.println("\t 3 - To show all the problems.");

    }


}
