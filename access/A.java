package access;

public class A {
    private int num;//to access the private variables we need the getter and setter
    String name;
    int []arr;

    public int getNum(){
        return num;
    }
    public void  setNum(int num){
        this.num=num;
        //return false;
    }

    public A(int num,String name){
        this.name=name;
        this.num=num;
        this.arr=new int[num];
    }
}
