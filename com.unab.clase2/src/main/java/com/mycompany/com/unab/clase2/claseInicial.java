/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.com.unab.clase2;

/**
 *
 * @author USUARIO
 */
public class claseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
    Libros libro1 =new Libros(1,"POO",800,"Ing.william");
    Libros libro2= new Libros (2,"Fundamentos de Programacion",900,"Ing.Catalino");
    
    
    libro1.setNumeroPajina(1000);
    
        if (libro1.getNumeroPajina()< libro2.getNumeroPajina()) {
            System.out.println("El libro 2 tiene  mayor numero de pajinas que el Libro 1, El libro 2 tiene un numero de pajinas de "+libro2.getNumeroPajina()); 
            System.out.println("La informacion del libro 2 es : "+libro2.toString());
        }
        else{
            System.out.println("El libro 1 tiene mayor numero de pajinas que el libro 2, El libro 1 tiene un numero de pajinas de "+libro1.getNumeroPajina()); 
            System.out.println("La informacion del libro 1 es: "+libro1.toString());
        }
    }
    
}
