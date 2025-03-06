
package com.mycompany.tarea.modulo5;

class Linea extends Formas {
private double largo;

public Linea(String color, double largo) {
super(color);
this.largo= largo;
}

@Override
public void dibujar() {
System.out.println("Dibujando Linea");      
}    
}
