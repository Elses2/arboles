/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesfirst;

/**
 *
 * @author elses
 */
public class Nodo {
    private Nodo siguiente, anterior; ///siguiente(derecho) anterior(izquierdo)
    private Object info; 
    
    public Nodo(Object info){
        siguiente=anterior=null;
        this.info=info;
    
    }
    public Nodo(){
        siguiente=anterior=null;
        info=null;
    }

  
    public Nodo getSiguiente() {
        return siguiente;
    }

   
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

  
    public Nodo getAnterior() {
        return anterior;
    }

   
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

  
    public Object getInfo() {
        return info;
    }

   
    public void setInfo(Object info) {
        this.info = info;
    }
    
    
    
}
