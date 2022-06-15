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
     /// esta copiado, fruta en realidad es persona
     public void insertar(int i, Object fruta){
        Nodo n = new Nodo(i);
        n.setInfo(fruta);
        
        //SI LA RAIZ ES SNULA SIGNIFICA QUE NO HA EMPEZADO A CRECER EL ARBOL
        if (raiz==null) {
            raiz=n;
        }else{
            // DE LO CONTRARIO CREAMO UN NO AUXILIAR ARA BUSCAR EN DONDE COLOCARLO, SI A LA DER O IZQ
            Nodo aux = raiz;
            //MIENTRAS EL AUXILIAR NO SEA NULO HAGAMOS QUE EL PADRE DEL NODO SEA EL AUXILIAR,
            //ASI VAMOS SUBIENDO EN EL ARBOL
            while(aux != null){
                
                n.setPadre(aux);
                //VALIDAMOS, SI EL INDICE ES MAYOR ENTONCES VA A LA DERECHA
                if (n.getLlave() >= n.getLlave()) {
                    aux=aux.getDerecha();
                }else{
                    //SI NO VA A LA IZQUIERDA
                    aux=aux.getIzquierda();
                }
            }
            //si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            //dentro del arbol
            if (n.getLlave() < n.getPadre().getLlave()) {
                n.getPadre().setIzquierda(n);
            }else{
                n.getPadre().setDerecha(n);
            }
        }
    }
     public void recorrer(Nodo n){
        if (n != null) {
            recorrer(n.getIzquierda());
            System.out.println("Indice " +n.getLlave()+" persona " + n.getInfo().toString());
            recorrer(n.getDerecha());
        }
    }
    
}
