package OOPS;
//Encapsulation is to make sure that sensitive data is hidden from the userss
//they are accesed using get and set
//declared in private class
public class Encapsulation {
    //assuming encapsulation as people
    private String name;

    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return name;
    }


    public static void main(String[] args) {
        Encapsulation myObj=new Encapsulation();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }

}
