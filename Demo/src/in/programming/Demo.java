package in.programming;

public class Demo {
public static void main(String[] args) {
	int b[]= {30,70,60,90,10};
	int a[]=new int[b.length];
	int c;
	for(int i=0;i<b.length-1;i++) {
			if(b[i]>b[i+1]) {
				c=b[i];
			}
			else {
				c=b[i+1];
			}
		a[i]=c;
			
		System.out.print(a[i]+ " ");
	}


}
}
