package collection_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        PrintStackTrace();
        toStringException();
        getMessage();
       CustomException();
        ArithmeticException();
        NullPointerException();
        StringIndexOutOfBoundException();
        FileNotFoundException();
        ParseIntException();
        ArrayIndexOutOfBound();
        IOException();
        IllegalArgumentException();

        }
        ///PrintStackTrace- gives type of the exception,detailed message,sequence of method call
        public static void PrintStackTrace(){
            int a=5;
            int b=0;
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException e){
                e.printStackTrace();
        }

        }
        //toString Exception
    public static void toStringException(){
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println( e.toString());
        }

    }
    public static void getMessage(){
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    //Custom Exception Handling
    public static void CustomException(){
        int[]arr=new int[4];
        int i=arr[4];
        System.out.println("Hi,I want to execute");
    }
    //built in execption
    //Arithmetic Exception
    public static void ArithmeticException(){
        int a=5;
        int b=0;
        try{
            int c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide a number by 0");
        }
    }
    public static void NullPointerException(){
        try{
            String a=null;
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException..");
        }
    }
    public static void StringIndexOutOfBoundException(){

        try{
            String a="This is like chipping";
            char c=a.charAt(25);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException..");
        }
    }
    public static void FileNotFoundException(){
        try{
            File file =new File("E://file.txt");
            FileReader fr=new FileReader(file);
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist..");
        }
    }
    public static void ParseIntException(){

            try {
                // "akki" is not a number
                int num = Integer.parseInt ("akki") ;
                System.out.println(num);
            }
            catch(NumberFormatException e) {
                System.out.println("Number format exception");
            }
        }
    public static void ArrayIndexOutOfBound()
    {
        try{
            int a[] = new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
    public static void IOException() {

        Scanner sc = new Scanner("Hello Greek");
        System.out.println("" + sc.nextLine());

        System.out.println("Exception Output : "+sc.ioException());
        sc.close();
    }
    public static void IllegalArgumentException(){
        int a=14;
        if(a>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            throw new IllegalArgumentException("Note eligible to vote");
        }
    }

}

