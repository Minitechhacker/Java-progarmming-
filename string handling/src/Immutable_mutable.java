
public class Immutable_mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String is immutable");
		String name="mini";
		System.out.println("Appending a name to original :" +name.concat("durai"));
		System.out.println("original name :"+name);
		System.out.println("**********************************************************");
		System.out.println("String is mutable");
		StringBuffer name1=new StringBuffer("mini");
		System.out.println("Appending a name to original :" +name1.append("durai"));
		System.out.println("original name :"+name1);
	}

}
