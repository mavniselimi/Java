package vectorsandqueues;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author pc
 */
public class Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Java");
        queue.offer("C++");
        queue.offer("C#");
        queue.offer("Python");
        
        while (!queue.isEmpty()) { 
            for (String string : queue) {
                System.out.println(string);
            }              
            queue.poll();
        }
    }
    
}
