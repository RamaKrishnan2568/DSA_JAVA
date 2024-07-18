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
class DoubleLinkedListMinMax{

    Node head;
    Node tail;

    DoubleLinkedList(){
        head=null;
        tail=null;
    }
    public void addnode(int k){
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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

    public void minmax(){
        Node temp =head;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.data<min)
                min=temp.data;

            if(temp.data>max)
                max=temp.data;

            temp=temp.next;
        }
        System.out.println("Min "+min);
        System.out.println("Max "+max);
    }

    public static void main(String[] args){

        DoubleLinkedListMinMax dg=new DoubleLinkedListMinMax();
        dg.addnode(23);
        dg.addnode(64);
        dg.addnode(56);
        dg.addnode(85);
        dg.addnode(28);
        dg.addnode(45);
        dg.display();
        System.out.println();
        dg.minmax();
    }
}
