package assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		System.out.println("Fibonacci series");
		int k=0;
		int d=1;
		System.out.println(k);
		System.out.println(d);
		for(int i=0;d<=8;i++) {
			int b=k+d;
			System.out.println(b);
			k=d;
			d=b;
	}

}
}
