/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg1;

/**
 *
 * @author pc
 */
public class Araba {
    
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        if(kapilar>0){this.kapilar = kapilar;}
        else if(kapilar<0){System.err.println("Kapılar "+kapilar+" adet olamaz" );}
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
}
