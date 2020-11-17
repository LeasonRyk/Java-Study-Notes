/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

import java.util.Scanner;
import static studynotes1a.Metric_conversion.Centimeters;

/**
 *
 * @author Leason Rykaart
 */
public class Metric {

    private double inches;
    private double gallons;

    public Metric(double inches, double gallons) {
        this.inches = inches;
        this.gallons = gallons;

    }

    public double getInches() {
        return inches;
    }

    public double getGallons() {
        return gallons;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public double distConverstion(double inches) {

        double convertion = inches * Centimeters;
        return convertion ;
    }

    public double volumeConvertion(double gallons) {
        double convertion = gallons * Centimeters;
        return convertion ;
   
    }
  
}
