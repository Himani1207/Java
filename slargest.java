public class slargest{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};

        int s=-1;
        int largest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                s=largest;
                largest=arr[i];                
            }
            else if(arr[i]<largest && arr[i]>s){
                s=arr[i];
            }
        }
        System.out.println(s);


    }
}