/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

import java.util.Scanner ;

/**
 *
 * @author Leason Rykaart
 */
public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner getVar = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = getVar.nextLine() ;
        System.out.println("enter grade point");
        double gradePoints = getVar.nextDouble() ;
        display(name, gradePoints);
        
    }
    public static void display(String name, double points){
        double credit = points * 10 ;
        System.out.println("Well Done "+ name+ " you have earned $"+credit+" Towards our store!!!");
    }
}
