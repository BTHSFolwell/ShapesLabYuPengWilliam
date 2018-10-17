package com.company;
public abstract class Shape
{
    private String type;
    public Shape(String type)
    {
        this.type = type;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString()
    {
        return "I am a " + type + ".";
    }
}

public class Main {

    public static void main(String[] args) {
	Shape shape1 = new Rectangle();
	Shape shape2 = new Etriangle();
	Shape shape3 = new Circle ();
	Shape shape4 = new RPentagon();
	System.out.println(shape4);
	System.out.println()// write your code here
    }
}
