/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsdudew;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
public class AnaEkran extends JFrame{

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
    public static void main(String[] args) {
        GrafikKullanimi grafik=new GrafikKullanimi();
        AnaEkran ekran=new AnaEkran("Grafik Kullanımı");
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(600,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.add(grafik);
    }

    private void add(GrafikKullanimi grafik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
