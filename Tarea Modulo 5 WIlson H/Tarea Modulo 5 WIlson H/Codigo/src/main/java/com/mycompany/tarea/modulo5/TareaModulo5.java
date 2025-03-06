package com.mycompany.tarea.modulo5;

public class TareaModulo5 {

    public static void main(String[] args) {
    Circulo circulo = new Circulo("Rojo", 5.0);
    circulo.dibujar();
    circulo.calcularRadio();
    
    Linea linea = new Linea("Azul", 10.0);
    linea.dibujar();
    
    Triangulo triangulo = new Triangulo("Verde", 70.0);
    triangulo.dibujar();
    triangulo.calcularArea();
    
    Cuadrado cuadrado = new Cuadrado("Anaranjado", 15.0);
    cuadrado.dibujar();
    cuadrado.calcularArea();   
    }
}
