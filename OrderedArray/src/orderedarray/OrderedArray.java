package orderedarray;

public class OrderedArray {

    // variables
    private int[] a;
    private int nElems;

    // constructors
    public OrderedArray(int max) {
        a = new int[max];
        nElems = 0;
    }

    // methods

    // insert
    public void insert(int value) {
        int i;
        for (i = 0; i < nElems; i++) {
            //check whether the value is less/greater than the previous value
            if (a[i] > value) {
                break;
            }
        }
        //shifting elements
        for (int j = nElems; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = value;
        nElems++;
    }
    
    // Check if the array is full
    public boolean isFull() {
    return nElems == a.length;
}

    // display
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    // find
    public boolean find(int searchKey) {
        for (int i = 0; i < nElems; i++) {
            if (a[i] == searchKey) {
                return true;
            }
        }
        return false;
    }

    // delete
    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (a[i] == value) {
                // Shift elements to fill the gap
                for (int j = i; j < nElems - 1; j++) {
                    a[j] = a[j + 1];
                }
                //last element=0
                a[nElems - 1] = 0;
                nElems--;
                return true;
            }
        }
        return false;
    }
}
