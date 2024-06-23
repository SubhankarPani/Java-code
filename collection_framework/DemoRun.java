package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoRun {
    public static  void main(String[]args){
        ArrayList<String> list =new ArrayList<>();
        list.add("Subhankar");
        list.add("Mohan");
        list.add("Akriti");
        list.add("Suresh");
        list.add("Rohit");
        list.add("Subhankar");
        list.add("Subhankar");
        list.add("Mohan");
        list.add("Rohit");
//        Iterator itr=list.iterator();
//        while(itr.hasNext()){
            System.out.println("List is:"+list);
   //     }

    }
}
