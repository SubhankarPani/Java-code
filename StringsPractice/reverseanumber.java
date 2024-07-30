package StringsPractice;

public class reverseanumber{

    public static void main(String[]args){

       // System.out.print(reverse(-123));
        reverse(-123);
        //reverse(123);
    }
    public static void reverse(int x) {
        int newnumber=x;
        int reversednumber=0;
        while(newnumber!=0){
            int digit=newnumber%10;
            reversednumber=(reversednumber*10)+digit;
            newnumber=newnumber/10;
        }
        if(reversednumber>Integer.MAX_VALUE || reversednumber<Integer.MIN_VALUE){
           // return 0;
        }
        if(reversednumber<0){
            System.out.println(reversednumber); ;
        }
        else{
           // return (int)reversednumber;
        }
    }
}
