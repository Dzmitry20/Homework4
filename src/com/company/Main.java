package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4.0, 4.0);
        Rectangle rectangle2 = new Rectangle(6.0, 9.0);
        Rectangle rectangle3 = new Rectangle(4.0);

        System.out.println();

        System.out.println("Площадь прямоугольника 1 : " + rectangle1.calculateArea() );
        System.out.println("Площадь прямоугольника 2 : " + rectangle2.calculateArea() );
        System.out.println("Площадь прямоугольника 3 : " + rectangle3.calculateArea() );

        System.out.println();

        rectangle1.printArea();
        rectangle2.printArea();
        rectangle3.printArea();

        System.out.println();

        System.out.print("Вид прямоугольника 1 :");
        rectangle1.printRectangleKind();
        System.out.print("Вид прямоугольника 2 :");
        rectangle2.printRectangleKind();
        System.out.print("Вид прямоугольника 3 :");
        rectangle3.printRectangleKind();

        System.out.println();

        System.out.println("Сравнение прямоугольников : " + rectangle1.isTheSameRectangle(rectangle3));
        System.out.println("Сравнение прямоугольников : " + rectangle2.isTheSameRectangle(rectangle1));
        System.out.println("Сравнение прямоугольников : " + rectangle3.isTheSameRectangle(rectangle1));

        System.out.println ();

        Rectangle.printRectanglesCount();

        System.out.println ();

        Rectangle.printClassName(false);
    }
}

