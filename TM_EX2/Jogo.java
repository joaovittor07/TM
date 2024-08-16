package TM_EX2;

public abstract class Jogo {
	
	   abstract void inicializar();

	   abstract void iniciarJogo();

	   abstract void finalizarJogo();

	// Método template
	public final void jogar() {

		// Inicializar o jogo
		inicializar();

		// Iniciar o jogo
		iniciarJogo();

		// Finalizar o jogo
		finalizarJogo();
	}
}


