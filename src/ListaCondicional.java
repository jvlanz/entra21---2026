import java.util.Scanner;

public class ListaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex9();
	}
	static void ex1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um número : ");
		int valor=sc.nextInt();
		if (valor%2==0) {
			System.out.println("Este número é par");
		}
		else {
			System.out.println("Este numero é impar");
		}
		sc.close();
	}
		static void ex2(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite um número : ");
			int n1=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n2=sc.nextInt();
			if (n1>n2) {
				System.out.println("O maior número é : "+n1);
			}
			else if (n2>n1) {
				System.out.println("O maior número é : "+n2);
			}
			else{
				System.out.println("Os números são iguais");
			}
		}
		static void ex3(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite um número : ");
			int valor=sc.nextInt();
			if (valor>0) {
				System.out.println("Este valor é positivo");
			}
			else if (valor<0){
				System.out.println("Este valor é negativo");
			}
			else {
				System.out.println("Este valor é zero");
			}
			sc.close();
		}
		static void ex4(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite a sua nota : ");
			int nota=sc.nextInt();
			if (nota>=6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
			sc.close();
		}
		static void ex5(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite a sua idade: ");
			int idade=sc.nextInt();
			if (idade>=16) {
				System.out.println("Você pode votar");
			}
			else {
				System.out.println("Você não pode votar");
			}
			sc.close();
		}
		static void ex6(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite um número : ");
			int n1=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n2=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n3=sc.nextInt();
			if (n1>n2&&n1>n3) {
				System.out.println("O maior numero é : "+n1);
			}
			else if (n2>n1&&n2>n3){
				System.out.println("O maior numero é : "+n2);
			}
			else if (n3>n1&&n3>n2){
				System.out.println("O maior numero é : "+n3);
			}
			sc.close();
		}
		static void ex7(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a sua nota : ");
			int nota=sc.nextInt();
			if (nota>=9) {
				System.out.println("A sua nota foi classificada como : Excelente");
			}
			else if (nota>=7){
				System.out.println("A sua nota foi classificada como : Bom");
			}
			else if (nota>=5) {
				System.out.println("A sua nota foi classificada como : Regular");
			}
			else {
				System.out.println("A sua nota foi classificada como : Insuficiente");
			}
			sc.close();
		}
		static void ex8(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite um número : ");
			int n1=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n2=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n3=sc.nextInt();
		
			if (n1+n2>n3&&n1+n3>n2&&n2+n3>n1) {
				System.out.println("Essas medidas podem ser de um triângulo");
			}
			else {
				System.out.println("O triângulo com essas medidas não pode existir");
			}
			sc.close();
		}
		static void ex9(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite um número : ");
			int n1=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n2=sc.nextInt();
			System.out.println("Digite outro número : ");
			int n3=sc.nextInt();
			
			if (n1==n2&&n1==n3) {
				System.out.println("O triângulo é equilátero");
			}
			else if (n1!=n2&&n1!=n3&&n2!=n3) {
				System.out.println("O triângulo é escaleno");
			}
			else {
				System.out.println("O triângulo é isósceles");
			}
			sc.close();
		}
			static void ex10() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite o usuário : ");
				String usuario=sc.nextLine();
				System.out.println("Digite a senha : ");
				String senha=sc.nextLine();
				if (usuario.equals("joao")&&senha.equals("123")) {
					System.out.println("Acesso Permitido");
				}
				else {
					System.out.println("Acesso Negado");
				}
				sc.close();
			
		}
			static void ex11() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite um ano : ");
				int ano=sc.nextInt();
				if ((ano%4==0 && ano%100!= 0) || (ano %400==0)) {
					System.out.println("O ano é bissexto");
				}
				else{
					System.out.println("O ano não é bissexto");
				}
				sc.close();
			}
			static void ex12(){
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite um número : ");
				float n1=sc.nextFloat();
				System.out.println("Digite outro número : ");
				float n2=sc.nextFloat();
				System.out.println("Digite uma operação : ");
				char operacao=sc.nextLine().charAt(0);
				if (operacao=='+') {
					System.out.println("A soma dos números é : "+(n1+n2));
				}
				else if (operacao=='-') {
					System.out.println("A subtração dos números é : "+(n1-n2));
				}
				else if (operacao=='*') {
					System.out.println("A multiplicação dos números é : "+(n1*n2));
				}
				else if (operacao=='/') {
					System.out.println("A divisão dos números é : "+(n1/n2));
				}
			}
			static void ex13() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite o seu salário : ");
				float salario=sc.nextFloat();
				if (salario<2000) {
					System.out.println("Será descontado 10%. O salário final será : "+salario*0.9f);
				}
				else if (salario>=2000 && salario<5000) {
					System.out.println("Será descontado 15%. O salário final será : "+salario*0.85f);
				}
				else if (salario>=5000 && salario<10000) {
					System.out.println("Será descontado 30%. O salário final será : "+salario*0.7f);
				}
				else if (salario>=10000) {
					System.out.println("Será descontado 35%. O salário final será : "+salario*0.65f);
				}
			}
			static void ex14() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite o valor da compra : ");
				float valor=sc.nextFloat();
				if (valor<=100) {
					System.out.println("O valor será : "+valor);
				}
				else if (valor>100 && valor<=500) {
					System.out.println("Será descontado 10%. O valor será : "+valor*0.9f);
				}
				if (valor<500) {
					System.out.println("Será descontado 20%. O valor será : "+valor*0.8f);
				}
			}
			static void ex15(){
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite a sua idade : ");
				int idade=sc.nextInt();
				if (idade>=0 && idade<=12) {
					System.out.println("Você é criança");
				}
				else if (idade>=13 && idade<=17){
					System.out.println("Você é adolescente");
				}
				else if (idade>=18 && idade<=59){
					System.out.println("Você é adulto");
				}
				else if (idade>=60){
					System.out.println("Você é idoso");
				}
				else{
					System.out.println("Idade inválida");
				}
			}
			static void ex16() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Digite um número : ");
			float n1=sc.nextFloat();
			System.out.println("Digite outro número : ");
			float n2=sc.nextFloat();
			System.out.println("Digite outro número : ");
			float n3=sc.nextFloat();
			
			float media=(n1+n2+n3)/3;
			if (media>=7) {
				System.out.println("Você está aprovado");
			}
			else if (media>=4) {
				System.out.println("Você está de recuperação");
			}
			else if (media<4) {
				System.out.println("Você está reprovado");
			}
			
			}
			static void ex17() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Digite o seu salário : ");
				float salario=sc.nextFloat();
				System.out.println("Digite o valor das parcelas : ");
				float parcelas=sc.nextFloat();
				
				if (salario/parcelas<=0.4f) {
					System.out.println("Você está elegível para o empréstimo");
				}
				else {
					System.out.println("Você está inelegível para o empréstimo");
				}
				sc.close();
			}
			static void ex18() {
				Scanner sc=new Scanner(System.in);
				int nSecreto=10;
				System.out.println("Tente acertar o número secreto");
				int palpite=sc.nextInt();
				if (palpite>nSecreto) {
					System.out.println("O número que estou pensando é menor");
				}
				else if (palpite<nSecreto) {
					System.out.println("O número que estou pensando é maior");
				}
				else {
					System.out.println("Parabéns!!! Você acertou o número que eu estava pensando");
				}
				sc.close();
			}
			static void ex19() {
				Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o peso (em kg): ");
		        float peso = sc.nextFloat();
		        System.out.print("Digite a altura (em metros): ");
		        float altura = sc.nextFloat();

		        double imc = peso/(Math.pow(altura, 2));

		        System.out.printf("IMC: %.2f\n", imc);

		        if (imc < 18.5) {
		            System.out.println("Classificação : Baixo peso");
		        } else if (imc < 24.9) {
		            System.out.println("Classificação : Peso normal");
		        } else if (imc < 29.9) {
		            System.out.println("Classificação : Sobrepeso");
		        } else {
		            System.out.println("Classificação : Obesidade");
		        }

		        sc.close();
			}
			static void ex20() {
				Scanner sc=new Scanner(System.in);

		        String senhaCorreta= "12345";
		        int tentativas= 0;
		        boolean acertouSenha = false;

		        while (tentativas< 3) {
		            System.out.print("Digite a senha : ");
		            String senha= sc.nextLine();

		            if (senha.equals(senhaCorreta)) {
		                acertouSenha = true;
		                break;
		            } else {
		                tentativas++;
		                System.out.println("Senha incorreta! Tentativas restantes: "+(3-tentativas));
		            }
		        }

		        if (acertouSenha) {
		            System.out.println("Acesso permitido!");
		        } 
		        else {
		            System.out.println("Acesso bloqueado!");
		        }

		        sc.close();
			}
	}


