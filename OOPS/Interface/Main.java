package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
        Circle myCircle=new Circle(5);
        System.out.println(myCircle.calculateArea());

        Rectangle myRectangle=new Rectangle(4,6);
        System.out.println(myRectangle.calculateArea());

        Square mySquare=new Square(4);
        System.out.println(mySquare.calculateArea());
    }
}
