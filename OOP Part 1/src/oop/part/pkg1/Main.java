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
public class Main {
    public static void main(String[] args) {
        Account account4=new Account("Abdülkadir Alkan","alkanfb45@gmail.com","05379218597");
        account4.bilgi_goster();
        employee employee1=new employee("Furkan", 2500, "IT", true,0);
        System.out.println(employee1.calısabilirlik());
        employee1.calis(5);
        employee1.bilgilerigoster();
        employee1.departman_degistir("Sekreter");
        adminastor admin1=new adminastor("Abdülkadir", 10000, "CEO",15);
        admin1.bilgilerigoster();
        admin1.zam_yap(596);
    }
}
