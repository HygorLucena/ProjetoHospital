
public class Medico extends Empregado{

	private int crm;
	
	public Medico(String nome, String cpf, String sexo, String pis, int matricula, int contaF, int crm) {
		super(nome, cpf, sexo, pis, matricula, contaF);
		this.crm = crm;
		
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
}
