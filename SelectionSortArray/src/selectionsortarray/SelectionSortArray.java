package selectionsortarray;
import java.util.Scanner;

public class SelectionSortArray {
    
    //Variables
    private int[] array;
    private int nElems;
    
    //Constructor
    public SelectionSortArray(int max){
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
    
    //Selection sort//Insert elements
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

    public void selectionSort(){
        
        for(int i=0;i<nElems;i++){
            int minValue = array[i];//Assuming as the minimum value
            int minIndex = i;//The index of the minimum value
            
            //Finding the minimum value
            for(int j=nElems-1;j>i;j--){
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
        
      }
        
    
    public static void main(String[] args) {
        //Setting the array length
        Scanner userInput = new Scanner(System.in);
        System.out.print("Set the array length: ");
        int length= userInput.nextInt();
        //object creation
        SelectionSortArray ssa = new SelectionSortArray(length);
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
        
        //Selection sort Algorithm
        ssa.selectionSort();
        System.out.println("The Sorted Array: ");
        ssa.display();
        
        
    }
    
}
