/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.*;

/**
 *
 * @author pc
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>(); 
        hashMap.put(10,"Java");
        hashMap.put(50,"Python");
        hashMap.put(20,"Php");
        System.out.println(hashMap);
        System.out.println(hashMap.get(50));
        for (java.util.Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Anahtar :"+entry.getKey()+" --------> Değer: "+entry.getValue());
            
        }
    }
    
}
