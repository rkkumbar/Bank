package in.demo;

public class StrEx {
public static void main(String[] args) {
	String s="Dinga";
	String s1="Dingi";
	String s2="Dinga";
	String s3=new String("Dinga");
	String s4="400";
	String s5="500";
	String s6=new String("Gulddu");
	if(s.equals(s3)) {
		System.out.println("values of both string are same");
	}
	else {
		System.out.println("different");
	}
	
	if(s1==s3) {
		System.out.println("address of both strings are same");
	}
	else {
		System.out.println("different");
	}
	
	
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(s.charAt(3));
	System.out.println(s.concat(s1));
	System.out.println(s4.concat(s5));
	System.out.println(s.codePointAt(2));
	System.out.println(s.codePointBefore(1));
	System.out.println(s3.compareTo(s6));
	System.out.println(s.endsWith("b"));
}
}
