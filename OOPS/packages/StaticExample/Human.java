package OOPS.packages.StaticExample;

public class Human {

    int age;
    String name;
    boolean married;
    int salary;
    //common to everyone for eg lets say population
    static long population;

    Human(int age,String name,boolean married,int salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }
}
