package OOPS;
//the data abstraction is the process of hiding certain details and showing only essential information to the user

abstract class AbstractClass {
    //let abstract class be animal
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzzzzzz");
    }
}
//subclass
class Pigge extends AbstractClass{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}
class Maine{
    public static void main(String[] args) {
        Pigge mypig=new Pigge();
        mypig.animalSound();
        mypig.sleep();
    }
}
