package recursion;

public class sumoffirstn {


    public static int sum(int i,int s){
      if (i<0){
          System.out.println(s);
           return s ;

      }
      //s=s+i;
      return sum(i-1,s+i);
    }

    
    public static void main(String[] args) {
        int s = 0;
        int i=4;
        sum(i, s);

    }
}
