/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author pc
 */
public class LinkedList {
    public static void StrLinkedListBastir(LinkedList<String> s) {
       /* for (String string : s) {
            System.out.println(string);
        }*/
        ListIterator<String> iterator=s.listIterator();
        String a="5451";
        while (iterator.hasNext()) { 
            System.out.println(iterator.next());
        }
        
    }
    public static void main(String[] args) {
        /*ASsdsdlslfsaf
        fsaksfksaflsaf
        aslfsmalamdlamd
        sflmlsfmslfsasdsdam*/
        ArrayList<String> diller=new ArrayList<String>();
        diller.add("Java"); diller.add("PHP");diller.add("Python");
        for (int i = 0; i <diller.size(); i++) {
            System.out.println(diller.get(i));
        }
        diller.forEach((string) -> {
            System.out.println(string);
        });
        diller.add(1,"C++");
        diller.forEach((string) -> {
            System.out.println(string);
        });
        
        LinkedList<String> turistikmekanlar =new LinkedList<String>();
        turistikmekanlar.add("Eşme");
        turistikmekanlar.add("Selcuk");
        turistikmekanlar.add("Göbeklitepe");
        StrLinkedListBastir(turistikmekanlar);
        
        
        
    }
}
