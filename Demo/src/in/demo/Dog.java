package in.demo;

public class Dog {
	String name="puppy";
	double height=2.5;
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	void jump() {
		double height=7.0;
		System.out.println(name+" is of height "+this.height+" is going to "
				+ "jump a wall of height "+ height);
	}
	public static void main(String[] args) {
		Dog d=new  Dog();
		d.name="Shera";
		d.height=3;
		d.sleep();
		d.jump();
		
		Dog d1=new Dog();
		d1.name="shera";
		d1.height=3;
		System.out.println(d1.name);
		System.out.println(d1.height);
		d1.sleep();
		d1.jump();
	}
	
}
