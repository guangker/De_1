/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

public class LaiXe implements Serializable{
    private int id;
    private String name;
    private String address;
    private String level;
    private static int sId = 10000;

    public LaiXe(int id, String name, String address, String level){
        this.id=id;
        this.name=name;
        this.address=address;
        this.level =level;
    }
    public LaiXe(){
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getLevel(){
        return level;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public int getsId(){
        return sId;
    }

}
