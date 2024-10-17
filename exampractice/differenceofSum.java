package exampractice;

public class differenceofSum {
    public static void sumdifference(int n,int m){
        int notdiffsum=0;
        int sum=0;
        for (int i = 1; i <=20; i++) {
            if(i%n!=0){
                notdiffsum=notdiffsum+i;
            }
            else{
                sum=sum+i;
            }
        }
        int difference=notdiffsum-sum;
        System.out.println(difference);
    }
    public static void main(String[] args) {
        int n=4;
        int m=20;
        sumdifference(n,m);
    }
}
