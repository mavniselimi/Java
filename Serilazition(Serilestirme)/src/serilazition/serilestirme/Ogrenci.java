/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilazition.serilestirme;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Ogrenci implements Serializable{
    private static final long serialVersionUID=1000;
    private String isim;
    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + "isim=" + isim + ", id=" + id + ", bolum=" + bolum + '}';
    }
    
}
