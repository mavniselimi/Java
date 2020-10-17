/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar.uygulamasi;

/**
 *
 * @author pc
 */
public class Calisan {
    private int id ;
    private String ad;
    private String soyad;
    private String maas;
    private String email;

    public Calisan(int id, String ad, String soyad, String maas,String email) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
    
}
