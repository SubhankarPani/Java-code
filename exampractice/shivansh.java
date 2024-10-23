package exampractice;

import java.util.Scanner;

public class shivansh {
    String firstname;
    String lastname;
    static Scanner sc=new Scanner(System.in);

    public void fullname(){
        firstname=sc.next();
        lastname=sc.next();
        System.out.println(firstname + " " + lastname);
    }
    public static void main(String[] args) {
        shivansh s=new shivansh();
        s.fullname();
    }
}
