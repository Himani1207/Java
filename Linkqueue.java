public class Linkqueue{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            if(head==null) tail=null;
            return x;
        }
        public int peek(){
            if(size==0){
                return -1;
            }
            return head.val;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        queueLL ql=new queueLL();

        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        ql.add(5);
        ql.display();
        System.out.println(ql.remove());
        ql.display();
        System.out.println(ql.peek());
    }
}