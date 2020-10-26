package com.company;

class Rectangle {
    double x;
    double y;

    public Rectangle(double x1, double y1) {
        x = x1;
        y = y1;
    }
    public Rectangle(double z) {
        x = z;
        y = z;
    }
    double calculateArea() {
        return x * y;
    }
    void printArea() {
        System.out.println("Площадь текущего прямоугольника : " + calculateArea());
    }
    public void printRectangleKind() {
        if  (x == y )  {
            System.out.println(" это квадрат");}
        else
        { System.out.println(" это прямоугольник");}}

    boolean isTheSameRectangle(Rectangle rectangle) {
        return  ((this.x ==(rectangle.x)) &&
                (this.y == (rectangle.y)));
    }
}

