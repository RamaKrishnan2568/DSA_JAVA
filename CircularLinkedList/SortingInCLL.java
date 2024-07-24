/* Complete the function sorted_insert(). Function will recieve  an address of a variable which is holding the address 
  of starting node  of the linked list , an address of a variable which is holding the address of ending node  of the linked list 
  and an integer as input, do create a node for the given integer using the predefined function create_node() and insert 
  the newly created node to the linked list in a sorted manner. */


import java.util.*;
class Node{
  int data;
  Node next;
  Node(int val){
    data=val;
    next=null;
  }
}
class CLL{
  Node last;
  CLL(){
    last=null;
  }
  
  public void addnode(int k){
    Node newnode=new Node(k);
    if(last==null){
      
      last=newnode;
      newnode.next=newnode;
    }
    else{
      newnode.next=last.next;
      last.next=newnode;
      last=newnode;
    }
  }
  
  public void sort(){
    Node temp,index;
    int tmp;
    for(temp=last.next;temp.next!=last.next;temp=temp.next){
      for(index=temp.next;index!=last.next;index=index.next){
        if(temp.data>index.data){
          tmp=temp.data;
          temp.data=index.data;
          index.data=tmp;
        }
      }
    }
  }
  
  public void display(){
    Node temp=last.next;
    do{
      System.out.print(temp.data+" ");
      temp=temp.next;
    }while(temp!=last.next);
  }
  
  public static void main(String[] args){
    CLL cll=new CLL();
    Scanner sc = new Scanner(System.in);
    while(true){
      int i=sc.nextInt();
      if(i==-1)
        break;
      
      cll.addnode(i);
    }
    cll.sort();
    cll.display();
  }
}
