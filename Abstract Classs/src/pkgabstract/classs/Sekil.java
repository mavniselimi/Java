/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.classs;

/**
 *
 * @author pc
 */
public abstract class Sekil {

    /**
     * @param args the command line arguments
     */
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void isimini_soyle() {
        System.out.println("Bu obje"+ getIsim()+"objesidir.");
    }
    abstract void alanhesapla();

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    
}
