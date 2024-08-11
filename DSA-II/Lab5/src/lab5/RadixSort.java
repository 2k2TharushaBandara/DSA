package lab5;

public class RadixSort {
    
    //Radix sort algorithm
    public static void radixSort(int[] array){
        //2D Array to store the numbers with their digits
        int[][] radixArray = new int[10][array.length];
        //Array to store the occurences of each digit
        int[] counts = new int[10];
        
        int exp=1;//starting from the 1's position
        
        while(findMax(array)/exp > 0){
        
        //Store values to the radix array
        for(int i=0; i<array.length; i++){
            int expDigit = (array[i]/exp)%10;
            radixArray[expDigit][counts[expDigit]] = array[i];
            counts[expDigit]++;
        }          
        
        //output the radixArray into the original array
        int index=0;
        for(int pos=0; pos<10; pos++){
            for(int i=0; i<counts[pos]; i++){
                array[index] = radixArray[pos][i];
                index++;
            }
            counts[pos] = 0; //Resetting the counts
        }
            System.out.println("Array when "+exp+"'s place is sorted: "); displayArray(array);
            
            exp=exp*10;
        }
        System.out.println();
        System.out.println("Final sorted array: "); displayArray(array);
    }
    
    //Find the maximum element
    public static int findMax(int[] array){
        int maxVal = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>maxVal){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
    
    //Display the array
    public static void displayArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
    
    /*
    //Count the number of digits in an integer 
    public static int digitCounter(int value){
        String strValue = String.valueOf(value);
        return strValue.length();
    }
    */
    
    //Main
    public static void main(String[] args) {
        
        int[] unsortedArray = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(unsortedArray);
        
    }
}
