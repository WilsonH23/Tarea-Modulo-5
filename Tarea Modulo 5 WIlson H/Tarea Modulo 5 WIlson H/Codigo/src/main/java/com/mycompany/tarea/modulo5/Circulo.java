
package com.mycompany.tarea.modulo5;

class Circulo extends Formas {
private double radio;

public Circulo(String color, double radio) {
super(color);
this.radio= radio;
}

public void calcularRadio() {
 System.out.println("El radio es: " + radio);   
}

@Override
public void dibujar() {
System.out.println("Dibujando Circulo");      
}

}
