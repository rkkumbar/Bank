package in.demo;

public class Student {
String name="Dinga";
void study() {
	int marks;
	name="Guldu";
	System.out.println(name);
	marks=430;
	System.out.println(marks);
}

public static void main(String[] args) {
	Student s=new Student();
	System.out.println(s.name);
	s.study();
	System.out.println(s.name);
}
}
