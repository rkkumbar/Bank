package in.demo;

public interface Demo {
	static void m() {
		System.out.println("hello");
	}
	abstract void m1();
	
	default void m2() {
		System.out.println("hello world");
	}
}