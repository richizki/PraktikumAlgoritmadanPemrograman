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
public class Nomor3 {

    public static void main(String[] args) {
        int biayahaji, tabungan, sisawaktu, sisabiaya, cicilan;
        biayahaji = 50000000;
        tabungan = 10000000;
        sisawaktu = 24 - 1;
        sisabiaya = biayahaji - tabungan;
        cicilan = sisabiaya / sisawaktu;
        System.out.println("Biaya haji \t\t: Rp" + biayahaji);
        System.out.println("Jumlah tabungan \t: Rp" + tabungan);
        System.out.println("Sisa waktu pembayaran \t: " + sisawaktu + " (24 - 1) bulan");
        System.out.println("Sisa biaya \t\t: Rp" + sisabiaya);
        System.out.println("Jumlah cicilan perbulan senilai Rp" + Math.round(cicilan));
    }
}
