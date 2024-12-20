package in.demo;

public class CMtest {
	public static void main(String[] args) {
		Cow c=new Cow();
		Milk bucket=c.gives();
		System.out.println(bucket);
		
	}
}
