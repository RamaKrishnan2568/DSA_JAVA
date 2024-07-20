import java.util.*;

//Node Constructor
class Node{
    int data;
    Node next;
    Node prev;
    Node(int val){
        data=val;
        next=null;
        prev=null;
    }
}

//Main Class
class DoubleLinkedList{

    Node head;
    Node tail;

    DoubleLinkedList(){
        head=null;
        tail=null;
    }


    //Insert At End
    public void insertAtend(int k){
        Node newnode=new Node(k);
        if(tail==null){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }


    //Display Node
    public void display(){
        Node temp=head;
        //System.out.print("og ");
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

    //Delete At Begin
    public void deleteAtbegin(){
        head=head.next;
        if(head==null)
            tail=null;
        else{
            head.prev=null;
        }
    }

    //Delet At Position
    public void deleteAtpos(int pos){
        if(pos==0){
            deleteAtbegin();
            return;
        }
        else{
        Node temp=head;
        Node prev=null;
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        if(temp.next==null)
            tail=prev;
        else
            temp.next.prev=prev;
        }
    }

    //Driver Code
    public static void main(String[] args){

        DoubleLinkedList dg=new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int count=0;
        while(true){
            int i =sc.nextInt();
            if(i==-1)
                break;
            dg.insertAtend(i);
            count++;
        }
        System.out.println(count);
        dg.display();
        int mid=count/2;
        dg.deleteAtpos(mid);
        System.out.println();
        dg.display();

    }
}
