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
public class Nomor4b {

    public static void main(String[] args) {
        double a = 2, b = 2, c = 4, d = 1;
        double hasil = Math.pow(a, b);
        double hasil2 = Math.pow(c, d);
        double hasilbagi = hasil + hasil2 / hasil;
        System.out.println("2^2 + 4^1 / 2^2 = " + Math.round(hasilbagi));
    }

}
