/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınner.pkgclass.non.pkgstatic;

/**
 *
 * @author pc
 */
public class Main {
    public static void main(String[] args) {
        Iogrenci ogrenci=new Iogrenci() {
            @Override
            public void derscalis() {
                System.out.println("Ders Çalışıyorum");
            }

            @Override
            public void dersegir() {
                System.out.println("Derse Giriyorum");
            }
        };
        ogrenci.derscalis();
        ogrenci.dersegir();
        
        Aogrenci ogrenci2=new Aogrenci() {
            @Override
            void kayityaptir() {
                System.out.println("Kayıt Yapılıyor");;
            }
        };
        ogrenci2.kayityaptir();
    }
   public static abstract class Aogrenci{
        abstract void kayityaptir();
        public void selamla(){
            System.err.println("Selam");
        }
    }
    public interface Iogrenci{
        void derscalis();
        void dersegir();
    }
}
