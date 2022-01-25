/*

Name            : Fikrath Hassan
Student Number  : A00254511
Program         : Mobile Application Development (MAPD)

*/

import java.util.Scanner;

public class Convert {
    
    public static void main(String[] args) {
        
        Scanner usrInput;
        double usrMeasure; 
        String usrUnit, finalResult;

        // Initialise Scanner object for user input
        usrInput = new Scanner(System.in);

        // Read input from user
        System.out.println();
        System.out.print("Enter a value to convert: ");
        usrMeasure = usrInput.nextDouble();
        System.out.print("Enter the current unit of measure: ");
        usrUnit = usrInput.next();
        usrUnit = usrUnit.toLowerCase();

        // Close Scanner object
        usrInput.close();

        // Get result to a String type variable
        finalResult = convertMeasurement(usrMeasure, usrUnit);

        // Print result in a new line
        System.out.println();
        System.out.println(finalResult);
        System.out.println();
    }

    private static String convertMeasurement(double measurement, String unit) {
        String convertedMeasure = "";
        String finalResult = "";

        // Conversion of input data
        switch (unit) {
            case "km":
                convertedMeasure = String.format("%.2f", measurement*0.62)+"mi";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "mi":
                convertedMeasure = String.format("%.2f", measurement*1.61)+"km";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "cm":
                convertedMeasure = String.format("%.2f", measurement*0.39)+"in";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "in":
                convertedMeasure = String.format("%.2f", measurement*2.54)+"cm";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "kg":
                convertedMeasure = String.format("%.2f", measurement*2.2)+"lb";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "lb":
                convertedMeasure = String.format("%.2f", measurement*0.45)+"kg";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "g":
                convertedMeasure = String.format("%.2f", measurement*0.04)+"oz";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "oz":
                convertedMeasure = String.format("%.2f", measurement*28.35)+"g";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "l":
                convertedMeasure = String.format("%.2f", measurement*4.17)+"cups";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "cups":
                convertedMeasure = String.format("%.2f", measurement*0.24)+"l";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "c":
                convertedMeasure = String.format("%.2f", (measurement*9/5)+32)+"f";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "ck":
                convertedMeasure = String.format("%.2f", measurement+273.15)+"k";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "f":
                convertedMeasure = String.format("%.2f", (measurement-32)*5/9)+"c";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            case "fk":
                convertedMeasure = String.format("%.2f", ((measurement-32)*5/9)+273.15)+"k";
                finalResult = measurement + unit + " is equal to " + convertedMeasure;
                break;
            default:
                finalResult = "Unknown measurement unit found. Try again!";
                break;
        }

        return finalResult;
    }

}