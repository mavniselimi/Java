/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg2;
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
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
    public String KOnus(){
        return "Hayvan Konuşuyor";
    }
    
}
class kedi extends Hayvan{
    
    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String KOnus() {
        return this.getIsim()+" miyavlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Kopek extends Hayvan{
    
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String KOnus() {
        return this.getIsim()+" havlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
class At extends Hayvan{
    
    public At(String isim) {
        super(isim);
    }

    @Override
    public String KOnus() {
        return this.getIsim()+" kişniyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
/**
 *
 * @author pc
 */
public class Main {
    public static void konustur(Object object) {
        //System.out.println(object.KOnus());
        if (object instanceof Kopek){
            Kopek kopek=(Kopek) object;
            System.out.println("Bu bir köpek ve "+kopek.KOnus());
        }
        else if(object instanceof kedi){
            kedi kedi=(kedi) object;
            System.out.println("Bu bir kedi ve "+kedi.KOnus());
        }
        else if (object instanceof  At) {
            At at=(At) object;
            System.out.println("Bu bir at ve "+at.KOnus());
        }
    }
    public static void main(String[] args) {
        Hayvan hayvan=new kedi("Mortiz");
        System.out.println(hayvan.KOnus());
        if (hayvan instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından");
        }
        Kopek kopek=new Kopek("Karabaş");
        kedi kedi=new kedi("Mortiz");
        At at=new At("Şahbatur");
        konustur(kedi);
    }
}
