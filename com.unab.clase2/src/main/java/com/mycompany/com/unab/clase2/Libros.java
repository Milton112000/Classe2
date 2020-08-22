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
public class Libros {
    private int id;
    private String nombrelibro;
    private int numeroPajina;
    private String autor;
    
public Libros(int id, String nombreLibro, int numeroPajina, String autor){
this.id=id;
this.nombrelibro=nombreLibro;
this.numeroPajina=numeroPajina;
this.autor=autor;


}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

   

    public int getNumeroPajina() {
        return numeroPajina;
    }

    public void setNumeroPajina(int numeroPajina) {
        this.numeroPajina = numeroPajina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "id=" + id + ", nombre=" + nombrelibro + ", numeroPajina=" + numeroPajina + ", autor=" + autor + '}';
    }
    

}
