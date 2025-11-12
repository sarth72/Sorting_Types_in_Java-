package dsa;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr={12,34,56,34,67,45,34,56,89};
        int n= arr.length;
        System.out.println("arr before mergesort:");
        printARR(arr);
        MS(arr,0,n-1);
        System.out.println();
        System.out.println("arr after mergesort:");
        printARR(arr);
    }

    private static void printARR(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void MS(int[] arr, int low, int high) {
        if(low<high){
            int mid=(low +high)/2;
            MS(arr,low,mid);
            MS(arr,mid+1,high);
            merge2(arr,low,mid,high);
        }
    }

    private static void merge2(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;
        int[]L=new int[n1];
        int[]R=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=low;

        while(i<n1 && j<n2){
            if(L[i]<= R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;

        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }

    }
}
