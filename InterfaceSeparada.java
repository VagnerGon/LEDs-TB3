package vendas;


public interface OperacoesEstoque{
	
	void decrementaEstoque();
}

public class Venda{
	
	void fazVenda(id){
		
		//FAZ OPERACOES DE VENDA
		
		OperacoesEstoque estoque = new Estoque();
		
		estoque.decrementaEstoque();
	}
}

//============================

package estoque;

public class Estoque implements OperacoesEstoque{
	
	void decrementaEstoque(){
		
		this.estoque--;
	}
}