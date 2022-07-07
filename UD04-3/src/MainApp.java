
public class MainApp {

	public static void main(String[] args) {
		int x =13, y=7;
		double n=3.4, m=8.56;
		
		System.out.println("Valor X: "+x);
		System.out.println("Valor Y: "+y);
		System.out.println("Valor N: "+n);
		System.out.println("Valor M: "+m);
		System.out.println();
		System.out.println("Suma: "+x+"+"+y+"="+ (x+y));
		System.out.println("Resta: "+x+"-"+y+"="+ (x-y));
		System.out.println("Multiplicación: "+x+"*"+y+"="+ (x*y));
		System.out.println("División: "+x+"/"+y+"="+ (x/y));
		System.out.println("Resto: "+ (x%y));
		System.out.println();
		System.out.println("Suma: "+n+"+"+m+"="+ (n+m));
		System.out.println("Resta: "+n+"-"+m+"="+ (n-m));
		System.out.println("Multiplicación: "+n+"*"+m+"="+ (n*m));
		System.out.println("División: "+n+"/"+m+"="+ (n/m));
		System.out.println("Resto: "+ (n%m));
		System.out.println();
		System.out.println("Suma: "+x+"+"+n+"="+ (x+n));
		System.out.println("División: "+y+"/"+m+"="+ (y/m));
		System.out.println("Resto: "+ (y%m));
		System.out.println();
		System.out.println("Valor doble de X: "+(x*2));
		System.out.println("Valor doble de Y: "+(y*2));
		System.out.println("Valor doble de N: "+(n*2));
		System.out.println("Valor doble de M: "+(m*2));
		System.out.println();
		System.out.println("Suma de todas las variables: "+(x+y+n+m));
		System.out.println("Multiplicación de todas las variables: "+(x*y*n*m));
		
	}

}
