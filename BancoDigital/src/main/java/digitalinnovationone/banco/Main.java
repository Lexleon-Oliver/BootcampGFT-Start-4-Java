package digitalinnovationone.banco;
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Alex Oliveira");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(10, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
