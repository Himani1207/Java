//SINGLY CIRCULAR LINKED LIST
// public class Circular {
//     public static class Node {
//         int val;
//         Node next;

//         Node(int val) {
//             this.val =[] val;
//         }
//     }


//     public static void display(Node head) {
//         if (head == null) return; 
//         Node temp = head;
//         do {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         } while (temp != head);
        
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node a = new Node(2);
//         Node b = new Node(5);
//         Node c = new Node(3);
//         Node d = new Node(7);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = a; 
//         System.out.println("Circular Linked List:");
//         display(a);
//     }
// }
