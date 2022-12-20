/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Haftaz10Odev;

/**
 *
 * @author soyka
 */
public class TestHucre2 {
    public static void main(String[] args) {
        gorevi(new Mitokondri("A"));
        gorevi(new Ribozom("B"));
        gorevi(new Cekirdek("C"));
        gorevi(new Golgi("D"));
        
    }public static void gorevi (Hucre hucre){
            System.out.println(hucre.gorevi());
    }
}
