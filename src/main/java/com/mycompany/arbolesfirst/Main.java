/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolesfirst;

import java.util.*;
public class Main {



    public static void main(String[] args) {
        
        /////Tabla donde se almacenara todo los registros
        Arbol arbolit=new Arbol();
        /////
        Scanner input=new Scanner(System.in);
        int n=2;///variable para que entre en bucle el menu, hasta que cambie su valor
        int boton;///opcion del switch 
        int id=0;///un simple contador, id persona y del nodo son lo mismo, porque no hay eliminar 
        System.out.println("##############################################################");
        System.out.println("Bienvenido Dios, aqui puedes crear o eliminar personas a su gusto");
        System.out.println("##############################################################");
        
        while(n==2){
            intro();
            boton=input.nextInt();
            input.nextLine();
            switch(boton){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
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
        System.out.println("2:Eliminar");
        System.out.println("3:Mostrar");
        System.out.println("4:Cerrar");
        System.out.println("##############################################################");
}
    }