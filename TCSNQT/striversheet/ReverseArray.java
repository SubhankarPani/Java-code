package TCSNQT.striversheet;

import java.util.Arrays;

public class ReverseArray {
    public static void ReverseArray(int arr[]) {
        int first=0;
        int last=arr.length-1;

        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }
        public static void Reverse ( int arr[]) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

            public static void main (String[]args){
                int arr[] = {5, 4, 3, 2, 1};
               Reverse(arr);
                ReverseArray(arr);
            }


    }