/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL3;

/**
 *
 * @author Ichie
 */
public class Pendahuluan3 {

    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 6;
        if (a < b) {
            System.out.println("True");
        }
        
        if (a < b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if (a != b) {
            System.out.println("True");
        } else if (b > a) {
            System.out.println("True");
        }
        
        if (a == b) {
            System.out.println("True");
        } else if (a < b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        switch (a) {
            case 1:
                System.out.println("False");
                break;
            case 2:
                System.out.println("False");
                break;
            case 3:
                System.out.println("True");
                break;
            default:
                System.out.println("False");
                break;

        }
    }

}
