
public class Main {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Biruleibe");
		
		Cliente pessoa1 = new Cliente();
		pessoa1.setNome("Junior");
		banco.setContas(pessoa1.getNome());
		
		Cliente pessoa2 = new Cliente();
		pessoa2.setNome("Zena");
		banco.setContas(pessoa2.getNome());
		
		Cliente pessoa3 = new Cliente();
		pessoa3.setNome("Joyce");
		banco.setContas(pessoa3.getNome());
		
		Conta cc = new ContaCorrente(pessoa1, banco);
		cc.depositar(200.5);
		
		Conta cp = new ContaPoupanca(pessoa1, banco);
		cc.tranferir(105.1, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		System.out.println("\nContas cadastradas no banco "+banco.getNome());
		for(String i: banco.getContas()) {
			System.out.println(i);
			
		}
		
	}

}
