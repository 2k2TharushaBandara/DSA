package lab4;

import java.util.Random;

/*
Q.03:- 
Merge Sort: Requires O(n) extra space for merging.
Quick Sort: Requires O(log n) space due to the recursion stack.
*/


public class QuickAndMergeComparator {

    //create a random array
    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i=0; i<size; i++) {
            array[i] = random.nextInt(100000);
        }
        return array;
    }

    //Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left<right) {
            int mid = (left+right)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }

    //Merge method for merge sort
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid+1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;

        while (i<n1 && j<n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j<n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    //QuickSort
    public static void quickSort(int[] array, int start, int end) {
        if (start<end) {
            int p = partition(array, start, end);
            quickSort(array, start, p-1);
            quickSort(array, p+1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        for (int j = start; j<end; j++) {
            if (array[j]<pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, end);
        return i+1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    //Main method
    public static void main(String[] args) {
        int size = 100000;
        int[] array1 = createRandomArray(size);
        int[] array2 = array1.clone();

        long startTime = System.nanoTime();
        quickSort(array1, 0, array1.length-1);
        long endTime = System.nanoTime();
        System.out.println("Quick Sort time: "+(endTime-startTime)+" ns");

        startTime = System.nanoTime();
        mergeSort(array2, 0, array2.length-1);
        endTime = System.nanoTime();
        System.out.println("Merge Sort time: "+(endTime-startTime)+" ns");
    }

}

