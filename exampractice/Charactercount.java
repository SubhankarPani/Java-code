package exampractice;
//a2b4e4f2g3
public class Charactercount {
    public static void main(String[] args) {
        String str = "abbccc";
        int count = 1;
        String newstring = "";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
               newstring=newstring+str.charAt(i-1);
               if(count>1){
                   newstring=newstring+count;
               }
               count=1;
            }


        }
        newstring=newstring+str.charAt(str.length()-1);
        if(count>1){
            newstring=newstring+count;
        }
        System.out.println(newstring);
    }
}
