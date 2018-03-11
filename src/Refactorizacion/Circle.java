/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizacion;

/**
 *
 * @author Noe
 */
public class Circle extends Shape {
public Circle(double size) {
 super(size);
}
public double area() {
 double size = getSize();
 return Math.PI*size*size/4.0;
}
}

