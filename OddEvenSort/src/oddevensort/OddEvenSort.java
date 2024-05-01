package oddevensort;

public class OddEvenSort {

    private long[] array;
    private int nElms;
    private boolean sorted = false;
    private int max;

    public OddEvenSort(int max) {
        this.max=max;
        array = new long[max];
        nElms = 0;
        
    }

    public void insert(long value) {
        if(nElms<=max){
        array[nElms] = value;
        nElms++;
        }
    }

    public void display() {
        for (int i = 0; i < nElms; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void bubbleSort() {
        while (!sorted) {
            sorted = true;
            // Odd Pass
            for (int i = 1; i < nElms - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    swap( i, i + 1);
                    sorted = false;
                }
            }
            // Even Pass
            for (int i = 0; i < nElms - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    swap( i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        OddEvenSort obj = new OddEvenSort(10);
        
        obj.insert(8);
        obj.insert(5);
        obj.insert(1);
        obj.insert(3);
        obj.insert(9);
        obj.insert(6);
        obj.insert(10);
        obj.insert(2);
        obj.insert(4);
        obj.insert(7);
        

        System.out.println("Original array:");
        obj.display();
        obj.bubbleSort();
        
        System.out.println("Sorted array:");
        obj.display();
    }
}

/*public class OddEvenSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2, 1, 9, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        oddEvenSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void oddEvenSort(int[] array) {
        int n = array.length;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            // Odd Pass
            for (int i = 1; i < n - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
            // Even Pass
            for (int i = 0; i < n - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
*/