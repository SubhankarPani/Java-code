package TCSNQT.striversheet;

public class FindSubArray {
    public static void main(String[] args) {
        int []arr={7,6,4,8,9,3,1,6};
        int k=3;
        //find the maximum sum off k size;
        int i =0;
        int j =0;
        int max = Integer.MIN_VALUE;
        int sum=0;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                max = Math.max(sum,max);
                j++;
            } else if (j-i+1>k) {
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
    
}
