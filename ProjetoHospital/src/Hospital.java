import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Paciente> listaPacientes = new ArrayList<>();
	private ArrayList<Medico> listaMedicos = new ArrayList<>();
	private ArrayList<Enfermeiro> listaEnfermeiros = new ArrayList<>();
	
	
	public  ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	public  ArrayList<Medico> getListaMedicos() {
		return listaMedicos;
	}
	public  ArrayList<Enfermeiro> getListaEnfermeiros() {
		return listaEnfermeiros;
	}
	
	
	public void adicionarPaciente (Paciente p) {
		listaPacientes.add(p);
	}
	
	public void adicionarMedico (Medico m) {
		listaMedicos.add(m);
	}
	
	public void adicionarEnfermeiro (Enfermeiro en) {
		listaEnfermeiros.add(en);
	}
	
	public void listarPacientes (Medico nomeMedico) {
		
		this.getListaMedicos().equals(nomeMedico);
	
		for(Paciente p : listaPacientes) {
			System.out.println(p.detalhes());
		}

	}
	
	public int pesquisarPacientes (String nome) {
		int qtd = 0;
		
		for( Paciente p : listaPacientes ) {
			if(p.getNome().equals(nome)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	public int pesquisarMedicos (String nome) {
		int qtd = 0;
		
		for( Medico m : listaMedicos ) {
			if(m.getNome().equals(nome)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	public int pesquisarEnfermeiros (String nome) {
		int qtd = 0;
		
		for( Enfermeiro e : listaEnfermeiros ) {
			if(e.getNome().equals(nome)) {
				qtd++;
			}
		}
		return qtd;
	}
		
}
