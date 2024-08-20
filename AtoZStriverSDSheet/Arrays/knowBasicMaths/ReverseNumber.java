package AtoZStriverSDSheet.Arrays.knowBasicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345;
        int reversednumber=0;
        String num=12345+"";

        while (n>0){
        int lastdigit=n%10;
         reversednumber=(10*reversednumber)+lastdigit;


            n=n/10;
        }
        System.out.println(reversednumber);

    }

}
