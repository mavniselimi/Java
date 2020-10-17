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
public class KapsamSinifi {
    private int privateDegisken=30;
    public KapsamSinifi(){
        System.out.println("private değişken "+privateDegisken);
    }
    /**
     * @param args the command line arguments
     */
     public void onileCarp(){
         int privateDegisken=10;
         for (int i = 1; i < 6; i++) {
             System.out.println(i+"*"+this.privateDegisken+" = "+(i*this.privateDegisken));
         }
     }
}
