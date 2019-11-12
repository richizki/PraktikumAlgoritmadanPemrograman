/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ichie
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Pendahuluan4 {

    public static void main(String[] args) throws IOException {
        int a, b, hasil, hasil2, A, B;
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("== Buffered Reader ==");
        System.out.print("Masukkan Nilai A = ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Masukkan Nilai B = ");
        b = Integer.parseInt(input.readLine());
        hasil = a + b;
        System.out.println("Hasil nilai a + b = " + hasil);

        System.out.println("== JOPtionPane ==");
        A = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai A = "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai B = "));
        hasil2 = A + B;
        JOptionPane.showMessageDialog(null, "Hasil nilai a+b = " + hasil2);
    }

}
