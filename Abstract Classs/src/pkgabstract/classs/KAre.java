/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.classs;

/**
 *
 * @author pc
 */
public class KAre extends Sekil{
    private int kenar;
    public KAre(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alanhesapla() {
        System.out.println(getIsim()+" alanı "+(kenar*kenar)+" dir");
    }
    
}
