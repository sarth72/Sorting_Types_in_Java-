package dsa;

public class SelectionSort {public static void main(String[] args) {
    int [] arr={12,34,56,34,67,45,34,56,89,90,78};
    int n= arr.length;
    System.out.println("arr before selection sort:");
    printARR(arr);
    selectionS(arr,n);
    System.out.println();
    System.out.println("arr after Selection sort:");
    printARR(arr);
}

    private static void selectionS(int[] arr, int n) {
    for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }


        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
    }

    private static void printARR(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
