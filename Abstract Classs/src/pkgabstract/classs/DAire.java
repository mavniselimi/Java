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
public class DAire extends Sekil{
    private double yaricap;
    public DAire(String isim,double yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alanhesapla() {
        System.out.println(getIsim()+" alanı "+(yaricap*yaricap*(Math.PI))+" dir");
    }
    
}
