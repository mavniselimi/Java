
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class ReadNiggaRead {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("dosya.txt");
            int ab;
            String abe="";
            while ((ab= fis.read())!=-1) {                
                abe +=(char)ab;
            }
            System.out.println("Metin===>"+abe);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            Logger.getLogger(ReadNiggaRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if (fis!=null){  
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ReadNiggaRead.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
