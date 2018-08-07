package learn.cursors;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class C_ListIteratorTest {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);

        ListIterator<Integer> litr = null;
        litr=li.listIterator();

        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

	}

}
