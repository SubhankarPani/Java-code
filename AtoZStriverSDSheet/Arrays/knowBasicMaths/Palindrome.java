package AtoZStriverSDSheet.Arrays.knowBasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int n=121;
        int reversednumber=0;
        while(n>0){
            int lastdigit=n%10;
            reversednumber=(reversednumber*10)+lastdigit;
            n=n/10;
        }
        if(num==reversednumber){
            System.out.println("true");

        }
        else{
            System.out.println("False");
        }
    }
}
