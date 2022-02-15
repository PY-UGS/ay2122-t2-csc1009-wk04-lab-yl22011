import java.util.Scanner;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        BMI bmi = new BMI();
        System.out.println("Enter weight in pounds: ");
        bmi.setWeight(scan.nextDouble());
        System.out.println("Enter height in inches: ");
        bmi.setHeight(scan.nextDouble());
        scan.close();

        bmi.getBMI();

        System.out.println("BMI is :" + bmi.getBmi2());
        System.out.println(bmi.getInterpration());
        



    }
    
}
