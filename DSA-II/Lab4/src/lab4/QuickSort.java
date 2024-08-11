package lab4;

public class QuickSort{

    //quick sort
    public static void quickSort(int[] array, int start, int end){
        if(start<end){
            int p = partition(array, start, end);
            quickSort(array, start, p-1);
            quickSort(array, p+1, end);
        }
    }

    //partition 
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        for (int j=start; j<end; j++) {
            if (array[j]<pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, end);
        return i+1;
    }

    //swap
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //print the array
    public static void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args) {
        int[] array = {4, 10, 2, 19, 13, 15, 8, 11, 14, 5};
        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }
}

/*Q.02:-

Bubble Sort: It repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
This process is repeated until the list is sorted.

Merge Sort: It divides the array into two halves, recursively sorts them, and then merges the sorted halves.

Quick Sort: It selects a pivot element and partitions the array into two halves around the pivot.
It then recursively sorts the halves.
However, it is generally faster in practice compared to other algorithms.
*/