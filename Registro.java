
public class CadastroPessoa{

	//Códigos do cadastro de pessoas
	
	void visualizarEndereco(Pessoa pessoa){
		
		mostraEndereco(Util_Pessoa.encontraEnderecoPessoa(pessoa));
	}
}


public class Util_Pessoa{
	
	public static Pessoa encontraPessoaNome(String nome){
		//Implementacao
	}
	
	public static Endereco encontraEnderecoPessoa(Pessoa pessoa){
		//Implementacao
	}
}