package OOPS.packages.properties.polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;

    }
    //overloading means method have same name but parameters ,order,or data type can be different
    int sum(int a,int b,int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();;


        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(3,5,3));

    }


}
