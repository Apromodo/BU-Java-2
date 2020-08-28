import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> s1=new HashSet<String>();
		
		s1.add("londra");
		s1.add("paris");
		s1.add("roma");
		s1.add("madrir");
		s1.add("dc");
		s1.add("londra");
		
		System.out.println(s1);
		
		LinkedHashSet<String> s2=new LinkedHashSet<String>();
		
		s2.add("londra");
		s2.add("paris");
		s2.add("roma");
		s2.add("madrir");
		s2.add("dc");
		s2.add("londra");
		
		System.out.println(s2);
		
		TreeSet<String> s3=new TreeSet();
		
		s3.add("londra");
		s3.add("paris");
		s3.add("roma");
		s3.add("madrir");
		s3.add("dc");
		s3.add("londra");
		
		System.out.println(s3);
		
	}
	

}
