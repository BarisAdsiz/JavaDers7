/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_7;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int number2 = input2.nextInt();
        
        System.out.println("Total: " + (number1 + number2));
        
    }
    
}
