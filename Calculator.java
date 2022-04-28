import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a, b;
		System.out.println("******Calculator******");
		System.out.println("Ingrese Valor de a");
		a =sc.nextInt();
		System.out.println("Ingrese Valor de b");
		b =sc.nextInt();

		System.out.println("La suma de "+a+" + " +b+" es: "+add(a,b));
		System.out.plrinln("La resta de"+a+" - " +b+" es:");

	}
	
	//METODOS

	public static int add(int a, int b){
		int suma;
		suma = a+b;
		return suma;
	}
	public static int sub(int a, int b){
		return 0;
	}
	public static int mul(int a, int b){
		return 0;
	}
	public static int div(int a, int b){
		return 0;
	}
	public static int mod(int a, int b){
		return 0;
	}
}
