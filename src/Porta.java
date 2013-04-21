public class Porta {
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;

	void abre() {
		aberta = true;
	}

	void fecha() {
		aberta = false;
	}

	void pinta(String s) {
		cor = s;
	}

	boolean estaAberta() {
		return aberta;
	}
	
}
