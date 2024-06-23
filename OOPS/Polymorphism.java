package OOPS;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Polymorphism {
    //let polymorphism be Animal

    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Polymorphism{
    public void animalSound(){
        System.out.println("The pig says: we wee");
    }
}

class dog extends Polymorphism{
    public void animalSound() {
        System.out.println("The dog says:bow bow");
    }
}
class Main{
    public static void main(String[] args) {
        Polymorphism myAnimal=new Polymorphism();
        Polymorphism myPig=new Pig();
        Polymorphism mydog=new dog();
        myAnimal.animalSound();
        myPig.animalSound();
        mydog.animalSound();
    }
}
