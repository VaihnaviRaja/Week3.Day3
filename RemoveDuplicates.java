package Week3.Day3;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String companyName="Google";
		char[] cs = companyName.toCharArray();
		Set<Character> s= new LinkedHashSet();
		for(int i=0;i<=cs.length-1;i++)
		{
			System.out.println(cs[i]);
			s.add(cs[i]);
		}
		System.out.println(s);
		

	}

}
