class SingleLinkedListTest {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
       Node head= list.add(8);
        list.add(12);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(7);
        list.print(head);
       // System.out.println("Try programiz.pro");
    }
}
class Node{
    int data;
    Node right;
    Node(int data){
        this.data = data;
    }
}
class LinkedList{
    Node head;
    Node add(int data){
        head=addRec(head,data);
        return head;
    }
    Node addRec(Node head, int data){
        if(head ==null){
            head=new Node(data);
        }else{
            head.right=addRec(head.right,data);
        }
        return head;
    }
    void print(Node head){
        if(head != null){
            System.out.print(head.data+" ");
            print(head.right);
        }
    }
}
