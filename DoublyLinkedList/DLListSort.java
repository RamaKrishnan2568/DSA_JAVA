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

class DLListSort{

    Node head;
    Node tail;

    DLListSort(){
        head=null;
        tail=null;
    }
    
    //Insert Node
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

    //Display Node
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

    public void sort(){
        Node current,index;
        int temp;
        for(current=head;current!=null;current=current.next){
            for(index=current.next;index!=null;index=index.next){
                if(current.data>index.data){
                    temp=current.data;
                    current.data=index.data;
                    index.data=temp;
                }
            }
        }     
    }

    //Driver Code
    public static void main(String[] args){
        DLListSort dll=new DLListSort();
        dll.addnode(7);
        dll.addnode(1);
        dll.addnode(4);
        dll.addnode(5);
        dll.addnode(2);
        System.out.print("Before Sorted : ");
        dll.display();
        System.out.println();
        System.out.print("Sorted Node : ");
        dll.sort();
        dll.display();
    }
}