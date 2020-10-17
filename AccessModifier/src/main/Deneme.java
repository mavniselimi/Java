/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accessmodifier.Araba;
import accessmodifier.HAyvan;

/**
 *
 * @author pc
 */
public class Deneme {
    public static void main(String[] args) {
        Araba araba=new Araba();
       // System.out.println(araba.modeL);
        At hAyvan = new At("Şahbatur");
        //System.out.println(hAyvan.isim);
        hAyvan.ismimiSoyle();
    }
}
