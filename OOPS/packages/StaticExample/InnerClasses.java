package OOPS.packages.StaticExample;

 class Test{
     static String name;
    public Test(String name){
        this.name=name;
    }
}
public class InnerClasses {


    public static void main(String[] args) {
        Test a=new Test("Kunal");
        System.out.println(a.name);
        Test b=new Test("Subhankar");

        System.out.println(b.name);
    }
}
