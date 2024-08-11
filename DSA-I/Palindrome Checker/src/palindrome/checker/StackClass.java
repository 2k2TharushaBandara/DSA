package palindrome.checker;

public class StackClass {
   //variables
   private static int top,stackMaxSize;
   private int nElems;
   private static int[] stack;
   
   //constructor
   public StackClass(int stackSize){
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
}