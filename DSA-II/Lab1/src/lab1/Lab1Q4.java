package lab1;

public class Lab1Q4 {
    static int minIndex=0;
    
    public static int findMIN(int[] array, int size){
        if(size==-1){
            return minIndex;
        }else if(array[minIndex]<=array[size]){
            return findMIN(array,size-1);
        }else{
            minIndex = size;
            return findMIN(array,size-1);
        }
        
        /*if(size == 1){
            return array[0];
        }else{
            return Math.min(array[size - 1], findMIN(array, size - 1));
        }*/
            
    }
    
    public static void main(String[] args) {
        int[] myArray = {-1,0,-8,6,-100};
        int myArraySize = 5;
        System.out.println("The minimum Value of the array is: "+myArray[findMIN(myArray,myArraySize-1)]);
    }
}
