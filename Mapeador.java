package pedidos;

public interface PedidoMapeador{
	
	OrdemServico despachar(int id);
}


//--------------------------------
package despacho;

public class despacho() implements PedidoMapeador{
	
	OrdemServico despachar(int id){
	
		descontaEstoque(id);
		avisaMarketing(id);
		
		return iniciaProcessoDespacho(id);
	}
}