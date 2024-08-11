package noduparray;

public class NoDupArray {

    // variables
    private long[] array;
    private int nElems;

    // constructors
    public NoDupArray(int max) {
        array = new long[max];
        nElems = 0;
    }

    // methods

    // insert
    public void insert(long value) {
        if (!find(value)) {
            array[nElems] = value;
            nElems++;
        } else {
            System.out.println("Duplicate value!! ("+value+")");
        }
    }

    // Check if the array is full
    public boolean isFull() {
    return nElems == array.length;
}

    
    // display
    public void display() {
        for (int i=0; i<nElems; i++) {
            System.out.print(array[i]+"   ");
        }
        System.out.println();
    }

    // find
    public boolean find(long searchKey) {
        for (int i = 0; i < nElems; i++) {
            if (array[i] == searchKey) {
                
                return true;
            }
        }
        return false;
    }

    // delete
    public boolean delete(long value) {
        for (int i=0; i<nElems; i++) {
            if (array[i]==value) {
                //shift elements to fill the gap
                for (int j=i; j<nElems-1; j++) {
                    array[j]=array[j+1];
                }
                //last element=0
                array[nElems-1]=0;
                nElems--;
                return true;
            }
        }
        return false;
    }
}
