/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsandqueues;

/**
 *
 * @author pc
 */
public class KendiCollectionumuz {
    public static void main(String[] args) {
        String[] k={"Radyo Fenomen","Radyo Viva","Trt Fm","Ahaber Radyo","Trt Haber","Kral Pop"};
        Radyo r=new Radyo(k);
        for (String string : r) {
            System.out.println(string);
        }
    }
}
