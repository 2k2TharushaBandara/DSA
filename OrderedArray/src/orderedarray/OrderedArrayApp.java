package orderedarray;

public class OrderedArrayApp {

    public static void main(String[] args) {
        //setting max size
        int maxSize = 5;
        OrderedArray orderedArray = new OrderedArray(maxSize);
        
        //insert
        orderedArray.insert(10);
        orderedArray.insert(-20);
        orderedArray.insert(30);
        orderedArray.insert(920);
        orderedArray.insert(40);

        // Check if the array is full
        if (orderedArray.isFull()) {
            System.out.println("The array is full.");
        } else {
            System.out.println("The array is not full.");
        }
        
        //print
        System.out.print("Ordered Array: ");
        orderedArray.display();

        //search
        System.out.println("Is 30 there? " + orderedArray.find(30));
        System.out.println("Is 50 there? " + orderedArray.find(50));

        //delete
        System.out.println("Deleting 20: " + orderedArray.delete(20));

        // Check if the array is full
        if (orderedArray.isFull()) {
            System.out.println("The array is full.");
        } else {
            System.out.println("The array is not full.");
        }
        
        //print after deletion
        System.out.print("Ordered Array after deletion: ");
        orderedArray.display();
    }
}
