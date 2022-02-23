
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// n�o compila porque o atributo � privado
		//conta.numero = 1337;
		
		//utilizamos o set para definir o n�mero
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
		
		//aqui podemos ver que titulardaconta + paulo + conta s�o 3 refer�ncias
		//que apontam para o mesmo objeto 
		
		//ps: alteramos a profiss�o do titular da conta, mas quando solicitamos a profiss�o
		//da conta, a profiss�o anterior (programador) � alterada para estudante
		//o m�todo foi aplicado em um �nico objeto
	}
}
