
public class Empregado extends Pessoa{
	
	private String pis;
	private int matricula;
	private int contaF;
	
	public Empregado(String nome, String cpf, String sexo, String pis, int matricula, int contaF) {
		super(nome, cpf, sexo);
		this.pis = pis;
		this.matricula = matricula;
		this.contaF = contaF;
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
	public int getContaF() {
		return contaF;
	}
	public void setContaF(int contaF) {
		this.contaF = contaF;
	}
	
	
	

}
