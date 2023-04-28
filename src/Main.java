package edu.cscc;
import java.util.Scanner;

// Megan Garcia-Basanez, 02/01/2023, Body Mass Index Calculator
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, meters, kgs, bmi;
        String classification;
        //Gather information for methods
        System.out.print("Calculate BMI\nEnter weight (lbs): ");
        lbs = input.nextDouble();
        System.out.print("Enter height (inches): ");
        inches = input.nextDouble();
        // assign calculations to variables
        kgs = kgsToLbs(lbs);
        meters = inchesToMeters(inches);
        bmi = bmiNumber(kgs, meters);
        classification = bmiClass(bmi);
        // output BMI information
        System.out.print("Your BMI is " + bmi + "\nYour BMI classification is " + classification);


    }
    //Convert pounds into kilograms
    public static Double kgsToLbs(Double lbs){
        Double kgs = lbs/2.2046;
        return kgs;
    }
    //Convert inches into meters
    public static Double inchesToMeters(Double inches){
        Double meters = inches/39.37;
        return meters;
    }
    //Calculate BMI number
    public static double bmiNumber(Double kgs, Double meters){
        Double bmi = kgs / (meters * meters);
        return bmi;
    }

    //Method to know what classification BMI number is in
    public static String bmiClass(double BMI){
        String classification = "";
        if (BMI < 18.5){
            classification = "underweight";
        }else if (BMI < 25.0){
            classification = "normal";
        }else if (BMI < 30.0){
            classification = "overweight";
        }else if (BMI >= 30.0){
            classification = "obese";
        }
        return classification;
    }
}