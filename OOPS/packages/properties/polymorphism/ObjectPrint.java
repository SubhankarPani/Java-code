package OOPS.packages.properties.polymorphism;

public class ObjectPrint /*extends Object*/ {

    int num;
    public ObjectPrint(int num){
        this.num=num;
    }

    @Override
    public String toString(){
        return "ObjectPrint{"+"num=" + num +'}';
    }
    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(54);
        System.out.println(obj);//will all obj.toString method by the main ObjectPrint class that calls object class which has a toString function


    }
}
