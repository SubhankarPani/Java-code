package AtoZStriverSDSheet.Arrays;

public class CheckArraySortedandRotated {
    public static boolean RotatedArray(int arr[]){
        int n=arr.length;
        int  count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[(i+1)%n]){
                count ++;
            }
            if(count>1){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(RotatedArray(arr));

    }
}
