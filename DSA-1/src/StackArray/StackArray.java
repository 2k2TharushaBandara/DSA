package StackArray;
import java.util.Scanner;

public class StackArray {
   //variables
   private static int top,stackMaxSize;
   private int nElems;
   private static int[] stack;
   
   //constructor
   public StackArray(int stackSize){
    this.stackMaxSize = stackSize;
    top = -1;
    stack = new int[stackMaxSize];
    nElems = 0;
}

   
//Is the stack full?   
public boolean isFull(){
    if(top >= stackMaxSize-1){
        return true;
    }
   return false; 
}   

//Is the stack empty?
public boolean isEmpty(){
    if(top==-1){
        return true;
    }
   return false; 
}

//What is the TOP value?
public int peek(){
    return top;
}

//Inserting values to the stack
public void push(int value){
   if(isFull()){
       System.out.println("Can't insert. Stack is full!");
   }
   else{
       top++;
       stack[top] = value;
   }  
}   

//Removing values from the stack
public int pop(){
    int popValue=0;
    if(isEmpty()){
        System.out.println("Can't pop. Stack is empty!");
    }
    else{
        popValue = stack[top];
        stack[top] = 0;
        top--;
    }
    return popValue;
}

    //Display the stack
    public void displayStack(){
        System.out.println("The Stack:");
        for(int i=0; i<=top; i++){
            System.out.print(stack[i]+"  ");
        }
        System.out.println();
    }

    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Object creation
        System.out.println("Define the size of the stack: ");
        int size = input.nextInt();
        StackArray sa = new StackArray(size);
        
        //Pushing values
        System.out.println("Enter values to the stack....");
        while(top < stackMaxSize-1){
              System.out.println("The current Top value is: " + (sa.peek()+1));
              System.out.print("Value : ");
              sa.push(input.nextInt());
        }
        
        sa.displayStack();
        
        //Popping values
        System.out.println("Popping the top = "+ sa.peek()+" value..");
        sa.pop();
        sa.displayStack();
        System.out.println("The current Top value is: " + sa.peek());
        System.out.println("Popping the top = "+ sa.peek()+" value..");
        sa.pop();
        sa.displayStack();
        System.out.println("The current Top value is: " + sa.peek());
        
        
    }
    
}
