import java.util.ArrayList;

public class EnhancedForLoopExamples {
//Array example
    public static void ArrayLoop(int arr[]){
        for(int number:arr){
            System.out.print(number+" , ");
        }
    }

    //ArrayList example
    public static void ArrayList(int arr[]){

    }








    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6};
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Cherry");


        ArrayLoop(numbers);
    }
}
