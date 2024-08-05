package AtoZStriverSDSheet.Arrays;

import java.util.Arrays;

public class SecondSmallestAndSecondLargest {
   public static int  SecondSmallest(int arr[]){
       Arrays.sort(arr);

       return arr[1];

   }
   public static int SecondLargest(int arr[]){
       Arrays.sort(arr);
       return arr[arr.length-2];
   }


    public static void main(String[] args) {
        int arr[]={1,4,5,3,2};
        System.out.println("The intial array was : "+Arrays.toString(arr));
        System.out.println("The second smallest element is : "+SecondSmallest(arr)+" and The second largest element is : "+SecondLargest(arr));


    }
}
