
import java.util.ArrayList;
//import java.util.List;

public class Banco {

	private String nome;
	private ArrayList<String> clientes = new ArrayList<>();
	//ArrayList<String> contas = new ArrayList<String>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getContas() {
		return clientes;
	}

	public void setContas(String conta) {
		this.clientes.add(conta);
	}
	
	
}
