package com.company;


import ETriangle.ETriangle;

import java.awt.*;

public class Runner {

    public static void main(String[] args) {
	Shape shape1 = new Rectangle(3,2);
	Shape shape2 = new ETriangle(3);
	Shape shape3 = new Circle(5);
	Shape shape4 = new RPentagon(3);
	System.out.println(shape4);
	System.out.println("My Perimeter is: " +shape2.getPerimeter());// write your code here
    System.out.println("My Area is: ") + shape2.getArea());
	Shapes [] shapes = {shape1, shape2, shape3,shape4};
    }
}
