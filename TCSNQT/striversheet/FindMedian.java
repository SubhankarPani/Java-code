package TCSNQT.striversheet;

import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        //int []num={1,2,3,4};
       int []num={3,4,2,1,5,2,3,5};
        Arrays.sort(num);
        int median;
        if(num.length%2!=0){
            System.out.println("Odd");
            median=(num.length+1)/2;
            System.out.println("Median is "+num[median-1]);
        }
        else{
            System.out.println("Even");
            int median1=(num.length)/2 ;
            int median2=(num.length/2)+1;
            System.out.println("Medians are "+num[median1-1]+", "+num[median2-1]);
        }
    }
}
