import java.util.Scanner;

public class q2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of a person");
        double a = sc.nextDouble();
        System.out.println("Enter height of a person");
        double b = sc.nextDouble();
        double bmi = a/b*b;
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal weight");
        }
        else if(bmi>=25.0 && bmi<=29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }

    }
}
