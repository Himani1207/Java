public class LInkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        //Node x=new Node();
        Node a=new Node(5);
        System.out.println(a.next);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(5);
         //5->3->9->8->5
        a.next=b;
        System.out.println(a.next.data);
        System.out.println(a.data);
        //System.out.println(x.next);
    }
}

//Displaying  a linked list

// public class LInkedList{
//     // public static void display(Node head){
//     //     Node temp=head;//head dont change head preserve rhe islye ek temp node bnate hain  
//     //     while(temp!=null){
//     //         System.out.println(temp.data+" ");
//     //         temp=temp.next;
//     //     }
//     // }
//     public static void display(Node head){
//         if(head==null) return ;
//         display(head.next);
//             System.out.println(head.data);
            
        
//     }
//     public static class Node{
//                 int data;
//                 Node next;
//                 Node(int data){
//                     this.  data=data;
//                 }
//             }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         System.out.println(a.next);
//         Node b=new Node(3);
//         Node c=new Node(9);
//         Node d=new Node(8);
//         Node e=new Node(13);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         Node temp=a;
//         // for(int i=1;i<=5;i++){
//         //     System.out.println(temp.data+" ");
//         //     temp=temp.next;
//         // }

//         // while(temp!=null){//code for printing linked list
//         //     System.out.println(temp.data+" ");
//         //     temp=temp.next;
//         // }

//         display(a);
       
//     }
// }

//FIND LENGTH OF LINKED LIST
// public class LInkedList{
//     public static int length(Node a){
//         int count=0;
//         while(a!=null){
//             count++;
//             a=a.next;
//         }
//         return count;
//     }
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//         }
//      }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         System.out.println(a.next);
//         Node b=new Node(3);
//         Node c=new Node(9);
//         Node d=new Node(8);
//         Node e=new Node(13);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//        // Node temp=a;
//         int len=length(a);
//         System.out.println(len);
//    }
// }

//INSERT A NODE AT END a
// public class LInkedList {
//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class Linkedlist {
//         Node head = null;
//         Node tail = null;

//         void insertAtEnd(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = temp;
//                 tail = temp;
//             } else {
//                 tail.next = temp;
//                 tail = temp;
//             }
//         }

        // void display() {
        //     Node temp = head; 
        //     while (temp != null) {
        //         System.out.print(temp.data + " "); 
        //         temp = temp.next;
        //     }
        //     System.out.println(); 
        // }

        // int Size() {
        //     Node temp = head; 
        //     int count = 0;
        //     while (temp != null) {
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
//     }

//     public static void main(String[] args) {
//         Linkedlist l = new Linkedlist();
//         l.insertAtEnd(4);
//         l.insertAtEnd(5);

//         l.display(); 
//         System.out.println(l.Size()); 
//     }
// }


// INSERT AT START OF LINKED LIST
// public class LInkedList {
//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class Linkedlist {
//         Node head = null;
//         Node tail = null;

//         void insertAtEnd(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = tail = temp;
//             } else {
//                 tail.next = temp;
//                 tail = temp;
//             }
//         }

//         void insertAtHead(int val) {
//             Node temp = new Node(val);
//             if (head == null) {
//                 head = tail = temp;
//             } else {
//                 temp.next = head;
//                 head = temp; // Update head to the new node
//             }
//         }
//         void insertAt(int idx,int val){
//             Node t=new Node(val);
//             Node temp=head;
//             if(idx==Size()){
//                 insertAtEnd(val);
//                 return;
//             }
//             for(int i=1;i<=idx;i++){
//                 temp=temp.next;
//             }
//             t.next=temp.next;
//             temp.next=t;
//         }
//         int Size() {
//             Node temp = head; 
//             int count = 0;
//             while (temp != null) {
//                 count++;
//                 temp = temp.next;
//             }
//             return count;
//         }
        // void display() {
        //     Node temp = head;
        //     while (temp != null) {
        //         System.out.print(temp.data + " ");
        //         temp = temp.next;
        //     }
        //     System.out.println();
        // }
//         int getAt(int idx){
//             if(idx<0 || idx>Size()){
//                 System.out.println("wrong index");
//                 return -1;
//             }
//             Node temp=head;
//             for(int i=1;i<=idx;i++){
//                 temp=temp.next;
//             }

//             return temp.data;
//         }
//     }

//     public static void main(String[] args) {
//         Linkedlist l  = new Linkedlist();
//         l.insertAtHead(4);
//         l.insertAtHead(5);
//         l.insertAtEnd(6);
//         l.insertAt(3, 10);
//         l.insertAt(0, 11);//
//         l.display();
//         System.out.println(l.getAt(4));
//     }
// }

// p


// finding nth node form list

// public class LInkedList{
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static Node nthnode(Node head,int n){
//         int size=0;
//         Node temp=head;
//         while(temp!=null){
//             size++;
//             temp=temp.next;
//         }
//         int m=size-n+1;
//         temp=head;
//         for(int i=0;i<m-1;i++){
//             temp=temp.next;
//         }
//         return temp;
//     }
//     public static void main(String[] args){
//         Node a=new Node(100);
//         Node b=new Node(13);
//         Node c=new Node(4);
//         Node d=new Node(5);
//         Node e=new Node(12);
//         Node f=new Node(10);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         e.next=f;

//         Node temp=nthnode(a,3);
//         System.out.println(temp.data);
//     }
// }

//Finding nth node from end linkedlist
// public class LInkedList{
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static Node nthnode(Node head,int n){
//         Node temp=head;
//         Node slow=head;
//         Node fast=head;
//         for(int i=0;i<n;i++){
//             fast=fast.next;
//         }
//         while(fast!=null){
//             slow=slow.next;
//             fast=fast.next;
//         }
//         return slow;
//     }
//     public static void main(String[] args) {
        // Node a=new Node(100);
        // Node b=new Node(13);
        // Node c=new Node(4);
        // Node d=new Node(5);
        // Node e=new Node(12);
        // Node f=new Node(10);
        // a.next=b;
        // b.next=c;
        // c.next=d;
        // d.next=e;
        // e.next=f;
//         Node temp=nthnode(a,2);
//         System.out.println(temp.data);

//     }
// }

//Deleting nth node from end from linkedlist

public class LInkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteNthFromEnd(Node head, int n) {
        Node dummy = new Node(0); // Dummy node to handle edge cases
        dummy.next = head;
        
        Node slow = dummy;
        Node fast = dummy;

        // Move fast pointer `n` steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.next == null) {
                return head; // If n is greater than the size, return original head
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the node
        slow.next = slow.next.next;

        return dummy.next; // Return updated head
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original Linked List:");
        printList(a);

        int n = 2; // Delete 2nd node from the end
        a = deleteNthFromEnd(a, n);

        System.out.println("Linked List after deleting " + n + "-th node from the end:");
        printList(a);
    }
}
