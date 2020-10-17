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

public class Account {
    private String HesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    public Account(){
        //this.HesapNo="Bilgi Yok";this.bakiye=0.0;this.isim="Bilgi Yok";this.email="Bilgi Yok";this.telefonNo="Bilgi Yok";
        this("Bilgi Yok", 0.0, "Bilgi Yok", "Bilgi Yok", "Bilgi Yok");
    }
    public Account(String HesapNo,double bakiye,String isim,String email,String telefonNo){
        this.HesapNo=HesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
    }
    public Account(String isim,String email,String telefonNo){
        /*this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
        
        this.bakiye=0.00;
        this.HesapNo="\"Bilgi Yok\""
        */
        this("Bilgi Yok",0.00,isim,email,telefonNo);
    }
    public void para_yatir(double miktar){bakiye+=miktar;System.out.println("Yeni bakiye==>"+bakiye);}
    public void para_cekme(double miktar){if (miktar<1500 && bakiye>miktar) {bakiye-=miktar;System.out.println("Para Başarıyla Çekildi yeni bakiye==>"+bakiye);}else{if(miktar>bakiye){System.err.println("Yetersiz Bakiye");}else if(miktar>1500){System.err.println("1500 liradan fazla çekemezsiniz");}}}
    public void bilgi_goster(){
        System.out.println("İsim==>"+this.isim);
        System.out.println("Email==>"+this.email);
        System.out.println("Telefon No==>"+this.telefonNo);
        System.err.println("\nHesap NO==>"+this.HesapNo);
        System.err.println("Bakiye==>"+this.bakiye);
    
    }
    /**
     * @return the HesapNo
     */
    public String getHesapNo() {
        return HesapNo;
    }

    /**
     * @param HesapNo the HesapNo to set
     */
    public void setHesapNo(String HesapNo) {
        this.HesapNo = HesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
