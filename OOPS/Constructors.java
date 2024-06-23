package OOPS;
//constructors are special method used to initialize objects
//they cannot be void
public class Constructors {
    int x;

    public Constructors(){
        x=5;
    }

    public static void main(String[] args) {
        Constructors obj=new Constructors();;
        System.out.println(obj.x);
    }
}
