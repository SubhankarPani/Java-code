package OOPS.packages.StaticExample;

import java.sql.SQLOutput;

//this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a=4;
    static int b;
//static blocks only run once .When the first obj is created ,when the class is loaded
    static{
        System.out.println("I am a static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj =new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        //System.out.println(obj.a);
        StaticBlock.b+=3;
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
