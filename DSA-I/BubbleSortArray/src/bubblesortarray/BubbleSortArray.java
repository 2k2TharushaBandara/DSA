package bubblesortarray;

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
    
    // Check if the array is full
    public boolean isFull() {
    return nElems == array.length;
    }
    
    //Bubblesorting
    public void bubbleSort(){
        for(int j=nElems-1;j>0;j--){
            for(int i=0;i<j;i++){
            
                if(array[i]>array[i+1]){
                //Swap
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
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
        
        // Check if the array is full
        if (ba.isFull()) {
            System.out.println("The array is full.");
        } else {
            System.out.println("The array is not full.");
        }
        
        //display the original array
        ba.displayArray();
        
        //bubblesorting the array
        ba.bubbleSort();
        
        //display the array after bubblesorting
        System.out.println("After Bubblesorting:");
        ba.displayArray();
        
    }
    
}

