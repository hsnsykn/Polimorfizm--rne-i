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
public class TestHucre {

    public static void main(String[] args) {
        Hucre mitokondri = new Mitokondri(" x hücresi");
        Hucre ribozom = new Ribozom(" y hücresi ");
        Hucre cekirdek = new Cekirdek(" z hücresi ");
        Hucre golgi = new Golgi(" t hücresi ");

        System.out.println(mitokondri.gorevi());
        System.out.println(ribozom.gorevi());
        System.out.println(cekirdek.gorevi());
        System.out.println(golgi.gorevi());
    }
}
