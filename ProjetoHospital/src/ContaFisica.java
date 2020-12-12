
public class ContaFisica extends Conta {
	
private String cpf;
	
	public ContaFisica (){
		super ();
	}
	
	public ContaFisica ( String dono, double saldo, String cpf) {
		super (dono,saldo);
		this.cpf = cpf;
	}
	
	public String getCpf () {
		return this.cpf;
	}
	
	public void setCpf ( String cpf ) {
		this.cpf = cpf;
	}
	

}
