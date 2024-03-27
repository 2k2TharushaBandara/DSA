package studentperformanceanalysis;

//import java.util.Scanner;

public class Student {
    private int studentId;
    private int[]scores;
    //private int nElems;

public Student(int studentId, int[]newScores){
      this.studentId = studentId;
      this.scores = newScores;
      //nElems=0;
}
    //Getter methods
    public int getStudentID(){
        return studentId;
    }
    
    public int[]getScores(){
        return scores;
    }
    
     //Calculate average
    public double calculateAverage(){
        
        int sum=0;
        for(int i=0;i<scores.length; i++){
            sum = sum + scores[i];
        }
        
        
        return (double)sum/scores.length;
    }

    /*
    //Insert elements
    public void insert(){
        
        System.out.println("Enter values to the scores: ");
        Scanner userInput = new Scanner(System.in);
        for(int i=0;i<scores.length;i++){
            System.out.print("Score "+(i+1)+": ");
            //User input
            scores[i]= userInput.nextInt();
            nElems++;
            if(nElems==scores.length)
                System.out.println("ScoreCard is filled. Can't enter anymore values!");
        }
        System.out.println();
    }

     //Display array
    public void display(){
        for(int i=0; i<nElems; i++){
            System.out.print(scores[i]+"   ");
        }
        System.out.println();
    }
    */
    
   
    
}