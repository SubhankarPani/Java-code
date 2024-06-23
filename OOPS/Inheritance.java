package OOPS;
//inheriting attributes and methods from one class to another
//there are mainly two types ....
//subclass the class that inherits from another class
//superclass=the class that being inherited from
public class Inheritance {
    //Assuming inheritance as vehicle
    protected String brand="Ford";
    public void yonk(){
        System.out.println("Tuut,tuut!");
    }
}
class Car extends Inheritance{
    private String modelName="Mustang";

    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.yonk();
        System.out.println(myCar.brand +" "+myCar.modelName);
    }
}
