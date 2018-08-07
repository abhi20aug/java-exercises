package learn.cursors;

//Vector.elemnet returns enum

import java.util.Enumeration;
import java.util.Vector;

public class A_EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> lang = new Vector<String>();
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("SERVLET");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");

        //lang.elements()//return enumeration
        //en.hasMoreElements() -> true/false
        //en.nextElement() -> returns String

        Enumeration<String> en = null;
        en = lang.elements();
        
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
	}

}
