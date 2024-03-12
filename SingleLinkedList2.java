
class Node{
    private int data;
    private Node next;
    Node(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data=data;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public Node getNext(){
        return next;
    }
}
class LinkedList {
   private Node head;
   public Node getHead(){
       return head;
   }

    public void insert(int data ){
       Node node= new Node(data);
       node.setNext(null);
       if(head==null){
           head =node;
       }else{
           Node n=head;
           while (n.getNext()!=null){
               n= n.getNext();
           }
           n.setNext(node);
       }
    }
    public void print(){
           Node n=head;
           while(n.getNext()!=null){
               System.out.print(n.getData()+" ");
               n=n.getNext();
           }
           System.out.print(n.getData());
    }
    public void insertAt(int index, int data){
        
        Node node=new Node(data);
        node.setNext(null);
        
        Node n = head;
        for(int i=0; i<index-1;i++){
           n=n.getNext();
        }
        node.setNext(n.getNext());
        n.setNext(node);
    }
    public void deleteAt(int index){
        Node n= head;
        for(int i=0; i<index-1; i++){
            n=n.getNext();
        }
        n.setNext(n.getNext().getNext());
    }
    public void updateAt(int index, int data){
        Node n=head;
        for(int i=0; i<index;i++){
            n=n.getNext();
        }
        n.setData(data);
    }
    public int get(int index){
        Node n= head;
        for(int i=0;i<index; i++){
            n=n.getNext();
        }
        return n.getData();
    }
}

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
        list.deleteAt(1);
        list.updateAt(3,66);
        list.print();
        System.out.println("\n");
       System.out.println(list.get(3));
    }
    
}
