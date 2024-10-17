package TCSNQT.striversheet;

import java.util.Arrays;

public class AddingElements {
    public static void InsertAtBegining(int arr[],int val){
        if(arr.length==0){
            arr[0]=val;
        }

            for (int i = 0; i < arr.length-1; i++) {
                arr[i+1]=arr[i];
                arr[0]=val;
            }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int val=20;
        InsertAtBegining(arr,val);

    }
}
