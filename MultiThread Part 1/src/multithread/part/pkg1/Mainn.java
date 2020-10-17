/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.part.pkg1;

/**
 *
 * @author pc
 */
public class Mainn {
    public static void main(String[] args) {
        
        NewClass newClass=new NewClass();
        /*long baslangic=System.currentTimeMillis();
        newClass.degerata();
        long bitis=System.currentTimeMillis();
        System.out.println("Geçen Milli Saniye==>"+((double)((bitis-baslangic))));*/
        newClass.calis();
    }
}
