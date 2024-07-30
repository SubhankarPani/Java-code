package recursion;

public class printnto1 {

    public static void print(int n,int i){
        if(i>n){
            return;
        }
            System.out.println(n);
        print(n-1,i);
    }
    public static void main(String[] args) {
        print(10,1);
    }
}
