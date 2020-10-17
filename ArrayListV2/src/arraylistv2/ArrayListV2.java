/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ArrayListV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* ArrayList<String> arraylist=new ArrayList<String>();*/
                ArrayList<Integer> arraaylist=new ArrayList<Integer>();

        //null
        /*arraylist.add("Hag");
        List<String> list=new ArrayList<String>();
        list.add("C++");
        list.add("C#");
        list.add("Python");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*************************");
        list.forEach((string) -> {
            System.out.println(string);
        });
        System.out.println("*************************");*/
        /*LinkedList<String> linkedList=new LinkedList<String>();*/
        LinkedList<Integer> lainkedList=new LinkedList<Integer>();

        /*linkedList.add("C++");
        linkedList.add("C#");
        linkedList.add("Python");
        linkedList.forEach(string ->{System.out.println(string);});*/
        zamanhesapla("LinkedList", lainkedList);
        //zamanhesapla("ArrayList", arraaylist);
    }

    /**
     *
     * @param veri_tipi
     * @param list
     */
    public static void zamanhesapla(String veri_tipi,List<Integer> list) {
        long ba;
        long bi;
        ba=System.currentTimeMillis();
        
        for (int i = 0; i < 10000000; i++) {
            list.add(0,i);
        }
        bi=System.currentTimeMillis();
        System.out.println(veri_tipi+" ekleme süresi "+(bi-ba)+" ms");
    }
}
