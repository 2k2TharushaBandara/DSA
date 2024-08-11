package insertionsortarray;

import java.util.Scanner;

public class InsertionSortArray {

//Variables
    private int[] array;
    private int nElems;
    
    //Constructor
    public InsertionSortArray(int max){
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
            
            /*shift elements
            int j;
            for(j = i-1 ; j >= 0;j--){
                if(array[j] > key ){
                    array[j+1] = array[j];
                    array[j] = key;
                }
            }*/
        }
    }
    
    public static void main(String[] args) {
        //Setting the array length
        Scanner userInput = new Scanner(System.in);
        System.out.print("Set the array length: ");
        int length= userInput.nextInt();
        //object creation
        InsertionSortArray ssa = new InsertionSortArray(length);
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
        
        System.out.println();
        
    }
    
}
    
    

