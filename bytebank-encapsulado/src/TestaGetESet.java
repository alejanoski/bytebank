
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// não compila porque o atributo é privado
		//conta.numero = 1337;
		
		//utilizamos o set para definir o número
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		//criamos o objeto cliente e vamos relacionar com a conta
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		conta.setTitular(paulo);
		paulo.setNome("paulo silveira");
		paulo.setCpf("222.222.222-22");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("estudante");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		System.out.println(conta.getTitular().getProfissao());
		
		//aqui podemos ver que titulardaconta + paulo + conta são 3 referências
		//que apontam para o mesmo objeto 
		
		//ps: alteramos a profissão do titular da conta, mas quando solicitamos a profissão
		//da conta, a profissão anterior (programador) é alterada para estudante
		//o método foi aplicado em um único objeto
	}
}
