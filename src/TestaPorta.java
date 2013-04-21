public class TestaPorta {

	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.aberta = true;
		porta.cor = "azul";
		porta.dimensaoX = 1;
		porta.dimensaoY = 2;
		porta.dimensaoZ = 3;

		System.out.println("Status da porta: " + porta.estaAberta());
		System.out.println("Cor da porta: " + porta.cor);
		System.out.println("X: " + porta.dimensaoX);
		System.out.println("Y: " + porta.dimensaoY);
		System.out.println("Z: " + porta.dimensaoZ);

		porta.fecha();
		System.out.println("Status da porta: " + porta.estaAberta());

		porta.abre();
		System.out.println("Status da porta: " + porta.estaAberta());

	}

}
