/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author pc
 */
public class KapsamSinifi2 {
    private int p=30;
    public KapsamSinifi2(){
        
    }
    public class DahiliSinif{
        public void onilecarp(){
            for (int i = 1; i < 10; i++) {
                System.out.println(i+"*"+p+"="+(i*p));
            }
        }
    }
}
