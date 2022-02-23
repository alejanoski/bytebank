
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		//direcionamos a flecha da referência para a mesma conta
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("segunda conta: " + segundaConta.saldo);
		
		System.out.println("e o saldo da primeira é " + primeiraConta.saldo);
		//estamos referenciando por nomes diferentes a MESMA CONTA/objeto, que só possui um valor .saldo.
	
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta");
		}
		
		System.out.println(primeiraConta);
	}

}
