import java.util.StringTokenizer;
public class Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st=new StringTokenizer("im,mini,durai java html");
		//System.out.println(st.nextToken());
		//System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken(","));
		}
	}

}
