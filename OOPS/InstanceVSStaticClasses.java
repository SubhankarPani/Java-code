package OOPS;

public class InstanceVSStaticClasses {
    int myvariable;
    static int data=30;
    public static void main(String[] args) {
        InstanceVSStaticClasses obj=new InstanceVSStaticClasses();
        System.out.println("value of instance variable"+obj.data);
       System.out.println("value of static variable"+InstanceVSStaticClasses.data);

    }
}
