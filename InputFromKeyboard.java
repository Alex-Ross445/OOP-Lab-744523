/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20226095.nguyenminhtuan.lab1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class InputFromKeyboard {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 6.2
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What's your name? ");
        String strName = keyboard.nextLine();
        System.out.println("How old are you? ");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)? ");
        double dHeight = keyboard.nextDouble();
        
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. Your height is " + dHeight + " m.");
    }
}