package com.w4;

/*
 * modify class circle, add :
 * -variable color : String (done)
 * -Constructor circle(radius : double, color : String) (done)
 * -Getter and setter for color (done)
 */

public class Circle {

    private double radius;
    private String color;

    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getter color
    public String getColor() {
        return this.color;
    }

    // setter color
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + this.radius + "color = " + this.color + "]";
    }
}