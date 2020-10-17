/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilazition.serilestirme;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author pc
 */
public class SerilazitionSerilestirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            Ogrenci ogrenci1=new Ogrenci("Abdülkadir",1234,"Bilgisiyar Mühendisliği");
            Ogrenci ogrenci2=new Ogrenci("Efe",1235,"Tıp Fakultesi");
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
        } catch (IOException e) {
            System.out.println("HATA 406");
        }
    }
    
}
