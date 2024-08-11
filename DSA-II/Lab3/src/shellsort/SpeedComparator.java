package shellsort;

import java.util.Random;
import java.util.Scanner;

public class SpeedComparator {

    
    // Generate an array of random integers
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000); // Generate random numbers between 0 and 999
        }
        return array;
    }

    //Display the array
    public static void display(int[] array, int size){
        for(int i=0; i<size ; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
    
    //shell sort
    public static void shellSort(int[] array, int size){
        
        /*for(int interval = size/2; interval>=1 ; interval/=2){
            for(int i=interval ; i<size ; i++){
                for(int j=i-interval ; j>=0 ; j-=interval){ 
                   if(array[j]>array[j+interval]){
                       int temp = array[j];
                       array[j] = array[j+interval];
                       array[j+interval] = temp;
                    }
                }
            }
        }*/          //This code is not optimal
        
        for(int interval = size/2; interval>0; interval/=2){
            for(int i=interval; i<size; i++){
                int temp = array[i];
                int j;
                for(j=i; j>=interval && array[j-interval]>temp; j-=interval){
                    array[j] = array[j - interval];
            }
            array[j] = temp;
        }
    }
        //display(array,size);
    }
    
    //selection sort
    public static void selectionSort(int[] array, int size){
        
        for(int i=0;i<size;i++){
            int minValue = array[i];//Assuming as the minimum value
            int minIndex = i;//The index of the minimum value
            
            //Finding the minimum value
            for(int j=size-1;j>i;j--){
               if(array[j]<minValue){
                  minValue = array[j];
                  minIndex=j;//This is what we actually need in order to swap(The index of the minimum value)
               }
            }
               //swap
               int temp = array[i];
               array[i] = array[minIndex];
               array[minIndex]=temp;
        }
        //display(array,size);
      }
    
    //Bubble sort
    public static void bubbleSort(int[] array, int size){
        for(int j=size-1;j>0;j--){
            for(int i=0;i<j;i++){
            
                if(array[i]>array[i+1]){
                //Swap
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
    }
        //display(array,size);
    }
    
    //Insertion Sort 
    public static void insertionSort(int[] array, int size){
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
        //display(array,size);
    }
    
    public static void main(String[] args) {
        //variables
        long startTime,endTime;
        
        System.out.println("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] randomArray = generateRandomArray(size);
        int[] myArray;
        //System.out.println("The array: ");
        //display(randomArray,size);
        
        //shell sort
        myArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        shellSort(myArray,size);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to sort by shell sort: "+(endTime-startTime)+" ms");
        
        //selection sort
        myArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        selectionSort(myArray,size);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to sort by selection sort: "+(endTime-startTime)+" ms");
        
        //insertion sort
        myArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        insertionSort(myArray,size);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to sort by insertion sort: "+(endTime-startTime)+" ms");
        
        //bubble sort
        myArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        bubbleSort(myArray,size);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to sort by bubble sort: "+(endTime-startTime)+" ms");
    }
    
    
}
