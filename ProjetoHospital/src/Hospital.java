import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Paciente> listaPacientes;
	private ArrayList<Medico> listaMedicos;
	private ArrayList<Enfermeiro> listaEnfermeiros;     //= new ArrayList<Enfermeiro>();
	private ContaJuridica CJ;
	
	
	public Hospital(ArrayList<Paciente> listaPacientes, ArrayList<Medico> listaMedicos,
			ArrayList<Enfermeiro> listaEnfermeiros, ContaJuridica cJ) {
		super();
		this.listaPacientes = listaPacientes;
		this.listaMedicos = listaMedicos;
		this.listaEnfermeiros = listaEnfermeiros;
		CJ = cJ;
	}
	
	
	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	public ArrayList<Medico> getListaMedicos() {
		return listaMedicos;
	}
	public void setListaMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}
	public ArrayList<Enfermeiro> getListaEnfermeiros() {
		return listaEnfermeiros;
	}
	public void setListaEnfermeiros(ArrayList<Enfermeiro> listaEnfermeiros) {
		this.listaEnfermeiros = listaEnfermeiros;
	}
	public ContaJuridica getCJ() {
		return CJ;
	}
	public void setCJ(ContaJuridica cJ) {
		CJ = cJ;
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
	
	
	public void listarPacientes (String nomeMedico) { //recebe um objeto medico e retorna a lista total de pacientes
		System.out.println("=====Lista De Pacientes=====");
		for(Paciente p : listaPacientes) {
			if(p.getMedico().getNome().equals(nomeMedico)) {
				System.out.println(p.getNome());
			}
		}
		System.out.println("============================");
	}
	
	
}
