/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesfirst;

/**
 *
 * @author edwdwdwdwlses
 */
public class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
        raiz=null;
    }
    public Arbol(Nodo raiz){
        this.raiz=raiz;
    }
    public static Nodo crearSegmento(Nodo anterior, Object info,Nodo siguiente){
        ///derecha izquierda info(parametros del constructor)
        return new Nodo(siguiente,anterior,info);
    }
    public boolean isEmty(){
        if(raiz==null){
            return true;
        }
        else{
            return false;
        }
       
    
    }
    
}
