package com.company;

class Rectangle {
    double x;
    double y;
    private static int createdRectangles;
    private  final  static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private  final  static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x1, double y1) {
        x = x1;
        y = y1;
        createdRectangles = createdRectangles +1;
    }
    public Rectangle(double z) {
        x = z;
        y = z;
        createdRectangles = createdRectangles +1;
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
        return  this.x ==rectangle.x &&
                this.y == rectangle.y;}

    static void printRectanglesCount()
    {
               System.out.println("Всего было создано " +createdRectangles + " прямоугольника" );
    }

    static void  printClassName(boolean printlnRussian) {

        if (printlnRussian){
            System.out.println(RUSSIAN_CLASS_NAME);}
        else {
            System.out.println(ENGLISH_CLASS_NAME);}

    }
}