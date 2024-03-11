
class BinarySearchTreeTest{
    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
       Node root= tree.insert(5);
      tree.inOrderTrav(root);
        System.out.println();
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class BinaryTree {
    Node root;
    public Node insert(int data){
        root= insertRec(root,data);
         System.out.println(root.data);
         return root;
    }
    
    public Node insertRec(Node root, int data){
        if(root == null)
         root= new Node(data);
        else if (root.data > data)
         root.left=insertRec(root.left, data);
        else if(root.data < data)
         root.right=insertRec(root.right, data);
         
        return root;
    }
    public void inOrderTrav(Node root){
        if (root!= null){
        inOrderTrav(root.left);
         System.out.println(root.data);
        inOrderTrav(root.right);
        }
    }
}






