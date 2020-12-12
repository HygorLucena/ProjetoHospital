
public class Enfermeiro extends Empregado{

	private String setor;
	
	public Enfermeiro(String nome, String cpf, String sexo, int idade, String pis, int matricula, ContaFisica cf, String setor) {
		super(nome, cpf, sexo, idade, pis, matricula, cf);
		this.setor = setor;
	}
	

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}
