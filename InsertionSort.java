package dsa;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={12,34,56,34,67,45,34,56,89,67};
        int n= arr.length;
        System.out.println("arr before insertion sort:");
        printARR(arr);
        insertionsort1(arr,n);
        System.out.println();
        System.out.println("arr after mergesort:");
        printARR(arr);
    }

    private static void insertionsort1(int[] arr, int n) {
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }

    private static void printARR(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
