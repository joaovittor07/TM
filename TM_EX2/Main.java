package TM_EX2;

public class Main {

	public static void main(String[] args) {

		Jogo jogo = new Criquete();
		jogo.jogar();
		
		System.out.println();
		
		jogo = new Futebol();
		jogo.jogar();
	}
}











