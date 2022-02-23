
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		//método de depósito
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		//método de saque
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(1300, contaDoPaulo)) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		//método de transferência
		
		System.out.println(contaDaMarcela.saldo + " Marcela tem na conta");
		System.out.println(contaDoPaulo.saldo + " Paulo tem na conta");
		//visualizar o saldo final nas contas
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
		
		
	}
	
	
}
