package lab1;

public class Lab1Q2 {
    
    public static int fib(int fn){
        if(fn==0){
            return 0; 
        }else if(fn==1){
            return 1;
        }else{
            return fib(fn-1)+fib(fn-2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    
}
