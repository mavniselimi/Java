/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsandqueues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author pc
 */
class Player implements Comparable<Player>{
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Player o) {
        if (this.id<o.id){
            return -1;
        }
        else if(this.id>o.id){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", id=" + id + '}';
    }
    
}
public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Player> q=new PriorityQueue<>();
        q.offer(new Player("Abdülkadir",1));
        q.offer(new Player("Eren", 41));
        q.offer(new Player("Murat", 42));
        q.offer(new Player("Nizamettin Efe", 2));
        q.offer(new Player("Yasin", 3));
        q.offer(new Player("Burak", 40));
        while (!q.isEmpty()) {
            System.out.println("Eleman Çıkarılıyor===>"+q.poll());
        }
        /*q.offer(10);
        q.offer(5);
        q.offer(2);
        q.offer(8);
        q.offer(70);/*
        for (Integer integer : q) {
            System.out.println(integer);
        }*/
        
       /* while (!q.isEmpty()) {
            System.out.println("Eleman Çıkıyor==>"+q.poll());
        }*/
    }
    
}
