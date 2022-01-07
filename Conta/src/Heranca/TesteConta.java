package Heranca;

public class TesteConta {

	public static void main(String[] args) {		
			
		ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100, 1000, 500);
		cc1.depositar(200);
		System.out.println("O saldo da conta corrente � R$"+cc1.getSaldo());
	
		ContaPoupanca p1 = new ContaPoupanca(33, 3, "Banco CCC", 10, 20, 0.05, 0,05);
		p1.depositar(500);
		System.out.println("O saldo da conta poupan�a � R$"+p1.getSaldo());
				
		ContaSalario cs = new ContaSalario(33, 3, "Banco CCC", 3000, 2);
		cs.depositar(500);
		
		System.out.println("O saldo da conta sal�rio � R$"+cs.getSaldo());	
		cs.sacar(100);
		
		System.out.println(cs.getSaldo());
		cs.sacar(100);
		
		System.out.println(cs.getSaldo());
		cs.sacar(100);
	}
}
