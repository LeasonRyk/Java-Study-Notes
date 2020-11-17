/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

/**
 *
 * @author Leason Rykaart
 */
public class Percentage {
    public static void main(String[] args) {
        double a = 2.0 ;
        double b = 5.0;
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
