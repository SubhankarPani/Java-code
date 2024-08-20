package AtoZStriverSDSheet.Arrays.knowBasicMaths;
//6
//        4 3 7 2 6 1
public class CountDigits {
    public static void main(String[] args) {
        int n=12345;
        int count=0;
        String num=12345+"";
        for (int i = 0; i <num.length() ; i++) {
            count++;
        }
//        while(n>0){
//            count++;
//            n=n/10;
//        }
        System.out.println(count);
    }
}
