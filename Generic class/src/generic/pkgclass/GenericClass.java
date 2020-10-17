/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.pkgclass;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        toplama(10, 20, 30);///**/
        /**/
        ArrayList<String> arrayList=new ArrayList<String>();
        ArrayList<Integer> arrayList1=new ArrayList<Integer>();
        Character[] chardizi={'J','A','V','A'};
        Integer[] integers={1,2,3,4,5,6,7,8,9,10,11,12};
        Ogrenci[] ogrencis={new Ogrenci("Abdülkadir"),new Ogrenci("Mustafa")};
        CharClass.yazdir(chardizi);
        IntegerYazdir.yazdir(integers);
        OgrenciYazdir.yazdir(ogrencis);
        YazdirmaSinifi<Character> yazdirmaSinifi=new YazdirmaSinifi<Character>();
        yazdirmaSinifi.yazdir(chardizi);
    
    }
    public static void toplama(int a,int b,int c){
        System.out.println((a+b+c));
    }
}
