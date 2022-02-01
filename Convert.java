/**
 * Name            : Fikrath Hassan
 * Student Number  : A00254511
 * Program         : Mobile Application Development (MAPD)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Convert {

    static float usrMeasure; 
    static String usrUnit, finalResult;
    
    public static void main(String[] args) {

        Scanner usrInput;

        // Initialise Scanner object for user input
        usrInput = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enter a value to convert: ");

        /** 
         * Check user inputs in a valid format.
         * First input must be a float type and second input must be a string type
         */
        try {
            usrMeasure = usrInput.nextFloat();
            try {
                usrUnit = usrInput.next();
            } catch (InputMismatchException e) {
                usrInput.close();
                System.out.println("Please input in a valid format!");
                System.out.println();
                return;
            }
        } catch (InputMismatchException e) {
            usrInput.close();
            System.out.println("Please input in a valid format!");
            System.out.println();
            return;
        }

        usrUnit = usrUnit.toLowerCase();

        // Close Scanner object
        usrInput.close();

        // Get result in finalResult variable
        convertMeasurement();

        System.out.println(finalResult);
        System.out.println();
    }


    /**
     * Method to convert measurements and store result in finalVariable
     */
    static void convertMeasurement() {
        String convertedMeasure = "";
        switch (usrUnit) {
            case "km":
                convertedMeasure = String.format("%.2f", usrMeasure*0.62)+"mi";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "mi":
                convertedMeasure = String.format("%.2f", usrMeasure*1.61)+"km";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "cm":
                convertedMeasure = String.format("%.2f", usrMeasure*0.39)+"in";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "in":
                convertedMeasure = String.format("%.2f", usrMeasure*2.54)+"cm";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "kg":
                convertedMeasure = String.format("%.2f", usrMeasure*2.2)+"lb";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "lb":
                convertedMeasure = String.format("%.2f", usrMeasure*0.45)+"kg";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "g":
                convertedMeasure = String.format("%.2f", usrMeasure*0.04)+"oz";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "oz":
                convertedMeasure = String.format("%.2f", usrMeasure*28.35)+"g";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "l":
                convertedMeasure = String.format("%.2f", usrMeasure*4.17)+"cups";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "cups":
                convertedMeasure = String.format("%.2f", usrMeasure*0.24)+"l";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "c":
                convertedMeasure = String.format("%.2f", (usrMeasure*9/5)+32)+"f";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "ck":
                convertedMeasure = String.format("%.2f", usrMeasure+273.15)+"k";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "f":
                convertedMeasure = String.format("%.2f", (usrMeasure-32)*5/9)+"c";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            case "fk":
                convertedMeasure = String.format("%.2f", ((usrMeasure-32)*5/9)+273.15)+"k";
                finalResult = usrMeasure + usrUnit + " is equal to " + convertedMeasure;
                break;
            default:
                finalResult = "Unknown measurement unit found. Try again!";
                break;
        }
    }

}