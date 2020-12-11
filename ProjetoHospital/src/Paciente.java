
public class Paciente extends Pessoa {
	
	private String doenca;
	private String medico;
	private String enfermeiro;
	
	public Paciente(String nome, String cpf, String sexo, String doenca, String medico, String emfermeiro) {
		super(nome, cpf, sexo);
		this.doenca = doenca;
		this.medico = medico;
		this.enfermeiro = emfermeiro;
	}
	
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public String getEnfermeiro() {
		return enfermeiro;
	}
	public void setEnfermeiro(String enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	@Override
	public String toString() {
		return "Dados do Paciente: " + "\n Nome: " + this.getNome() + "\n Sexo: " + this.getSexo() +
				"\n Doença: " + doenca + "\n Médico(a): " + medico + "\n Enfermeiro(a): " + enfermeiro;
	}
	
	public String detalhes() {
		return "======= Informações Gerais do Paciente =======" + "\n Nome: " + this.getNome() + 
				"\n Sexo: " + this.getSexo() + "\n Nome do Médico(a): " + this.getMedico();
	}
	
	
}
