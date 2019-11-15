package Projects;
import java.util.*;

public class ArrayCollection<T> implements MyArrayInterface<T> {


    protected final int DEFCAP = 100;   //default capacity
    protected T[] elements;             //hold collection elements
    protected int numElements = 0;      //number of elements in this collection

    //set by find method
    protected boolean found;   //true if target is found
    protected int location;    //indicates location of target if found


    public ArrayCollection(int capacity) {
        elements =(T[])new Object[capacity];
    }

    protected void find(T target)
    // Searches elements for an occurrence of an element e such that
    // e.equals(target). If successful, sets instance variables found to true
    // and location to the index of e. If not successful, sets found to false.
    {
    location =0; found = false; while(location<numElements)

        if (elements[location].equals(target)) {
            found = true;
            return;
        } else location++;
    }




    //declare method toString()
    public String toString() {
      return String.format(" ", elements, numElements, location);
    }

    //declare method count(T target)
    public int count(T target) {
        //returns the number of elements in this collection
        return numElements;
    }

    //declare method removeAll()
    public void removeAll(T target) {
        // Removes an element e from this collection such that e.equals(target)
        // and returns true; if no such element exists, returns false.

        find(target);
        if(found) {
            elements[location] = elements[numElements - 1];
            elements[numElements - 1] = null;
            numElements--;
        }
    }

    //declare method combine - this is a collection
    public ArrayCollection<T> combine(ArrayCollection<T>other) {
      return new ArrayCollection<>(numElements);
    }
}
