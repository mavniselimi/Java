/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author pc
 */
public class Seyirci {
    private String isim;
    
    private static int seyirci_sayisi=0;
    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void oyunseyret() {
        System.out.println(isim+" Oyun Seyrediyor");
    }

    /**
     * @return the seyirci_sayisi
     */
    public static int getSeyirci_sayisi() {
        return seyirci_sayisi;
    }
    
}
