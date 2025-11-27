public class Binarytree{
    static int size=0;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static void display(Node root) {
    if (root == null) return; // stop when there is no node
    System.out.print(root.val + " -> ");
    if (root.left != null) System.out.print(root.left.val + "  ");
    if (root.right != null) System.out.println(root.right.val);
    display(root.left);
    display(root.right);
}

public static void Preorder(Node root){
    if (root==null) {
        return;
    }
    //System.out.println(root.val);
    size++;
    Preorder(root.left);
    Preorder(root.right);
}
public static int size(Node root){
    if(root==null){
        return 0;
    }
    return 1+size(root.left)+size(root.right);
}

    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
        }

    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a=root.val;
        int b=max(root.left);
        int c=max(root.right);
        int d=Math.max(b, c);
        return Math.max(a,d);
    }

    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }


    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;

        int a=root.val;
        int b=min(root.left);
        int c=min(root.right);

        return Math.min(a,Math.min(b,c));
    }

    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
         
    }
    public static void main(String[] args){
        Node root=new Node(10);
        Node a=new Node(12);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
       // root.val=10;
       a.left=c;
       a.right=d;
       Node e=new Node(5);
       b.right=e;
       //display(root);
       Preorder(root);
       System.out.println(size);
       System.out.println("Sum "+sum(root));
       System.out.println("Maximum "+ max(root));
       System.out.println("Height "+ height(root));
       System.out.println( "Minimum "+ min(root));
       System.out.println("Product "+product(root));
    }
}