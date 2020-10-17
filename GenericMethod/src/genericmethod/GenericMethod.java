/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethod;

/**
 *
 * @author pc
 */
public class GenericMethod {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] df={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        yazdiryn(df); 
        yazdir(df);
    }
    public static <E> void yazdiryn(E[] dizi) {
        for (E e : dizi) {
            System.out.print(e+",");
        }
    }
    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.print("\n"+e+",");
        }
    }
}
