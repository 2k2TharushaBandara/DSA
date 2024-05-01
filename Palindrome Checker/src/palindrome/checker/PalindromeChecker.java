package palindrome.checker;

import java.util.Scanner;


public class PalindromeChecker {
        public static boolean isPalindrome(String input) {

        //process the input
        String modifiedStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //string into 2 halves
        int mid = modifiedStr.length() / 2;
        String firstHalf = modifiedStr.substring(0, mid);
        String secondHalf = modifiedStr.length() % 2 == 0 ? modifiedStr.substring(mid) : modifiedStr.substring(mid + 1);

        //push 1st half into a stack
        StackClass stack = new StackClass(100);
        for (char c : firstHalf.toCharArray()) {
            stack.push(c);
        }

        //enque 2nd half into a queue
        QueueClass queue = new QueueClass(100);
        for (char c : secondHalf.toCharArray()) {
            queue.enqueue(c);
        }

        //compare characters
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop()!= queue.dequeue()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        //check examples
        System.out.println("Is 'madam' palindrome? "+isPalindrome("madam"));    
        System.out.println("Is 'level' palindrome? "+isPalindrome("level"));    
        System.out.println("Is 'hello' palindrome? "+isPalindrome("hello"));
        
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word/sentense: ");
        String usrIn = input.nextLine();
        
        
        

        System.out.println("Is '"+usrIn+"' palindrome? "+isPalindrome(usrIn));
        
        
    }
}

