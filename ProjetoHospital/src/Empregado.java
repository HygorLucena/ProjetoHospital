
public class Empregado extends Pessoa{
	
	private String pis;
	private int matricula;
	private ContaFisica cf;
	
	public Empregado(String nome, String cpf, String sexo, int idade, String pis, int matricula, ContaFisica cf) {
		super(nome, cpf, sexo, idade);
		this.pis = pis;
		this.matricula = matricula;
		this.cf = cf;
	}
	
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ContaFisica getCf() {
		return cf;
	}

	public void setCf(ContaFisica cf) {
		this.cf = cf;
	}
	
	
	
	
	

}
