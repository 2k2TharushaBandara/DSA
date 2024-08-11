package noduparray;

public class NoDupArrayApp {

    public static void main(String[] args) {
        //setting max size
        int maxSize = 5;
        NoDupArray noDupArray = new NoDupArray(maxSize);

        //insert
        noDupArray.insert(10);
        noDupArray.insert(20);
        noDupArray.insert(30);
        noDupArray.insert(20);//duplicate value
        noDupArray.insert(40);
        noDupArray.insert(35);

        // Check if the array is full
        if (noDupArray.isFull()) {
            System.out.println("The array is full.");
        } else {
            System.out.println("The array is not full.");
        }
        
        //print
        System.out.print("Original Array: ");
        noDupArray.display();

        //search
        System.out.println("Is 30 there? " + noDupArray.find(30));
        System.out.println("Is 50 there? " + noDupArray.find(50));

        //delete
        System.out.println("Deleting 20: " + noDupArray.delete(20));

        // Check if the array is full
        if (noDupArray.isFull()) {
            System.out.println("The array is full.");
        } else {
            System.out.println("The array is not full.");
        }
        
        //print after deletion
        System.out.print("Array after deletion: ");
        noDupArray.display();
    }
}
