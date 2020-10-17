/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class JavaInputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream fos=null;
        //File file=new File("Dosya.txt");
        try {
            fos=new FileOutputStream("dosya.txt");
            fos.write(65);
            fos.write(66);
            String a=" Abdulkadir Alkan";
            byte[] s_array=a.getBytes();
            fos.write(s_array);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaInputOutput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaInputOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(JavaInputOutput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
