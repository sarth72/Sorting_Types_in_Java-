package dsa;



public class quickSort {
    public static void main(String[] args) {
        int [] arr={12,34,456,334,22,12};
        int n= arr.length;
        System.out.println("array before sorting ::");
        print12(arr);
        qs(arr,0,n-1);
        System.out.println();
        System.out.println("after quick sort :");
        print12(arr);
    }

    private static void print12(int[] arr) {
        for(int i: arr){
            System.out.print(i+" ");

        }
    }

    private static void qs(int[] arr, int low, int high) {
        if(low<high){
            int pi = partiti(arr,low,high);
            qs(arr,low,pi-1);
            qs(arr,pi+1,high);
        }
    }

    private static int partiti(int[] arr, int low, int high) {
        int pivot =arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;


        return i+1;
    }

}

