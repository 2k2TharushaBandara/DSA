package lab1;

public class Lab1Q5 {
    
    public static int sumArray(int[] array, int size){
    if(size <= 0){
        return 0;
    }else{
        return array[size - 1] + sumArray(array, size - 1);
    }
}
    
    public static void main(String[] args) {
        int[] myArray = {2,7,9,0,4};
        System.out.println("The sum of all elements in the array is: "+sumArray(myArray,5));
    }

    
}
