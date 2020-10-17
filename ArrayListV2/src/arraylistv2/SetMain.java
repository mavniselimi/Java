/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistv2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class SetMain {
    public static void main(String[] args) {
        Set<String> set= new HashSet<String>();
        Set<String> set2= new LinkedHashSet<String>();
        Set<String> set3= new TreeSet<String>();
        Set<String> set4= new HashSet<String>();
        set.add("Java");
        set.add("C++");
        set.add("C#");
        set.add("Python");
        /*set2.add("Java");
        set2.add("C++");
        set2.add("C#");
        set2.add("Python");
        set3.add("Java");
        set3.add("C++");
        set3.add("C#");
        set3.add("Python");*/
        set4.add("Javascript");
        set4.add("C");
        set4.add("Linux");
        set4.add("Python");
        Set<String> fark= new HashSet<String>(set4);
       /* for (String string : set4) {
            System.out.println(string);
        }
         for (String string : set3) {
        System.out.println(string);
        } for (String string : set2) {
     System.out.println(string);
 } for (String string : set) {
     System.out.println(string);
    }
        System.out.println(set2.contains("Java"));*/
        System.out.println(fark.removeAll(set));
        System.out.println(fark);
        Set<String> ortak=new HashSet<String>(set);
        System.out.println(ortak.retainAll(set2));
        System.out.println(ortak);
}}
//k