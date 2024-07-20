class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
class CircularLinkedList{
    Node last;
    CircularLinkedList(){
        last=null;
    }

    //Insert At Begin
    public void insertAtbegin(int k){
        Node newnode=new Node(k);
        if(last==null){
            last=newnode;
            newnode.next=newnode;
        }else{
            newnode.next=last.next;
            last.next=newnode;
        }
    }

    //Insert At End
    public void insertAtend(int k){
        Node newnode=new Node(k);
        if(last==null){
            last=newnode;
            newnode.next=newnode;
        }else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
    }

    public void deleteAtbegin(){
        if(last==last.next)
            last=null;
        else{
            last.next=last.next.next;
        }
    }

    public void deleteAtend(){
        if(last==last.next)
            last=null;
        else{
            Node temp=last.next;
            while(temp.next!=last){
                temp=temp.next;
            }
            temp.next=last.next;
        }
    }

    //Display Node
    public void display(){
        if(last==null)
            return;
        Node temp =last.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=last.next);
    }


    //Driver Code
    public static void main(String[] args){
        CircularLinkedList dll=new CircularLinkedList();
        dll.insertAtbegin(34);
        dll.insertAtbegin(65);
        dll.insertAtbegin(75);
        dll.insertAtbegin(34);
        dll.insertAtend(67);
        dll.display();
        //dll.deleteAtbegin();
        dll.deleteAtend();
        System.out.println();
        dll.display();
    }
}