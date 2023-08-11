/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

public class Tuyen implements Serializable{
    private int id;
    private float distance;
    private int station;
    private static int sId = 1000000;

    public Tuyen(int id, float distance, int station){
        this.id =id;
        this.distance = distance;
        this.station = station;
    }

    public Tuyen(){
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public float getDistance(){
        return distance;
    }
    public void setDistance(float distance){
        this.distance = distance;
    }
    public int getStation(){
        return station;
    }
    public void setStation(int station){
        this.station = station;
    }
    public int getSid(){
        return sId;
    }
}
