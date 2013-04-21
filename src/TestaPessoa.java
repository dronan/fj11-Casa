
public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Diego";
		pessoa.idade = 26;
		
		pessoa.fazAniversario();
		
		System.out.println(pessoa.idade);

		pessoa.fazAniversario();
		
		System.out.println(pessoa.idade);
		
		pessoa.fazAniversario();
		
		System.out.println(pessoa.idade);
				
		
	}

}
