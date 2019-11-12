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
import javax.swing.JOptionPane;

public class Pendahuluan2 {
    public static void main(String[] args) {
        String Nama, NIM;
        
        Nama = JOptionPane.showInputDialog("Masukkan Nama :");
        NIM = JOptionPane.showInputDialog("Masukkan NIM : ");
        
        JOptionPane.showMessageDialog(null, Nama);
        JOptionPane.showMessageDialog(null, NIM);
        
        
    }
    
}
