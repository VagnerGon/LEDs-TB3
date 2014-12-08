public interface PedidoGateway{
	
	int enviar(int id);
}


//--------------------------------

public class PedidoSMS() implements PedidoGateway{
	
	int enviar(int id){
		enviaBagacaSMS(id);
	}
}