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

class DLListDuplicate{

    Node head;
    Node tail;

    DLListDuplicate(){
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

    public void duplicatenode(){
        Node current,temp,index;
        for(current=head;current!=null;current=current.next){
            for(index=current.next;index!=null;index=index.next){
                if(current.data==index.data){
                    temp=index;
                    index.prev.next=index.next;
                    if(index.next!=null)
                        index.next.prev=index.prev;
                    temp=null;
                }
            }
        }     
    }

    //Driver Code
    public static void main(String[] args){
        DLListDuplicate dll=new DLListDuplicate();
        dll.addnode(50);
        dll.addnode(60);
        dll.addnode(70);
        dll.addnode(80);
        dll.addnode(60);
        dll.addnode(100);
        System.out.println("List before removing duplicate : ");
        dll.display();
        dll.duplicatenode();
        System.out.println();
        System.out.println("List after removing duplicate : ");
        dll.display();
    }
}