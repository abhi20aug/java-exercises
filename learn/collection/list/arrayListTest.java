package learn.collection.list;
import java.util.ArrayList;
public class arrayListTest {

	
	// similar to List/Dir in python
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("string object");
		al.add(new StringBuffer("BBB"));
		al.add(new Exception("my exception"));
		al.add(new Thread());
		System.out.println(al);
		
		/*
		 * By default it allows all type of element
		 * if we want to restrict only particular type also called generics
		 */
		
		ArrayList<String> als = new ArrayList<>();
		als.add("string object");
		//als.add(new StringBuffer("BBB")); //error
		//als.add(new Exception("my exception")); //error
		//als.add(new Thread()); //error
		System.out.println(als);
	}

}
