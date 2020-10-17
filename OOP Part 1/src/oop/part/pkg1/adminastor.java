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
public class adminastor extends employee{//subclass
    private int adminlik_Seviyesi;
    public adminastor(String isim,int maas,String departman,int adminlikseviyesi){
        super(isim, maas, departman, true, adminlikseviyesi);
        this.adminlik_Seviyesi=adminlik_Seviyesi;
        
    }
    public void zam_yap(int zam_miktarı){
        System.out.println(zam_miktarı+" tl zam yapıldı");
    }
}
