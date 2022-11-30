/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_groupwork_wed;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lberg6
 */
public class Ch11_Groupwork_Wed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JourneyArray(0);

    }
    
    
    public static String projectFolder = System.getProperty("user.dir");
    public static String txtFileFolder = projectFolder + "\\txt";
    public static String directorySeparator = "\\";
    public static String startFile = "start.txt";
    public static String [] startArray = { "start.txt", "", "", "", "", "", "" };
    public static int userInput = 0;
    
    
    public static void JourneyArray() {
        try {
            String filePath = txtFileFolder + directorySeparator + startArray[0];
            File myObject = new File(filePath);
            Scanner myReader = new Scanner(myObject);
            while (myReader.hasNextLine()) {
                startArray[0] = myReader.nextLine();
                startArray[1] = myReader.nextLine();
                startArray[2] = myReader.nextLine();
                startArray[3] = myReader.nextLine();
                startArray[4] = myReader.nextLine();
                startArray[5] = myReader.nextLine();
                startArray[6] = myReader.nextLine();
            }
            myReader.close();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
        }
        
        
        System.out.println(startArray[0]);
        for (int i=4; i < startArray.length; i++) {
            System.out.println(startArray[i]);
        }
    }
    
        Scanner options = new Scanner(System.in);
        int userChoice = options.nextLine();
          switch (userChoice) {
              case "1":
                  JourneyArray(userChoice);
                  break;
              case "2":
                  JourneyArray(userChoice);
                  break;
              case "3":
                  JourneyArray(userChoice);
                  System.exit(0);
                  break;
              default:
                  System.out.println("-------------------------------------------------------------------");
                  System.out.println("You did not choose a valid option, please choose again.");
        }
}
