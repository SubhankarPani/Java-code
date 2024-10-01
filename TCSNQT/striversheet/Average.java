package TCSNQT.striversheet;

public class Average {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        int average=sum/arr.length;
        System.out.println(average);
    }
}
