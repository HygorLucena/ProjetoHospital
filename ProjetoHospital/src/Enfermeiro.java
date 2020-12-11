
public class Enfermeiro extends Empregado{

	private String setor;
	
	public Enfermeiro(String nome, String cpf, String sexo, String pis, int matricula, int contaF, String setor) {
		super(nome, cpf, sexo, pis, matricula, contaF);
		this.setor = setor;
	}


	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}
