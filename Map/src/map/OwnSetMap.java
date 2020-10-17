/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Player implements Comparable<String>{
    private String isim;
    private static int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.isim);
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(String o) {
        if (this.id<Player.id) {
            return -1;
        }
 //To change body of generated methods, choose Tools | Templates.
        else if((this.id>Player.id)){
            return 1;
        }
        return 0;
    }
    
    
}
/**
 *
 * @author pc
 */
public class OwnSetMap {
    public static void main(String[] args) {
        Set<String> haSet=new HashSet<>();
        haSet.add("C++");
        haSet.add("Java");
        haSet.add("C#");
        for (String string : haSet) {
            System.out.println(string);
        }
        Set<Player> et=new HashSet<>();

        Player player1=new Player("Abdülkadir", 1);
        Player player2=new Player("Efe",2);
        Player player3=new Player("Eren",3);
        Player player4=new Player("Yasin",4);
        Player player5=new Player("Yasin",4);
        et.add(player1);
        et.add(player2);
        et.add(player3);
        et.add(player4);
        et.add(player5);
        for (Player next : et) {
            System.out.println(next);
        }
    }
}
