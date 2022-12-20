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
public class Hucre {
    private String isim;

    public Hucre(String isim) {
        this.isim = isim;
    }
    public String gorevi (){
        return " Hücrede Görevilidir. ";
    }
    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim=isim;  
    }
    
  
    
}
