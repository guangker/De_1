/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

public class BangPhanCong implements Serializable {
    private LaiXe driver;
    private Tuyen buses;
    private int turns;

    public BangPhanCong() {
    }

    public BangPhanCong(LaiXe driver, Tuyen buses, int turns) {
        this.driver = driver;
        this.buses = buses;
        this.turns = turns;
    }

    public LaiXe getDriver() {
        return driver;
    }

    public void setDriver(LaiXe driver) {
        this.driver = driver;
    }

    public Tuyen getBuses() {
        return buses;
    }

    public void setBuses(Tuyen buses) {
        this.buses = buses;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }
}