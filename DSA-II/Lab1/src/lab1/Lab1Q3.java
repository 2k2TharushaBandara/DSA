package lab1;

public class Lab1Q3 {
    
    public static int sumToN(int n){
        if(n==0){
            return 0;
        }else{
            return n+sumToN(n-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The sum from 1 to the given number:"+sumToN(5));
    }
}
