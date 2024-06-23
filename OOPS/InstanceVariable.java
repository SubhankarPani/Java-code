package OOPS;

public class InstanceVariable {
    public String geek;
    public int i;
    public Integer I;
    public InstanceVariable(){
        this.geek="Shubham ";
    }

    public static void main(String[] args) {
        InstanceVariable name=new InstanceVariable();
        System.out.println("Greek name is: "+name.geek);
        System.out.println("Default value for int is : "+name.i);

        System.out.println("default value for Integer is "+name.I);
    }

}
