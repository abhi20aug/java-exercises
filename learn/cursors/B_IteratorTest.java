package learn.cursors;

//ArrayList.iterator -> returns Iterator
/*You can iterate through any collection object by using Iterator object. 
 * It provides two methods to iterate. 
 * The hasNext() method returns true if the iteration has more elements. 
 * The next() method returns the next element in the iteration. 
 * Below example shows how to iterate through an ArrayList.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B_IteratorTest {

	public static void main(String[] args) {
		
		String removeElem = "Perl";
        
		List<String> myList = new ArrayList<String>();
        
		myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        
        System.out.println("Before remove:");
        System.out.println(myList);
        
        //iterator
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);

	}

}
