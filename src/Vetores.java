import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex2();
		
}
	static void exemplo() {
		String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[2]);
		
		cars[2]="Chevrolet";
		System.out.println(cars[2]);
		System.out.println("");
		
		//for indexado
		for(int i=0; i<cars.length; i++) {
			System.out.println(i +" -> "+ cars[i]);
		}
		System.out.println("");
		int x = 0;
		while (x<cars.length){
			System.out.println(x + " -> " + cars[x]);
			x++;
		}
		
		//for nao indexado/iterativo
		System.out.println("");
		for (String c: cars ) {
			System.out.println(c);
		}
	}
	static void ex1() {
		Scanner sc=new Scanner(System.in);
		int[] numeros=new int[5];
		for (int i = 0; i<numeros.length; i++) {
			System.out.println("Escolha um número :");
			numeros[i]=sc.nextInt();
		}
		for (int i=0;i<numeros.length;i++) {
			System.out.println((i+1)+ " -> "+numeros[i]*2);
		}
	}
	static void ex2() {
		Scanner sc=new Scanner(System.in);
		int[] numeros = new int[10];
		int[] pares = new int[10];
		int[] impares=new int[10];
		int m=0;
		int n=0;
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Digite um número : ");
			numeros[i]=sc.nextInt();
			if (numeros[i]%2==0) {
				pares[m]=numeros[i];
				m++;
			}
			else if (numeros[i]%2!=0) {
				impares[n]=numeros[i];
				n++;
			}
		}
		System.out.println("Os números pares são : ");
		for (int x=0; x<m; x++) {
			System.out.print(pares[x]+" ");
		}
		System.out.println("Os números ímpares são : ");
		for (int y:impares) {
			if (y==0) {
			}
			else {
				System.out.print(y+" ");
			}
		}
	}
}
