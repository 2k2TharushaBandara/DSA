package BubbleSortArray;

public class BubbleSortArray {

    //Variables
    private int[] array;
    private int nElems;
    
    // constructors
    public BubbleSortArray(int max) {
        array = new int[max];
        nElems=0;
    }
    
    //Inserting values to the array
    public void insert(int value){
        if(nElems<array.length){
            array[nElems]=value;
        
        nElems++;
        }
    }
    
    //display the array
    public void displayArray(){
        System.out.println("Array: ");
        for(int i=0;i<nElems;i++){
            System.out.print(array[i]+"   ");
        }
        System.out.println();
        System.out.println();
    }
    
    //Bubblesorting
    public void bubbleSort() {
    // Outer loop from the left
    for (int left = 0, right = array.length - 1; left < right; left++, right--) {
        // Loop from left to right
        for (int i = left; i < right; i++) {
            if (array[i] > array[i + 1]) {
                // Swap if the current element is greater than the next
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        
        // Loop from right to left
        for (int i = right - 1; i > left; i--) {
            if (array[i] < array[i - 1]) {
                // Swap if the current element is smaller than the previous
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
    }
}

    
    public static void main(String[] args) {
        
        //Array object creation with maximum 5 elements allowed
        BubbleSortArray ba=new BubbleSortArray(5);
        
        //inserting values to the array
        ba.insert(23);
        ba.insert(200);
        ba.insert(56);
        ba.insert(10);
        ba.insert(9);
        
        //display the original array
        ba.displayArray();
        
        //bubblesorting the array
        ba.bubbleSort();
        
        //display the array after bubblesorting
        System.out.println("After Bubblesorting:");
        ba.displayArray();
        
    }
    
}

