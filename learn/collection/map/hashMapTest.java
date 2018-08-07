package learn.collection.map;

import java.util.HashMap;
public class hashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashMap<String, String> hm = new HashMap<String, String>(); //generics defined
        hm.put("empName", "Abhishek");
        hm.put("EmpId", "1430");
        hm.put("PhonoNo", "9971621682");
        
        System.out.println(hm);
        
        //Operations
        System.out.println("fetch"+hm.get("empName"));
        System.out.println("isEmpty"+hm.isEmpty());
        System.out.println("size:"+hm.size());
        System.out.println("remove"+hm.remove("PhonoNo"));
        System.out.println("update"+hm.replace("EmpId", "1431"));
        System.out.println(hm);
		
	}

}
