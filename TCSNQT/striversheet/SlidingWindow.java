package TCSNQT.striversheet;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[]={7,5,2,3,1,6};
        int k=3;

        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(j<arr.length){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                max=Math.max(sum,max);
                j++;
            } else if (j-i+1>k) {
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }

}
