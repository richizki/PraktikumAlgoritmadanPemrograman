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
public class Nomor3 {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Masukkan jumlah pendapatan!");
        int hasilpenjualan = Integer.parseInt(a);
        int pendapatan;
        if (hasilpenjualan == 2000000) {
            pendapatan = (int) (100000 + (hasilpenjualan * 0.1));
            System.out.println("Pendapatan Salesman : " + pendapatan);
        } else if (hasilpenjualan >= 2000000 && hasilpenjualan <= 5000000) {
            pendapatan = (int) (200000 + (hasilpenjualan * 0.15));
            System.out.println("Pendapatan Salesman : " + pendapatan);
        } else if (hasilpenjualan > 5000000) {
            pendapatan = (int) (300000 + (hasilpenjualan * 0.2));
            System.out.println("Pendapatan Salesman : " + pendapatan);
        }
    }
}
