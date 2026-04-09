import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex4();
		
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
		sc.close();
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
		System.out.println("");
		System.out.println("Os números ímpares são : ");
		for (int y:impares) {
			if (y==0) {
			}
			else {
				System.out.print(y+" ");
			}
		}
		sc.close();
	}
	static void ex3() {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		for (int i=0;i<num.length;i++) {
		System.out.println("Digite um número de 1 a 10 : ");
		num[i]=sc.nextInt();
		if (num[i]<1||num[i]>10) {
			System.out.println("Valor inválido, só números de 1 a 10 são aceitos.");
			i--;
		}
		}
		for (int i=9;i>=0;i--) {
			System.out.println(num[i]+" ");
		}
		sc.close();
	}
	static void ex4() {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[15];
		int maiorNumero=0;
		int posicaoMaiorNumero=num[0];
		for (int i=0;i<num.length;i++) {
			System.out.println("Digite um número : ");
			num[i]=sc.nextInt();
			if (num[i]>maiorNumero) {
				maiorNumero=num[i];
				posicaoMaiorNumero=i;
			}
		}
		System.out.println("o maior número está na posição "+posicaoMaiorNumero+" do vetor.");
		sc.close();
	}
	static void ex5() {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[8];
		for (int i=0;i<num.length;i++) {
			System.out.println("Digite um número : ");
			num[i]=sc.nextInt();
		}
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1; j++) {
			     if (num[j] > num[j + 1]) {
			         int temp = num[j];
			         num[j] = num[j + 1];
			         num[j + 1] = temp;
			        }
			    }
			}
		for(int j=0;j<num.length;j++) {
			System.out.println(num[j]+" " );
		}
		sc.close();
	}
	static void ex6() {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		for (int i=0;i<num.length;i++) {
			System.out.println("Digite um número : ");
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			if (num[i]>=7) {
				System.out.println(num[i]+" ");
			}
		}
		sc.close();
	}
	
}
