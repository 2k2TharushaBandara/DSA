package lab1;

public class Lab1Q1 {

    public static int triangle(int n){
        //if(n==1)
        //  return 1;
        //else
            return( n + triangle(n-1) );
    }
    
    public static void main(String[] args) {
        triangle(5);
    }
    
}

// This will result in a StackOverFlowError.
// Endless number of values are added without a limit.