package StackArray;
import java.util.Scanner;

public class StackArray {
   //variables
   private int top,nElems,stackSize;
   private int[] stack;
   
   //constructor
   public StackArray(int stackSize){
    stackSize = this.stackSize;
    top = -1;
    stack = new int[stackSize];
    nElems = 0;
}

   
//Is the stack full?   
public boolean isFull(){
    if(top!=-1){
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
        top--;
    }
    return popValue;
}
    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Object creation
        System.out.println("Define the size of the stack: ");
        int size = input.nextInt();
        StackArray sa = new StackArray(size);
        
        
        System.out.println("Enter values to the stack....");
        int value = input.nextInt();
        sa.push(value);
        
    }
    
}
