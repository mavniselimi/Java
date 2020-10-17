/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author pc
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Imuhendis muhendis1=new Imuhendis();
        PublicClass muhendis1=new PublicClass(false, false);
        muhendis1.askerlik_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(4.51));
        String[] array={"Vestel","Havelsan","Turkcell"};
        muhendis1.is_tecrubesi(array);
        
    }
    
}
