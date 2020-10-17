/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessmodifier;

/**
 *
 * @author pc
 */
public class AccessModifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba araba=new Araba();
        System.out.println(araba.modeL);
        HAyvan hAyvan = new HAyvan("Şahbatur");
        System.out.println(hAyvan.isim);
    }
    
}
