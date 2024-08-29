package String;

public class RemoveOuterParanthesis {

    public static String RemoveOuterMostParanthesis(String s){
        StringBuilder removedString=new StringBuilder();
        int depth=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
          if(c=='('){
              if(depth>0){
                  removedString.append(c);
              }
              depth++;
          } else if (c==')') {
              depth--;
              if(depth>0){
                  removedString.append(c);
              }
          }

        }


        return removedString.toString();
    }
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(RemoveOuterMostParanthesis(s));
    }
}
