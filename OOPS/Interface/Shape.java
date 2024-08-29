package OOPS.Interface;

public interface Shape {
    double calculateArea();
}

class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calculateArea(){
        return length*breadth;
    }
}

class Square implements Shape{
    private double side;

    public Square(double side){
        this.side=side;
    }
    public double calculateArea(){
        return side*side;
    }
}
