package studentperformanceanalysis;

import java.util.Scanner;

public class StudentPerformanceAnalysis {
      private static Student[]students;

public StudentPerformanceAnalysis(Student[] averages){
    this.students = averages;
}

    public void sortAverages(){
    for(int i=0; i<students.length-1; i++) {
       for(int j=0; j<students.length-1; j++) {
           if (students[j].calculateAverage() > students[j + 1].calculateAverage()) {
               // Swap
               Student temp = students[j];
               students[j] = students[j + 1];
               students[j + 1] = temp;
           }
       }
    }
  }
  
    public Student searchStudent(int studentID) {
        int left = 0;
        int right = students.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (students[mid].getStudentID() == studentID) {
                return students[mid];
            } else if (students[mid].getStudentID() < studentID) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    
    public Student findBestPerformer(){
         Student bestStudent = students[0];
    for (int i = 1; i < students.length; i++) {
        if (students[i].calculateAverage() > bestStudent.calculateAverage()) {
            bestStudent = students[i];
        }
    }
    return bestStudent;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Input number of students and subjects
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Input exam scores for each student
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter student ID: ");
            int studentID = scanner.nextInt();
            int[] scores = new int[numSubjects];
            System.out.println("Enter exam scores for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter score for Subject " + (j + 1) + ": ");
                scores[j] = scanner.nextInt();
            }
            students[i] = new Student(studentID, scores);
        }
        
        // Calculating average score of each student
        for (Student student : students) {
            System.out.println("Average score of Student ID " + student.getStudentID() + ": " + student.calculateAverage());
        }
        
        //object creation
        StudentPerformanceAnalysis spa = new StudentPerformanceAnalysis(students);
        
        //The best performer
        System.out.println("The best performer is :"+spa.findBestPerformer());
        
        
        // Sorting students based on average scores
        spa.sortAverages();
        System.out.println("Students sorted by average scores:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentID() + ", Average Score: " + student.calculateAverage());
        }

        // Searching for a student by ID
        System.out.print("Enter student ID to search: ");
        int searchID = scanner.nextInt();
        Student searchedStudent = spa.searchStudent(searchID);
        if (searchedStudent != null) {
            System.out.println("Student is not here");
        }

    }
    
}

