package in.programming;

public class Demo2 {
public static void main(String[] args) {
	int max=1;
	int b[]= {300,750,60,90,100};
	for(int i=0;i<b.length;i++) {
		if(b[i]>max) {
			max=b[i];
		}
		
	}
	System.out.println(max);
}
}
