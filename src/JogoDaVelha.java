import java.util.Scanner;

public class JogoDaVelha {

	static char[][] tabuleiro = {
		{' ' , ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '}
	};
	static void mostrarTabuleiro() {
		System.out.println("------------");
		for (int i=0; i<3;i++) {
			System.out.print("| ");
			for (int j=0;j<3;j++) {
				System.out.print(tabuleiro[i][j] + " | ");
				
			}
			System.out.println("\n------------");
		}
		
	}
	public static boolean verificarVitoria(char jogador) {
		//verificar linha e coluna
		for (int i=0; i<3;i++) {
			if ((tabuleiro[i][0] == jogador&&tabuleiro[i][1]==jogador&&tabuleiro[i][2]==jogador )||
				(tabuleiro[0][i]==jogador&&tabuleiro[1][i]==jogador&&tabuleiro[2][i]==jogador)) {
				System.out.println("Parabéns "+jogador+"! Você venceu.");
				return true; }	
		}
		//verificar diagonais
			if ((tabuleiro[0][0] == jogador&&tabuleiro[1][1]==jogador&&tabuleiro[2][2]==jogador)||
			(tabuleiro[0][2] == jogador&&tabuleiro[1][1]==jogador&&tabuleiro[2][0]==jogador)){
				System.out.println("Parabéns "+jogador+"! Você venceu.");
			return true;
		}
			else {
		return false;
			}
	}
	//funcao para chamar o tabuleiro e pegar linha e coluna
	public static void jogar(char jogador) {
		Scanner sc=new Scanner(System.in);
		mostrarTabuleiro();
		System.out.println("Digite a linha : ");
		int linha=sc.nextInt();
		System.out.println("Digite a coluna : ");
		int coluna=sc.nextInt();
		
		if (tabuleiro[linha][coluna]==' ') {
			tabuleiro[linha][coluna]=jogador;
			
		}
		else {
			System.out.println("A posição já está ocupada");
			jogar(jogador);
			
			
		}
		
		
	}
	public static boolean verificarEmpate() {
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
			if(tabuleiro[i][j]==' ') {
				return false;
			}
			
			}
	}
		System.out.println("EMPATE!");
		return true;
	}
	
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		
		
		while (true){
			jogar('x');
			if ((verificarVitoria('x')==true) || (verificarVitoria('o')==true)||(verificarEmpate()==true)) {
				break;
			}
			jogar('o');
			if ((verificarVitoria('x')==true) || (verificarVitoria('o')==true)||(verificarEmpate()==true)) {
				break;
			}
		}
		
	}
}
