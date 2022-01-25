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
        String usrUnit, finalMeasure;

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
        finalMeasure = convertMeasurement(usrMeasure, usrUnit);

        // Print result in a new line
        System.out.println();
        System.out.println(usrMeasure + usrUnit + " is equal to " + finalMeasure);
        System.out.println();
    }

    private static String convertMeasurement(double measurement, String unit) {
        String finalMeasure = "";

        // Conversion of input data
        switch (unit) {
            case "km":
                finalMeasure = String.format("%.2f", measurement*0.62)+"mi";
                break;
            case "mi":
                finalMeasure = String.format("%.2f", measurement*1.61)+"km";
                break;
            case "cm":
                finalMeasure = String.format("%.2f", measurement*0.39)+"in";
                break;
            case "in":
                finalMeasure = String.format("%.2f", measurement*2.54)+"cm";
                break;
            case "kg":
                finalMeasure = String.format("%.2f", measurement*2.2)+"lb";
                break;
            case "lb":
                finalMeasure = String.format("%.2f", measurement*0.45)+"kg";
                break;
            case "g":
                finalMeasure = String.format("%.2f", measurement*0.04)+"oz";
                break;
            case "oz":
                finalMeasure = String.format("%.2f", measurement*28.35)+"g";
                break;
            case "l":
                finalMeasure = String.format("%.2f", measurement*4.17)+"cups";
                break;
            case "cups":
                finalMeasure = String.format("%.2f", measurement*0.24)+"l";
                break;
            case "c":
                finalMeasure = String.format("%.2f", (measurement*9/5)+32)+"f";
                break;
            case "ck":
                finalMeasure = String.format("%.2f", measurement+273.15)+"k";
                break;
            case "f":
                finalMeasure = String.format("%.2f", (measurement-32)*5/9)+"c";
                break;
            case "fk":
                finalMeasure = String.format("%.2f", ((measurement-32)*5/9)+273.15)+"k";
                break;
            default:
                break;
        }

        return finalMeasure;
    }

}