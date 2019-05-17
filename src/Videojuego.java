/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Videojuego {
    
    String titulo, genero, compañia;
    int horasestimadas = 10;
    boolean prestado = false;
    
    public Videojuego(String titulo, String genero, String compañia){
        this.titulo=titulo;
        this.genero=genero;
        this.compañia=compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int gethorasestimadas() {
        return horasestimadas;
    }

    public void sethorasestimadas(int horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

    public boolean isPrestado() {
        return prestado;
    }
//    
    public boolean alquilar(){
        return this.prestado=true;
    }
    
    public boolean devolver(){
        return this.prestado=false;
    }
    
    public boolean isEntregado(){
        if(this.prestado==true){
            return prestado;
        }else{
            return prestado;
        }
    }
}
