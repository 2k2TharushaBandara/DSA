package shellsort;

import java.util.Scanner;

public class ShellSort {

    public static void shellSort(int[] array, int size){
        int pass=0;
        for(int interval = size/2; interval>=1 ; interval/=2){
            System.out.print("Array after pass "+pass+" : ");display(array,size);
            pass++;
            for(int i=interval ; i<size ; i++){
                for(int j=i-interval ; j>=0 ; j-=interval){ 
                   if(array[j]>array[j+interval]){
                       int temp = array[j];
                       array[j] = array[j+interval];
                       array[j+interval] = temp;
                    }
                }
            }
        }
        System.out.print("Array after pass "+pass+" : ");display(array,size);
    }    
    
    public static void display(int[] array, int size){
        for(int i=0; i<size ; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter the size of the array: ");
        //size=9
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int[] array = new int[user];
        System.out.println("Enter values to the array:");
        //array=33,31,40,8,12,17,17,25,42  
        for(int i=0; i<user ; i++){
            System.out.print("Array["+i+"] = ");
            array[i] = input.nextInt();
        }
        
        
        display(array, user);
        
        shellSort(array, user);
        System.out.print("Sorted Array: ");display(array, user);
    }
    
}
