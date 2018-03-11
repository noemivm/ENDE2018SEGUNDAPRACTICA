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
public class Right_Triangle extends Shape {
public Right_Triangle(double size) {
 super(size);
}
public double area() {
 double size = getSize();
 return size*size/2.0;
}
}

