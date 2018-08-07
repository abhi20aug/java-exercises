package learn.generics;

public class genericClassEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		newTwoParamGeneric<Integer> ntpg = new newTwoParamGeneric<Integer>();
		
        SimpleGen<String, Integer> sample
        = new SimpleGen<String, Integer>("JAVA2NOVICE", 100);
        sample.printTypes();

	}

}

class newTwoParamGeneric<T>
{
	public void printType()
	{
		System.out.println();
	}

}


class SimpleGen<U, V>{
     
    //type U object reference
    private U objUreff;
    //type V object reference
    private V objVreff;
     
    //constructor to accept object type U and object type V
    public SimpleGen(U objU, V objV){
        this.objUreff = objU;
        this.objVreff = objV;
    }
     
    public void printTypes(){
        System.out.println("U Type: "+this.objUreff.getClass().getName());
        System.out.println("V Type: "+this.objVreff.getClass().getName());
    }
}