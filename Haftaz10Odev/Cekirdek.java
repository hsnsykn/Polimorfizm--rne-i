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
public class Cekirdek extends Hucre{

    public Cekirdek(String isim) {
        super(isim);
    }
    @Override
    public String gorevi(){
        return this.getIsim()+" Hücre İşlevini Kontrol Eder ";
    }
}
