package InsertionSortArray;

import java.util.Scanner;

public class InsertionSortArrayMedian {

//Variables
    private int[] array;
    private int nElems;
    
    //Constructor
    public InsertionSortArrayMedian(int max){
        array = new int[max];
        nElems = 0;
    }
    
    //Insert elements
    public void insert(){
        
        System.out.println("Enter values to the array: ");
        Scanner userInput = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.print("Value "+(i+1)+": ");
            //User input
            array[i]= userInput.nextInt();
            nElems++;
            if(nElems==array.length)
                System.out.println("Array is filled. Can't enter anymore values!");
        }
        System.out.println();
    }
    
    //Display array
    public void display(){
        for(int i=0; i<nElems; i++){
            System.out.print(array[i]+"   ");
        }
        System.out.println();
    }
    
     public double median() {
        // First, sort the array using insertion sort
        insertionSort();

        // Calculate the index of the middle element
        int middleIndex = nElems / 2;

        // Check if the number of elements is odd or even
        if (nElems % 2 == 0) {
            // If the number of elements is even, return the average of the two middle values
            return (array[middleIndex - 1] + array[middleIndex]) / 2.0;
        } else {
            // If the number of elements is odd, return the middle value
            return array[middleIndex];
        }
    }
    
    //Insertion Sort Algorithm
    public void insertionSort(){
        for (int i = 1; i < array.length; i++) {
            //setting the value I want to check
            int key = array[i];
            
            //shift elements
            int j;
            for(j = i-1 ; j >= 0 && array[j] > key ;j--){
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        //Setting the array length
        Scanner userInput = new Scanner(System.in);
        System.out.print("Set the array length: ");
        int length= userInput.nextInt();
        //object creation
        InsertionSortArrayMedian ssa = new InsertionSortArrayMedian(length);
        System.out.println();
        
        //Insert values(User input)
        ssa.insert();
        
        //Insert values(Passing values)
        /*ssa.insert(12);
        ssa.insert(176);
        ssa.insert(6);
        ssa.insert(90);
        ssa.insert(12);*/
        
        //Display the original array
        System.out.println("The Original Array: ");
        ssa.display();
        
        System.out.println();
        
        //Selection sort Algorithm
        ssa.insertionSort();
        System.out.println("The Sorted Array: ");
        ssa.display();
        
        System.out.println("Median: "+ssa.median());
       
        System.out.println();
        
    }
    
}
    
    



