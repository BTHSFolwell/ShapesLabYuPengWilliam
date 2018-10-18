package com.company;


import ETriangle.ETriangle;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	Shape shape1 = new Rectangle(3,2);
	Shape shape2 = new ETriangle(3);
	Shape shape4 = new RPentagon(3);
	System.out.println(shape4);
	System.out.println();// write your code here
    }
}
