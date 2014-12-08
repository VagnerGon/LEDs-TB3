package pedidos;

public interface PedidoGateway{
	
	int enviar(int id);
}


//--------------------------------
package comunicacaoExterna;

public class PedidoSMS implements PedidoGateway{
	
	int enviar(int id){
		enviaBagacaSMS(id);
	}
}