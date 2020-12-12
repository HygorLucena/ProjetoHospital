
public class ContaJuridica extends Conta {
	
	private String cnpj;
	
	
	public ContaJuridica() {
		
	}

	public ContaJuridica ( String dono, double saldo, String cnpj) {
		super (dono,saldo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
	

}
