/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınner.pkgclass.non.pkgstatic;

/**
 *
 * @author pc
 */
public class InnerClassNonStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here*//**/
        Matematik.Factorial factorial;
        factorial = new Matematik().new Factorial();
        factorial.faktorial();
        Matematik.Asal asal=new Matematik().new Asal();
        for (int i = 0; i < 999; i++) { 
            System.out.println(i+" sayısı asal mı? "+asal.asalmi(i));
        }
        MatematikV2.Alan alan= new MatematikV2.Alan();
        alan.dairealan(50);
        class Alan{
            public void dairealan(int yaricap){
            System.out.println("Dairenin Alani==>"+(yaricap*yaricap*Math.PI));
            }
        }
        Alan alan1=new Alan();
        alan1.dairealan(42);
    }
    public static void deneme(){
    }
}
