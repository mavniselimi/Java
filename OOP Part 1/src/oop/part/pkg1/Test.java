/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg1;

import javax.swing.text.PasswordView;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        /*Araba araba1=new Araba();/*
        araba1.renk="Kırmızı";
        araba1.kapilar=4;
        araba1.tekerlekler=4;
        araba1.motor="16V";
        araba1.model="Renault";*//*
        araba1.setModel("Renault");
        araba1.setKapilar(-2);
        System.out.println(araba1.getModel());
        Araba araba2=new Araba();
        araba2.setRenk("Kırmızı");
        System.out.println(araba2.getRenk());*/
        /*Account account1=new Account();
        account1.setBakiye(1300);
        account1.setEmail("alkanfb45@gmail.com");
        account1.setHesapNo("1364adv");
        account1.setIsim("Abdülkadir");
        account1.setTelefonNo("05379218597");
        System.out.println("Bakiye==>"+account1.getBakiye());
        account1.para_cekme(1600);
        account1.para_cekme(1400);
        account1.para_cekme(1200);
        account1.para_yatir(1200);
        account1.getBakiye();*/
        Account account3=new Account("203", 1300, "Abdülkadir", "alkanf45@gmail.com", "05379218597");
        Account account4=new Account();
        Account account7=new Account("Uğur Alkan","ualkan45@gmail.com","05058016461");
        System.out.println(account4.getBakiye());
        System.out.println(account7.getTelefonNo());
        account7.bilgi_goster();
    }
}
