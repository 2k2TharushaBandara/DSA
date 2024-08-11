package lab1;

public class Lab1Q6 {
    
    public static String reverseString(String str){
    if(str.isEmpty()){
        return str;
    }else{
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
    
     public static void main(String[] args) {
        String original = "Tharusha";
         System.out.println("The reversed word of "+original+" is: "+reverseString(original));
    }

    
}
