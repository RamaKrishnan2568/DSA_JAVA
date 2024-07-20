class Node{
    int data;
    Node next;

    Node(int val){
        data=val;
        next=null;

    }
}
class SL{
    Node head;
    Node tail;
    SL(){
        head=null;
    }
    
    public void addbegin(int k){
        Node newnode=new Node(k);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    
    public void addend(int k){
        Node newnode=new Node(k);
        if(tail==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    
    public void addpos(int pos,int k){
        pos=pos-1;
        Node newnode = new Node(k);
        Node temp=head;
        
        
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
            newnode.next=temp.next;
            temp.next=newnode;
    }
    
    public void display(){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    
    public void deletebegin(){
        if(head==null)
            return;
        else
            head=head.next;
    }
    
    public void deleteatpos(int pos){
        
        
        Node temp=head;
        Node prev=null;
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        if(temp.next==null)
            tail=temp.next;
    }
    
    
    
    public static void main(String[] args){
        
        SL dg =new SL();
        //dg.addbegin(23);
        dg.addend(34);
        dg.addend(45);
        dg.addend(56);
        dg.addend(98);
        //dg.addbegin(10);
        //dg.addpos(4,40);
        dg.display();
        dg.deleteatpos(3);
        System.out.println();
        dg.display();
        
    }
    
    
    
    
}
