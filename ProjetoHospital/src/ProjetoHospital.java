import java.util.ArrayList;

public class ProjetoHospital {

	public static void main(String[] args) {
		
		ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
		ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
		ArrayList<Enfermeiro> listaEnfermeiros = new ArrayList<Enfermeiro>();
	
	//Conta Fissica e Juridicas
	ContaFisica cf1 = new ContaFisica();
	ContaFisica cf2 = new ContaFisica();
	ContaFisica cf3 = new ContaFisica();
	ContaFisica cf4 = new ContaFisica();
	ContaFisica cf5 = new ContaFisica();
	ContaFisica cf6 = new ContaFisica();
	ContaFisica cf7 = new ContaFisica();
	ContaJuridica cj1 = new ContaJuridica();
	
	//3 Médicos
	Medico m1 = new Medico("Paulo","12345678912", "M", 49, "4646", 2546, cf1, 89789);
	Medico m2 = new Medico("Maria","98766543213","F", 38, "6548", 9876, cf2, 23487);
	Medico m3 = new Medico("José", "14725836984", "M", 60, "3215", 8754, cf3, 12456);
	
	//4 Enfermeiros
	Enfermeiro e1 = new Enfermeiro("Luana", "7894654334", "F", 62, "564223", 4565, cf4, "Urgência");
	Enfermeiro e2 = new Enfermeiro("Marcio", "5646486897", "M", 25, "357491", 54654, cf5, "Urgência");
	Enfermeiro e3 = new Enfermeiro("Jaci", "65451613", "F", 24, "548751", 56413, cf6, "Trauma");
	Enfermeiro e4 = new Enfermeiro("Murilo", "5464768446", "M", 29, "8754", 23545, cf7, "UTI");
	
	//5 Pacientes
	Paciente p1 = new Paciente("João","894651313", "M", 45, "Gripe", m1, e1);
	Paciente p2 = new Paciente("Marcela","564841651", "F", 56, "Dengue", m1, e2);
	Paciente p3 = new Paciente("Daniel", "465456151", "M", 54, "Gripe", m2, e1);
	Paciente p4 = new Paciente("Tulio", "616118948", "M", 60, "Hipertensão", m3, e4);
	Paciente p5 = new Paciente("Fabiana", "56484513213", "F", 75, "Diabetes", m2, e3);
	
	//Médicos
	listaMedicos.add(m1);
	listaMedicos.add(m2);
	listaMedicos.add(m3);
	
	//Pacientes
	listaPacientes.add(p1);
	listaPacientes.add(p2);
	listaPacientes.add(p3);
	listaPacientes.add(p4);
	listaPacientes.add(p5);
	
	//Enfermeiros
	listaEnfermeiros.add(e1);
	listaEnfermeiros.add(e2);
	listaEnfermeiros.add(e3);
	listaEnfermeiros.add(e4);

	
	//1 Hospital
	Hospital h = new Hospital(listaPacientes, listaMedicos, listaEnfermeiros, cj1);
	
	h.listarPacientes("Paulo");
	h.listarPacientes("Maria");

		
	
		
	}

}
