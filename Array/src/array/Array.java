/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Array {

    public static void intarraybastir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Arrayın "+(i+1)+".elementi==>"+a[i]);
        }
        
    }
    public static int[] arraydoldur(int a){
        int[] h= new int[a];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            h[i]=scanner.nextInt();
        }
        return h;
    }
    public static void array_sort(int[] a){
        int k=0;
        while (k<4) {  
            for (int i = 0; i < a.length-1; i++) {
            
                for (int j = 0; j <a.length-1; j++) {
                
                    int gecici=a[i];
                    if(i >= a.length){
                    }
                    else if(a[i]>a[(i)+1]){
                        a[i]=a[i+1];
                         a[i+1]=gecici;
                    }
                }
            }          
            k+=1;
        }
    }
    public static void main(String[] args) {
        //int[] a=new int[10];
        //double[] b;
       /* a[5]=32;
        a[9]=50;*/
        /*for (int i = 0; i < 10; i++) {
            a[i]=i*25*6-52/2;
            System.out.println(a[i]);
        }*/
        int[] h= arraydoldur(4);
        array_sort(h);
        intarraybastir(h);
        String[][] carpimtablosu=new String[11][11];
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                carpimtablosu[i][j]=(String)(i+"*"+j+"="+i*j);
            }
        }
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.err.println(carpimtablosu[i][j]);
            }
        }
        String[] array={"Selam","Canım","Ben","Amcanım"};
        for (String string : array) {
            System.out.println(string);
        }
    }
    
}
