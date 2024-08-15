package ArraysQuestions;

public class MaximumMinimum {

    public int MaxMin(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,1,8,3};
        MaximumMinimum obj=new MaximumMinimum();
        System.out.println("maximum Element: "+obj.MaxMin(arr));
    }
}
