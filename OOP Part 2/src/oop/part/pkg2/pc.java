/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg2;

/**
 *
 * @author pc
 */
public class pc {
    private Monitor monitor;
    private Anakart anakart;
    private Kasa kasa;

    public pc(Monitor monitor, Anakart anakart, Kasa kasa) {
        this.monitor = monitor;
        this.anakart = anakart;
        this.kasa = kasa;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
    
}
