/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class HAfıza_Oyunu_Maim {
    //ekranı temizleme Runtime.getRuntime().exec("cls");
    //zamanlı bekletme kodu Thread.sleep(50);
    private static Hafıza_Oyunu[][] kartlar=new Hafıza_Oyunu[4][4];
    public static void main(String[] args){
        kartlar[0][0] = new Hafıza_Oyunu('E');
        kartlar[0][1] = new Hafıza_Oyunu('A');
        kartlar[0][2] = new Hafıza_Oyunu('B');
        kartlar[0][3] = new Hafıza_Oyunu('F');
        kartlar[1][0] = new Hafıza_Oyunu('G');
        kartlar[1][1] = new Hafıza_Oyunu('A');
        kartlar[1][2] = new Hafıza_Oyunu('D');
        kartlar[1][3] = new Hafıza_Oyunu('H');
        kartlar[2][0] = new Hafıza_Oyunu('F');
        kartlar[2][1] = new Hafıza_Oyunu('C');
        kartlar[2][2] = new Hafıza_Oyunu('D');
        kartlar[2][3] = new Hafıza_Oyunu('H');
        kartlar[3][0] = new Hafıza_Oyunu('E');
        kartlar[3][1] = new Hafıza_Oyunu('G');
        kartlar[3][2] = new Hafıza_Oyunu('B');
        kartlar[3][3] = new Hafıza_Oyunu('C');
        oyunTahtası();
        for (int i = 0; i < 50; i++) {
            
            try { 
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(HAfıza_Oyunu_Maim.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("\b");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Kaçıncı süturun haçıncı satırındaki ile Kaçıncı Süturun Kaçıncı Staırındaki aynı?(Lütfen Önce ilkini sonra ikincisini giriniz)");
        int a,b,c,d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if (kartlar[a-1][b-1].getDeger()==kartlar[c-1][d-1].getDeger()) {
            System.out.println("Tebrikler Doğru bildiniz");
            kartlar[a-1][b-1].setDeger('X');
            kartlar[c-1][d-1].setDeger('X');
        }
        while (( kartlar[0][1].getDeger()=='X' && kartlar[0][2].getDeger()=='X' && kartlar[0][0].getDeger()=='X' && kartlar[0][3].getDeger()=='X' && kartlar[1][0].getDeger()=='X' && kartlar[1][1].getDeger()=='X' && kartlar[1][2].getDeger()=='X' && kartlar[1][3].getDeger()=='X' && kartlar[2][0].getDeger()=='X' && kartlar[2][1].getDeger()=='X' && kartlar[2][2].getDeger()=='X'&& kartlar[2][3].getDeger()=='X' && kartlar[3][0].getDeger()=='X' && kartlar[3][1].getDeger()=='X' && kartlar[3][2].getDeger()=='X' && kartlar[3][3].getDeger()=='X' )==false) {            
            oyunTahtası();
        for (int i = 0; i < 25; i++) {
            
                try { 
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HAfıza_Oyunu_Maim.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        for (int i = 0; i <120; i++) {
            System.out.println("\b");
        }
        System.out.println("Lütfen Kaçıncı süturun haçıncı satırındaki ile Kaçıncı Süturun Kaçıncı Staırındaki aynı?(Lütfen Önce ilkini sonra ikincisini giriniz)");
       
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if (kartlar[a-1][b-1].getDeger()==kartlar[c-1][d-1].getDeger()) {
            System.out.println("Tebrikler Doğru bildiniz");
            kartlar[a-1][b-1].setDeger('X');
            kartlar[c-1][d-1].setDeger('X');
        }
        }
        System.out.println("Tebrikler Oyunu Kazandınız!");
        oyunTahtası();
    }
    public static void oyunTahtası() {
        for (int i = 0; i < 4; i++) {
            System.out.println("______________________");
            for (int j = 0; j < 4; j++) {
                if(kartlar[i][j].isTahmin()){
                    System.out.print("|"+kartlar[i][j].getDeger()+"|");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
            System.out.println("______________________");
    }
}
