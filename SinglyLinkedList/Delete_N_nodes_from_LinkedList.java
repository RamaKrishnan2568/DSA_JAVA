//Node Constructor
class Node{
    int data;
    Node next;

    Node(int val){
        data=val;
        next=null;
    }
}

class SinglyLinkedList{
    Node head;
    SinglyLinkedList(){
        head=null;
    }

    public void insert(int k) {
        Node newnode = new Node(k);
        Node temp=head;
        Node prev=null;
        if (head == null) {
            head = newnode;
        } else {
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public int length(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }


    public void delete(int n) {
        int pos = length() - n + 1;
        Node temp = head;
        Node prev = null;
        if (pos == 1)
            head = head.next;
        else {
            for (int i = 2; i <= pos; i++) {
                prev = temp;
                temp = temp.next;
            }
            if (temp.next == null)
                prev.next = null;
            else
                prev.next = temp.next;
        }
    }




    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insert(10);
        sl.insert(20);
        sl.insert(30);
        sl.insert(40);
        sl.display();
        System.out.println("");
        sl.delete(2);
        sl.display();
    }
}
