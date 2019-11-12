/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ichie
 */
public class Nomor2 {

    public static void main(String[] args) {
        double gajikotor, pajak, potongan, gajibersih;
        gajikotor = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Gaji Kotor :"));
        pajak = 0.1;
        potongan = pajak * gajikotor;
        gajibersih = gajikotor - potongan;

        System.out.println("Gaji Kotor \t: Rp" + Math.round(gajikotor) + ",-");
        System.out.println("Potongan \t: Rp" + Math.round(potongan) + ",-");
        System.out.println("Gaji bersih \t: Rp" + Math.round(gajibersih) + ",-");
    }
}
