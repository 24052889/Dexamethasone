
package demo;

import  java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the principal amount:");
        double P=input.nextDouble();
        
        System.out.println("Enter the interest rate:");
        double I=input.nextDouble();
        
        System.out.println("Enter the period:");
        double N=input.nextDouble();
        
       double A=P*Math.pow((1+I/100),N);
        
        System.out.println("What is the total amount "+A);
        
    }
    
}
