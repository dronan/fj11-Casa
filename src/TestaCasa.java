
public class TestaCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.porta1 = new Porta();
		casa.porta2 = new Porta();
		casa.porta3 = new Porta();
		
		casa.cor = "preto";
		casa.porta1.cor = "azul";
		casa.porta2.cor = "amarelo";
		casa.porta3.cor = "verde";
		
		System.out.println(casa.cor);
		System.out.println(casa.porta1.cor);
		System.out.println(casa.porta2.cor);
		System.out.println(casa.porta3.cor);
		
		/*
		casa.pinta("azul");
		System.out.println(casa.cor);
		
		casa.porta1.pinta("lalala");
		System.out.println(casa.porta1.cor);
		*/
		
		casa.porta1.abre();
		casa.porta2.abre();
		casa.porta3.abre();
		
		System.out.println(casa.quantasPortasEstaoAbertas());
		
		casa.porta3.fecha();
		casa.porta1.fecha();
		System.out.println(casa.quantasPortasEstaoAbertas());		
		
	}
	
	

}
