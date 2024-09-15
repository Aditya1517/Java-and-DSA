package divideNconqure;

// time complexity for merge sort is nlog(n)

public class mergeSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void mergesort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }  
         
        int mid = si + (ei-si)/2;

        mergesort(arr,si, mid);  // for left part
        mergesort(arr, mid+1, ei);  // for right part

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){

        int temp[] = new int[ei-si+1];
        int i = si;  // iterator for left part
        int j = mid+1;  // iterator for right part
        int k = 0;  // iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // for the remaining part form the left
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        } 

        // for the remaining part form the right
        while(j<=ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp array to original array
        for(k=0,i=0;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
