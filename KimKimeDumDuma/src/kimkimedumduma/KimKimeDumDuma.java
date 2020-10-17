/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kimkimedumduma;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pc
 */
public class KimKimeDumDuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] teams={"Arsenal","Liverpool","Chelsea","Manchester City","Manchester United","Totenham"};
        String[] coachs={"Abdülkadir","Efe","Eren","Murat","Yasin","Burak"};
        Random r=new Random();
        ArrayList<String> t=new ArrayList<>();
        ArrayList<String> c=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            t.add(i,teams[i]);c.add(i,coachs[i]);
        }
        while (!t.isEmpty()) {
            int u=r.nextInt(t.size()),i=r.nextInt(c.size());
            System.out.println(t.get(u)+" nolu takım "+c.get(i)+" adlı menajere gitti");
            t.remove(u);c.remove(i);
        }//Agalar sa şu an size random olduğunu göstermelik bir defa çalıştırcam
        //Şimdi gerçekten çalıştırcam
    }
    
}
