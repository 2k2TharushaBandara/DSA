package lab1;

public class Lab1Q7 {
    
    public static int totalMatches(int n){
    if(n<=1){
        return 0; 
    }else{
        return (n/2) + totalMatches(n/2);
    }
}
    
    public static void main(String[] args) {
        int teams = 8;
        System.out.println("Total matches needed: " + totalMatches(teams));
}


    
}
