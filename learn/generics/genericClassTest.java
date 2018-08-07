package learn.generics;

import java.util.ArrayList;

//generic class
class myData<T>{
	int a = 10;
	T i;
	public void add(T i) {
		System.out.println(i);		
	}
	}


public class genericClassTest {

	public static void main(String[] args) {
	
		myData<Integer> mi = new myData<Integer>();
		mi.add(10);

		myData<String> ms = new myData<String>();
		ms.add("string generic");

		myData<ArrayList> mal = new myData<ArrayList>();
		ArrayList<String> as = new ArrayList<String>();
		as.add("first");
		as.add("second");
 		mal.add(as);
		
	}
}
