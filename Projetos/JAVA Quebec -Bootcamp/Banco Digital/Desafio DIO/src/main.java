
public class main {

	public static void main(String[] args){
		Cliente jonathan = new Cliente();
		jonathan.setNome("Jonathan");
		
		Conta cc = new ContaCorrente(jonathan);
		Conta poupanca = new ContaPoupanca(jonathan);
		
		cc.depositar(100);
		cc.transferir(100,poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
