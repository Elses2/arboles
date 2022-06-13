/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesfirst;

/**
 *
 * @author elses
 */
public class Persona {
    private int id;
    private String name;
    private int edad;
    private boolean inscripto;
    
    
    public Persona(String name,int edad,int id){
    
        this.id=id;
        this.name=name;
        this.edad=edad;
        this.inscripto =true;
    
    }
    public String getName(){
        return this.name;
    }
    
    public int getEdad(){
    
    return this.edad;
    
    }
    public int getId(){
        return this.id;
    
    }
    
    public void setName(String name){
        
        this.name=name;
    }
    
    public void setId(int id){
        this.id=id;
    
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    @Override
    ///simplemente para implementarlo
    public String toString(){
        return "persona";
    }
}
