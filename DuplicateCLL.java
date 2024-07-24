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



    public void remove(){
        Node current=last.next;
        do{
            Node runner=current;
            while(runner.next!=last.next){
                if(runner.next.data== current.data)
                    runner.next=runner.next.next;
                else
                    runner=runner.next;
            }
            current=current.next;
        }while (current!=last.next);
    }



    public static void main(String[] args){
        CircularLinkedList dll=new CircularLinkedList();
        dll.insertAtend(34);
        dll.insertAtend(34);
        dll.insertAtend(34);
        dll.insertAtend(4567);
        dll.insertAtend(65);
        dll.insertAtend(75);
        dll.insertAtend(34);
        dll.insertAtend(67);
        dll.insertAtend(67);
        dll.insertAtend(67);
        dll.insertAtend(67);
        dll.display();

        System.out.println();
        dll.remove();
        dll.display();
    }
}
