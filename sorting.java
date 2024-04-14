import java.util.*;

public class sorting {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // swap arr[i+1] and arr[high]
        int temp2 = arr[i];
        arr[i] = pivot;
        arr[high] = temp2;
        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high) {

        if(low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
 
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merger[] = new int[ei - si + 1];

        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

            while(index1 <= mid && index2 <= ei) {
                if(arr[index1] < arr[index2]) {
                merger[x++] = arr[index1++];
            } else {
             merger[x++] = arr[index2++];
            }
        }   

            while(index1 <= mid) {
                merger[x++] = arr[index1++];
            }

            while(index2 <= ei) {
                merger[x++] = arr[index2++];
            }

        for(int i = 0, j = si; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }
    }
    public static void divide(int arr[], int si, int ei) {

        //Base case
        if(si >= ei) {
            return;
        }
        
        int mid = si + (ei - si) / 2; // si + ei/2
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquer(arr, si, mid, ei);
    }
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) { 
        
        int listOfNumbers[] = {7, 8, 3, 1, 2};


        //Bubble Sort
        for(int i = 0; i < listOfNumbers.length - 1; i++) {
            for(int j = 0; j < listOfNumbers.length - i - 1; j++) {
                if(listOfNumbers[j] > listOfNumbers[j + 1]) {
                    //Swap
                    int temp = listOfNumbers[j];
                    listOfNumbers[j] = listOfNumbers[j+1];
                    listOfNumbers[j+1] = temp;
                }
            }
        }
        printArray(listOfNumbers);
        System.out.println();


        //Selection sort
        for(int i = 0; i < listOfNumbers.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < listOfNumbers.length; j++) {
                if(listOfNumbers[smallest] > listOfNumbers[j]) {
                    smallest = j;
                }
            }
            int temp2 = listOfNumbers[smallest];
            listOfNumbers[smallest] = listOfNumbers[i];
            listOfNumbers[i] = temp2;
        }
        printArray(listOfNumbers);
        System.out.println();


        //Insertion sort
        for(int i = 1; i < listOfNumbers.length; i++) {
            int key = listOfNumbers[i];
            int j = i-1;
            while(j >= 0 && (key < listOfNumbers[j])) {
                listOfNumbers[j + 1] = listOfNumbers[j];
                j--;
            }

            //Placement
            listOfNumbers[j + 1] = key;
        }
        printArray(listOfNumbers);
        System.out.println();


        //Merge sort
        int newArr[] = {6, 3, 9, 5, 2, 8};
        int n = newArr.length;

        divide(newArr, 0, n - 1);

        //Print merge 
        for(int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();


        //Quick sort
        quickSort(newArr, 0, n - 1);
        
        //Print 
        for(int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
