public class Circularqueue{
    public static class cq{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[];
        static void add() throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
                //System.out.println("Queue is full");
                return;
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
        
            }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}