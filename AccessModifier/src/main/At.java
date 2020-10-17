/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accessmodifier.HAyvan;

/**
 *
 * @author pc
 */
public class At extends HAyvan {
    
    public At(String isim) {
        super(isim);
    }
    public  void ismimiSoyle(){
        System.out.println(super.isim);
    }
}
