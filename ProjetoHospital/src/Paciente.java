
public class Paciente extends Pessoa {
	
	private String doenca;
	private Medico medico;
	private Enfermeiro enfermeiro;
	
	public Paciente(String nome, String cpf, String sexo, int idade, String doenca, Medico medico, Enfermeiro emfermeiro) {
		super(nome, cpf, sexo, idade);
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
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}
	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	@Override
	public String toString() {
		return "Dados do Paciente: " + "\n Nome: " + this.getNome() + "\n Sexo: " + this.getSexo() +
				"\n Doença: " + doenca + "\n Médico(a): " + medico + "\n Enfermeiro(a): " + enfermeiro;
	}
	
//	public String detalhes() {
//		return "======= Informações Gerais do Paciente =======" + "\n Nome: " + this.getNome() + 
//				"\n Sexo: " + this.getSexo() + "\n Nome do Médico(a): " + this.getMedico();
//	}
	
	
}
