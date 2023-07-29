package ExercicioLoianeGronerException;

public class Contato {
	
	private static int contador = 0;
	private String nome, telefone;
	private int id;
	
	public Contato() {
		contador++;
		id = contador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		
		return "Id: "+id + 
				" ,Nome: "+nome+
				" ,Telefone: "+telefone;
	}
}
