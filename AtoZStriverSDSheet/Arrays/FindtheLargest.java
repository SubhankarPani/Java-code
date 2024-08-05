package AtoZStriverSDSheet.Arrays;

import java.util.Arrays;
//time complexity will be N log N as the time complexity of quick sort or merge sort is n logn

public class FindtheLargest {

//    public static int LargestElement(int arr[]){
//        Arrays.sort(arr);
//        int LastElement=arr[arr.length-1];
//        System.out.print("The largest element in the Array is : ");
//        return LastElement;
//    }
//This method has a better time complexity as it does linear Search and solves the code in O(n)

    public static int LargestElement(int arr[]){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        System.out.print("The largest element in the array is : ");
            return max;
    }

    public static void main(String[] args) {
        int Arr[]={1,4,3,2,5};
        System.out.print(LargestElement(Arr));
    }
}
