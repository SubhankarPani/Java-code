package OOPS.packages.StaticExample;

public class Main {
    public static void main(String[] args) {
         Human Subh=new Human(22,"Subhankar Pani",false,20000);
         Human Monu=new Human(22,"Jaspreet Singh",true,400000);
        System.out.println(Subh.name);
        System.out.println(Monu.married);
        System.out.println(Subh.salary);
        System.out.println(Human.population);
        Greeting();//its working because the method is static and being called by a static method
       // Fun();A static method cannot call a non static method

    }

    static void Greeting(){
        System.out.println("Hello");
       // fun();Static method called non-static not possible
    }
    void fun(){
        System.out.println("hello");
        Greeting();//but a non-static method can call a static method
    }
}
