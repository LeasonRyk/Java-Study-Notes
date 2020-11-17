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
public class Numebrsdemo {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a + 5 = " + displayNumberPlusFive(a));
        System.out.println("a Squared = " + displayNumberSquared(a));
        System.out.println("Twice the Number a = " + displayTwiceTheNumber(a));

        System.out.println("b + 5 = " + displayNumberPlusFive(b));
        System.out.println("b Squared = " + displayNumberSquared(b));
        System.out.println("Twice the Number b = " + displayTwiceTheNumber(b));

    }

    public static int displayTwiceTheNumber(int c) {
        c = c * 2;
        return c;

    }

    public static int displayNumberPlusFive(int c) {
        c = c + 5;
        return c;

    }

    public static int displayNumberSquared(int c) {
        c = c * c;
        return c;

    }
}
