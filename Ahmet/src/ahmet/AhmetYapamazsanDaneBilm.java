/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmet;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AhmetYapamazsanDaneBilm {
    public static void main(String[] args) {
        Scanner darienini = new Scanner(System.in);
        int yaricap = darienini.nextInt();
        System.out.println("Dairenin cevresi==>"+(2*Math.PI*yaricap));
        
    }
}
