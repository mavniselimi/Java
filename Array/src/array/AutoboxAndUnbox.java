/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class AutoboxAndUnbox {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        ArrayList<Integer> arrayList1=new ArrayList<Integer>();
        arrayList1.add(15);
        for (int i = 0; i < 10; i++) {
            arrayList1.add(Integer.valueOf(i*5));
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i).intValue());
            
        }
        String a="Abdülkadir";
        String b= new String("Abdülkadir");
        System.out.println(b+" kelimesinin Uzunluğu===>"+b.length());
        if (a.endsWith("ir")) {
            System.err.println("SADsad");
        }
    }
}
