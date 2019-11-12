/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ichie
 */
public class Nomor1_2 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int pertama = 0, kedua = 0, ketiga = 0;

        try {
            System.out.print("Masukkan Nilai Pertama \t= ");
            pertama = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai Kedua \t= ");
            kedua = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai Ketiga \t= ");
            ketiga = Integer.parseInt(dataIn.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Nilai yang dimasukkan \t= " + pertama + ", " + kedua + ", " + ketiga);
        if (pertama > kedua && pertama > ketiga) {
            System.out.println("Nilai Terbesar adalah " + pertama);
        } else if (kedua > pertama && kedua > ketiga) {
            System.out.println("Nilai Terbesar adalah " + kedua);
        } else {
            System.out.println("Nilai Terbesar adalah " + ketiga);
        }
        
        if (ketiga < kedua && ketiga < pertama) {
            System.out.println("Nilai Terkecil adalah " + ketiga);
        } else if (kedua < ketiga && kedua < pertama) {
            System.out.println("Nilai Terkecil adalah " + kedua);
        } else {
            System.out.println("Nilai Terkecil adalah " + pertama);
        }
        
    }

}
