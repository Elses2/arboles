/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolesfirst;

import java.util.*;
public class Main {



    public static void main(String[] args) {
        
        /////Tabla donde se almacenara todo los registros
        Arbol arbolito=new Arbol();
        /////
        Scanner input=new Scanner(System.in);
        int n=2;///variable para que entre en bucle el menu, hasta que cambie su valor
        int boton;///opcion del switch 
        int id=1000;///un simple contador, id persona y del nodo son lo mismo, porque no hay eliminar 
        int edad;///atributo de la persona
        String nombre;/// atributo de la persona
        
        System.out.println("##############################################################");
        System.out.println("Bienvenido Dios, aqui puedes crear o eliminar personas a su gusto");
        
        while(n==2){
            intro();
            boton=input.nextInt();
            input.nextLine();
            switch(boton){
                case 1:
                        System.out.println("Dime el nombre de su creacion: ");
                        nombre= input.nextLine();
                        System.out.println("Dime cuantos años de vida le piensa dar a este ser inferior");
                        edad=input.nextInt();
                        input.nextLine();
                        arbolito.insertar(id,new Persona(nombre,edad,id));
                        
                        id=id-2;
                    
                    break;
                case 2:
                   
                        
                    break;
                case 3:
                    arbolito.recorrer(arbolito.getRaiz());
                    
                    break;
                case 4:
                      System.err.println("Gracias por usarnos");
                      n=3;
                    break;
                
                default: 
                    System.out.println("opcion incorrecta");
            }
        
        
        }
        
       
    }
    public static void intro(){

        System.out.println("##############################################################");
        System.out.println("1:Ingresar");
        System.out.println("2:Eliminar, esta opcion es demaciado siniestra asi que "
                + "todavia no esta disponible");
        System.out.println("3:Mostrar");
        System.out.println("4:Cerrar");
        System.out.println("##############################################################");
}
    }