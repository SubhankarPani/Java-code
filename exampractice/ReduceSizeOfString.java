package exampractice;
//Input :
//abbccccc
//
//Output:
//ab2c5
public class ReduceSizeOfString {
    public static void main(String[] args) {
        String str="aabbbbeeeeffgggh";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
               sb.append(str.charAt(i));
               if(count>1){
                   sb.append(count);
               }
               count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        if(count>1){
            sb.append(count);
        }

        System.out.println(sb.toString());
    }
}
