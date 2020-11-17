/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

import java.util.Scanner;

/**
 *
 * @author Leason Rykaart
 */
public class percentage2 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        System.out.println("Enter num a");
        double a = getNum.nextDouble() ;
        System.out.println("Enter num b");
        double b = getNum.nextDouble() ;
        System.out.println(computePercent(b, a)+"%");
        System.out.println(computePercentreverse(b, a)+"%");
    }
    public static double computePercent(double b, double a){
        double c = ((a / b) * 100) ;
        return c ;
    }
     public static double computePercentreverse(double b, double a){
        double c = ((b / a) * 100) ;
        return c ;
    }
    
}
