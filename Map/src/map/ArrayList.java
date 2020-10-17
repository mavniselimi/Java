/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author pc
 */
public class ArrayList {
    public static void main(String[] args) {
       /* List<String> list_List= new java.util.ArrayList<>();
        list_List.add("Java");
        list_List.add("C++");
        list_List.add("C#");
        Collections.sort(list_List);
        for (String string : list_List) {
            System.out.println(string);
        }*/
       List<Player> listPlayers=new java.util.ArrayList<>();
       listPlayers.add(new Player("Yasin", 4));
       listPlayers.add(new Player("Efe", 2));
       listPlayers.add(new Player("Abdülkadir",1));
        System.out.println(listPlayers);
        //Collections.sort(listPlayers);
    }
}
