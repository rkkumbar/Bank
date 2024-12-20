package in.demo;

public class Demo1 {
public static void main(String[] args) {
	int a[]= {5,6,7,8};
	int a1[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		int b=1;
		for(int j=0;j<a.length;j++) {
			if(a[j]!=a[i]) {
				b*=a[j];
			}
			a1[i]=b;
			
		}
		System.out.print(a1[i]+" ");
	}
}
}
																																																															