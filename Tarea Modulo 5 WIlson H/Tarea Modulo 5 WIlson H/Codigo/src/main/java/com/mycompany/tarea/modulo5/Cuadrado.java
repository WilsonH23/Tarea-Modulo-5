
package com.mycompany.tarea.modulo5;

class Cuadrado extends Formas {
private double area;

public Cuadrado(String color, double area) {
super(color);
this.area= area;
}

public void calcularArea() {
 System.out.println("Calculando el área del Cuadrado");   
}

@Override
public void dibujar() {
System.out.println("Dibujando Cuadrado");      
}

}
