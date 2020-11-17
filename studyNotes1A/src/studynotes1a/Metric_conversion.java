/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Metric_conversion {

    public static final double Centimeters = 2.54;
    public static final double liters = 3.7854;

    public static void main(String[] args) {
        
        Scanner getNum = new Scanner(System.in);
        double inches = getNum.nextDouble();
        double gallons = getNum.nextDouble();
        
        
        Metric metric = new Metric(inches, gallons);
         String pattern = "###,###.00" ;
        DecimalFormat d = new DecimalFormat(pattern);
        String format1 = d.format(metric.distConverstion(inches)) ;
        String format = d.format(metric.volumeConvertion(gallons)) ;
        
        System.out.println(format1+"cm");    
        System.out.println(format+"L");
       
       
    }

   
}
