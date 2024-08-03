package OOPS.packages.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box();
        Box box2=new Box(4);
        Box box3=new Box(4,3,4);
        Box box4=new Box(box3);
        System.out.println(box1.l+" "+ box1.w+" "+ box1.h);
        System.out.println(box2.l+" "+ box2.w+" "+ box2.h);
        System.out.println(box3.l+" "+ box3.w+" "+ box3.h);
        System.out.println(box4.l+" "+ box4.w+" "+ box4.h);

        BoxWeight box5=new BoxWeight();
        System.out.println(box5.h+ " "+box5.weight);

        BoxWeight box6=new BoxWeight(1,2,4,6);
        System.out.println();
    }
}
