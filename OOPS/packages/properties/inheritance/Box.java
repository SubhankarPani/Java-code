package OOPS.packages.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    Box (double side){

        this.h=side;
        this.w=side;
        this.l=side;
    }
    Box (double l,double h,double w){
        this.h=h;
        this.w=w;
        this.l=l;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }

}
