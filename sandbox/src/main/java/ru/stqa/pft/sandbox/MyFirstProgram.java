package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[]args){

        Square s = new Square(5);
        System.out.println("площадь квадрата = " + s.area());
    }

    public static double area(Square s){
        return s.l * s.l;

    }
}
