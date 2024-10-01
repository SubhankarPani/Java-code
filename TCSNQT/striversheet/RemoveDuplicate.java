import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void Hash(int arr[]){
        HashSet set=new HashSet();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        System.out.println("Removed Duplicate Array " +set);
    }
    public static void TwoPointerMethod(int arr[]){
        int []newArray=new int[arr.length];
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]!=arr[j]){
                    newArray[i]=arr[i];
                }
            }

        }
        System.out.println(Arrays.toString(newArray));
    }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        RemoveDuplicate.Hash(arr);
        RemoveDuplicate.TwoPointerMethod(arr);


}
