package linkedlist;

public class SingleLinkedList {
  class Node{
      int data;
      Node next;

      public Node(int data){
          this.data=data;
      }
      public Node(int data,Node next){
          this.data=data;
          this.next=next;
      }
  }

  public Node head=null;
  public Node tail=null;


  public void addNode(int val){
      Node newnode=new Node(val);
      if(head==null){
          head=newnode;
          tail=newnode;
      }

  }

    public static void main(String[] args) {

    }
}
