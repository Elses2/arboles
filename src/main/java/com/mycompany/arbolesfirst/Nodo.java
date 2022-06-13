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
    private Nodo derecha, izquierda,padre; ///siguiente(derecho) anterior(izquierdo)
    private Object info; 
    private int llave;
    
    public Nodo(){
        derecha=izquierda=padre=null;
        info=null;
    }
    public Nodo(Nodo seguiente,Nodo anterior,Nodo padre, Object info){
        this.izquierda=anterior;
        this.derecha=derecha;
        this.padre=padre;
        this.info=info;
    
    }
    public Nodo(int indice){
        llave = indice;
        derecha=null;
        izquierda=null;
        padre=null;
        info=null;
    }
    
    public Nodo getDerecha() {
        return derecha;
    }

    
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    
    public Nodo getIzquierda() {
        return izquierda;
    }

    
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

 
    public Nodo getPadre() {
        return padre;
    }

  
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }


    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

  
    
    
    
}
