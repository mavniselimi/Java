/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg2;

/**
 *
 * @author pc
 */
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;
    public void doğalgaz_kullan(int miktar){
        if (this.bakiye<0 || this.bakiye<miktar) {
            System.err.println("Yetersiz Bakiye");
        }
        else{
            this.bakiye-=miktar;
            System.out.println("Kalan Bakiye==>"+bakiye);
        }
    }
    public void bakiye_ogren(){
        System.out.println("Mevcut Bakiye==>"+bakiye);
    }
}
