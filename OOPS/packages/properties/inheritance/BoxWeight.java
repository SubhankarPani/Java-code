package OOPS.packages.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l,double w,double h,double weight){
        super(l,h,w);//what is this? call the parent class constructor
        //used to initialize values present in parent class
        this.weight=weight;
    }
}
