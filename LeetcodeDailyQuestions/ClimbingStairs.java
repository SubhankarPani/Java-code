package LeetcodeDailyQuestions;

public class ClimbingStairs {
    public  static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
     //   ClimbingStairs steps=new ClimbingStairs();
       // System.out.println(steps.climbStairs(3));
         System.out.println(climbStairs(3));
    }
}
