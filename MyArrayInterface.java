package Projects;
import java.util.*;

public interface MyArrayInterface<T> {

    //declare method toString()
    String toString();

    //declare method count(T target)
    int count(T target);

    //declare method removeAll()
    void removeAll(T target);
    // Removes an element e from this collection such that e.equals(target)
    // and returns true. If no such element exists, returns false.

    //declare method combine - this is a collection
    ArrayCollection<T> combine(ArrayCollection<T>other);
}
