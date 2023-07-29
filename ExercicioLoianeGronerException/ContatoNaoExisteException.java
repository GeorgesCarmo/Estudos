package ExercicioLoianeGronerException;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	public String getMessage() {
		return "Contato: "+nomeContato+ " nao existe na agenda";
	}

}
