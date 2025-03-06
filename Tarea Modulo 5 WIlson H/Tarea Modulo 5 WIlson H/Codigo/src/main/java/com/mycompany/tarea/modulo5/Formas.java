
package com.mycompany.tarea.modulo5;

public class Formas {
    protected String color;
    
    public Formas(String color) {
        this.color = color;
    }
    
    public void establecerColor(String color) {
        this.color = color;
    }
    
    public void dibujar() {
        System.out.println("Dibujando forma");
    }
}    
