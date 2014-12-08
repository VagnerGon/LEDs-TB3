
public class SuperTipo{
	
	public void executaComando(SQL comando){
		Connection conexao;
		
		try{
			conexao = getConexao();
		}catch(DBExeption ex){
			desfazProcesso();
		}
		
		executaSQL(comando);
	}
}

//--------------------------

public class MiniTipo extends SuperTipo{
	
	public MiniTipo(){
		SQL sql = new SQL(CMD_CRIA);
		executaComando(sql);
	}
}

public class Tipinho extends SuperTipo{
	
	public Tipinho(){
		SQL sql = new SQL(CMD_PROCURA);
		executaComando(sql);
	}
}