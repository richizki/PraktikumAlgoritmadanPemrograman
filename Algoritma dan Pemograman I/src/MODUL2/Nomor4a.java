/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL2;

/**
 *
 * @author Ichie
 */
public class Nomor4a {

    public static void main(String[] args) {
        double a = 2, b = 8, c = 4, d = 4;
        double hasil = Math.pow(a, b);
        double hasil2 = Math.pow(c, d);
        double jumlah = hasil + hasil2;
        System.out.println("Hasil dari 2^8 adalah " + Math.round(hasil));
        System.out.println("Hasil dari 4^4 adalah " + Math.round(hasil2));
        System.out.println("2^8 + 4^4 = " + Math.round(jumlah));
    }
}
