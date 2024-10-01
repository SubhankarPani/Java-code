package TCSNQT.striversheet;
import java.util.*;
public class FIndSmallestElement {

    public static void FindSmallestWithMethod(int []arr){
        Arrays.sort(arr);
        System.out.println("The smallest element is : "+arr[0]);
    }

    public static void FindSmallestWithoutMethod(int []arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest element is : "+min);
    }
    public static void main(String []args){
        int []arr={2,5,1,3,0};
        FindSmallestWithMethod(arr);
        FindSmallestWithoutMethod(arr);
    }
}
