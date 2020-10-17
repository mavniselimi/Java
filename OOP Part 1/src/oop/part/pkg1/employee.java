/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg1;

/**
 *
 * @author pc
 */
public class employee {//superclass
    private String isim;
    private int maas;
    private String departman;
    private boolean aktif_pasif;
    private int calisilansaat;
    int classexstramoney=20;
    public employee(String isim,int maas,String departman,boolean aktif_pasif,int calisilansaat){
        this.calisilansaat=calisilansaat;
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
        this.aktif_pasif=aktif_pasif;
    }
    
    public boolean calısabilirlik(){
        boolean yesno;
        yesno=this.aktif_pasif;
        return yesno;
    }
    public void calis(int calisilacaksaat) {
        this.calisilansaat+=calisilacaksaat;
        System.out.println("Bu Hafta Ekstra Çalıştığınız Saat Sayısı==>"+calisilansaat);        
        System.out.println("Bu Hafta Ekstra Çalıştığınız Saat Sayısına Göre Ekstra Alacağınız Ücret==>"+calisilansaat*classexstramoney);

    }
    public void bilgilerigoster(){
        System.out.println("Adınız==>"+isim);
        System.out.println("Brüt Maaşınız==>"+maas);
        System.out.println("Çalıştığınız Departman==>"+departman);
        System.out.println("Çalışılabilirlik Durumunuz==>"+aktif_pasif);
    }
    public void departman_degistir(String yeni_departman){
        String gecici=departman;
        this.departman=yeni_departman;
        System.out.println("Eski Depertman==>"+gecici+"\nYeni Departman==>"+departman);
    }
}
