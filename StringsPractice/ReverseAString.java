package StringsPractice;

public class ReverseAString {
    public static void main(String[] args) {
       String s[]="geeks quiz practice code".split(" ");
        char[] c = {'g', 'e', 'e', 'k', 's', ' ', 'q', 'u', 'i', 'z', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', ' ', 'c', 'o', 'd', 'e'};
       ReverseArrayToString(s);
       ReverseCharacterToString(c);

        }
        public static void ReverseArrayToString(String s[]){
            int i=0,j= s.length-1;
            String t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;
            String ans=String.join(" ",s);
            System.out.println(ans);
        }
        public static void ReverseCharacterToString(char c[]){
        int i=0,j=c.length-1;
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        i++;
        j--;
        String ans=new String(c);
            System.out.println(ans);
        }
    }

