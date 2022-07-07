
public class MainApp {

	public static void main(String[] args) {
		int a=3,b=5,c=1,d=2;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("C: "+c);
		System.out.println("D: "+d);
		
		b=c;
		c=a;
		a=d;
		d=b;
		
		System.out.println();
		System.out.println("Despues del cambio:");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("C: "+c);
		System.out.println("D: "+d);

	}

}
