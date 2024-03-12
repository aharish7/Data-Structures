class LinkedListTest{
    public static void main(String[] args) {
        LinkedList list=new LinkedList ();
        list.insert(55);
        list.insert(18);
        list.insert(78);
        list.insert(32);
        list.insert(12);
        list.insert(21);
        list.insertAt(2,44);
        list.print();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public Node getNext(){
        return next;
    }
}
class LinkedList {
    Node head;
    public void insert(int data ){
       Node node= new Node(data);
       node.setNext(null);
       if(head==null){
           head =node;
       }else{
           Node n=head;
           while (n.getNext()!=null){
               n= n.next;
           }
           n.next=node;
       }
    }
    public void print(){
           Node n=head;
           while(n.getNext()!=null){
               System.out.print(n.getData()+" ");
               n=n.next;
           }
           System.out.print(n.data);
    }
    public void insertAt(int index, int data){
        
        Node node=new Node(data);
        node.setNext(null);
        
        Node n = head;
        for(int i=0; i<index-1;i++){
            n=n.next;
        }
        node.setNext(n.next);
        n.setNext(node);
    
    }
}







