package learn.generics;

public class genericTest {

	//type parameters can refer only object type, not primitive type
	
	public <E>void printArray(E [] s){
		System.out.println("");
		for (int i=0; i< s.length; i++)
			System.out.println(s[i]);
		
		//foreach: access array sequentially
		//two things
		for( E x:s)
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		genericTest gt = new genericTest();
		
		String countries[] = {"India","Sri Lanka","Nepal"};
		gt.printArray(countries);
		
		Integer intarray [] = {1,2,3};
		gt.printArray(intarray);
		
		int intaa [] = {2,2,2};
		//gt.printArray(intaa); //error 
		
	}

}
