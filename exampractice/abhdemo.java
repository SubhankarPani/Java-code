package exampractice;

public class abhdemo {
    public static void main(String[] args) {
        String str="Move#Hash#to#Front";
        StringBuilder sb=new StringBuilder();
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='#'){
                sb.append(str.charAt(i));
            }
        }
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)!='#'){
                sb.append(str.charAt(j));
            }
        }
        System.out.println(sb.toString());
    }
}
