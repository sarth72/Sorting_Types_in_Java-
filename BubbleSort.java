package dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={12,34,56,34,67,45,34,56,89};
        int n= arr.length;
        System.out.println("arr before Bubble sort:");
        printARR(arr);
        Bubblesort(arr,n-1);
        System.out.println();
        System.out.println("arr after Bubble sort:");
        printARR(arr);
    }

    private static void Bubblesort(int[] arr, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    private static void printARR(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
