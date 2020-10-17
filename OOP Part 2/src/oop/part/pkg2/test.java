package oop.part.pkg2;
public class test{
    //terapi
    public static void main(String[] args) {
        Resuliton resuliton=new Resuliton(61.4,44.4);
        Monitor monitor=new Monitor("James Donkey", "JD27FG1MS144", "Full Hd", 27, resuliton);
        Kasa kasa=new Kasa("Corsair Carbide Spec-Delta RGB 550W 80+ Mid Tower", "Corsair", 4);
        Anakart anakart=new Anakart("H310M-S2V ", "Gigabyte",10,"Windows 10 Pro", "i5-9400f", "Zotac Rtx 2060");
        pc pc=new pc(monitor, anakart, kasa);
        pc.getKasa().pc_ac();
        Abone abone=new Abone();
        abone.isim="Abdülkadir";
        abone.bakiye=300;
        abone.sehir="Manisa";
        abone.doğalgaz_kullan(30);    
    }
}