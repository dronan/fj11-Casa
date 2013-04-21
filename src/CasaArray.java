public class CasaArray {
	String cor;
	int totalDePortas = 0;
	Porta[] portas;

	void pinta(String s) {
		this.cor = s;
	}

	int quantasPortasEstaoAbertas() {
		int totalPortasAbertas = 0;
		
		for (int i = 0; i < this.portas.length; i++){
			if (this.portas[i].aberta == true)
				totalPortasAbertas++;
		}
		return totalPortasAbertas;
	}

	void adicionaPorta(Porta p) {
		for(int i = 0; i < this.portas.length; i++){
			if (this.portas[i] == null){
				this.portas[i] = p;
				return;
			}
		}
		
		Porta[] novaPorta = new Porta[this.portas.length + 1];
		
		for (int a = 0; a < this.portas.length; a++){
			novaPorta[a] = this.portas[a];	
		}
		
		this.portas = novaPorta;
		
		adicionaPorta(p);
				
	}

	void totalDePortas() {
		System.out.println("Total de portas: " + this.portas.length);
	}

}
