
public class Medico extends Empregado{

	private int crm;

	
	public Medico(String nome, String cpf, String sexo, int idade, String pis, int matricula, ContaFisica cf, int crm) {
		super(nome, cpf, sexo, idade, pis, matricula, cf);
		this.crm = crm;
		
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	public String detalhes() {
		return "======= Informações Gerais do Paciente =======" + "\n Nome: " + this.getNome() + 
				"\n Sexo: " + this.getSexo();
	}
	
}
