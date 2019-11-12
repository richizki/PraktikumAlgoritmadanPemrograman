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
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    
public class Pendahuluan1 {
    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String nama, nim;
    try {
        System.out.print("Masukkan Nama kamu : ");
        nama = input.readLine();
        System.out.print("Masukkan NIM kamu : ");
        nim =input.readLine();
    } catch (IOException e) {
        System.out.println(e);
    }
    }
    
}
