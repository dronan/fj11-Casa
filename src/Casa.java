public class Casa {
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;

	void pinta(String s) {
		cor = s;
	}

	int quantasPortasEstaoAbertas() {

		int p1 = 0;
		int p2 = 0;
		int p3 = 0;

		if (porta1.aberta == true) {
			p1 = 1;
		}

		if (porta2.aberta == true) {
			p2 = 1;
		}

		if (porta3.aberta == true) {
			p3 = 1;
		}

		return (p1 + p2 + p3);

	}

}
