/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author pc
 */
public class Farklar {
    public static void mapprint(Map<Integer,String> map) {
        map.put(5, "C++");
        map.put(10, "C#");
        map.put(20,"Python");/*
        for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Anahtar :"+entry.getKey()+" --------> Değer: "+entry.getValue());
            
        }*//*
        for (Integer entry : map.keySet()) {
            System.out.println("Anahtar :"+entry+" --------> Değer: "+map.get(entry));
        }*/
        System.out.println("***********************************");
        Collection<String> collection=map.values();
        for (String string : collection) {
            System.out.println("Değer :"+string);
        }
    }
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
        Map<Integer,String> linkedhashMap=new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap=new TreeMap<Integer,String>();
        mapprint(treeMap);
        mapprint(hashMap);
        mapprint(linkedhashMap);
        
    }
}
