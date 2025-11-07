public class heapsort {
    static void heapsorting(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            maxHeapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeapify(arr, i, 0);
        }
    }
    static void maxHeapify(int[] arr,int n,int i)
    {
        int lar=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[lar]<arr[l]){
            lar=l;
        }
        if(r<n && arr[lar]<arr[r]){
            lar=r;
        }
        if(i!=lar){
        int temp=arr[i];
        arr[i]=arr[lar];
        arr[lar]=temp;
        maxHeapify(arr, n, lar);
        }
    }
    
    public static void main(String[] args){
        int[] arr={2,6,3,8,9,12,56,37};
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        heapsorting(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
