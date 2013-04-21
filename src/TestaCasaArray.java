
public class TestaCasaArray {

	public static void main(String[] args) {
		
		CasaArray casa = new CasaArray();
		casa.portas = new Porta[1];
		
		Porta porta2 = new Porta();
		porta2.aberta = false;
		
		Porta porta3 = new Porta();
		porta3.aberta = true;
		
		Porta porta4 = new Porta();
		porta4.aberta = true;
		
		Porta porta5 = new Porta();
		porta5.aberta = false;
		
		Porta porta6 = new Porta();
		porta6.aberta = true;
		
		
		casa.adicionaPorta(porta2);
		casa.adicionaPorta(porta3);
		casa.adicionaPorta(porta4);
		casa.adicionaPorta(porta5);
		casa.adicionaPorta(porta6);
		
		
		casa.totalDePortas();
		
		System.out.println("Total abertas: " + casa.quantasPortasEstaoAbertas());
		
		
	}

}
