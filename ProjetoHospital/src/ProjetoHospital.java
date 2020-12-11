
public class ProjetoHospital {

	public static void main(String[] args) {
		
		
		Paciente p[] = new Paciente[5];
		
		p[0] = new Paciente("José", "12345678998","M","Gripe", "Paulo", "Joana");
		p[1] = new Paciente("Maria", "98765432121", "F", "Sinusite", "Paulo", "Caio");
		p[2] = new Paciente("Joaquina", "12365498732", "F", "Dengue", "Sandra", "Joana");
//		p[3]
//		p[4]
		
		Medico m[] = new Medico[3];
		
		m[0] = new Medico("Paulo", "98765432112", "M","1345843", 001, 321, 456);
		m[1] = new Medico("Sandra", "654988732164", "F", "2314641", 001, 354, 987);
//		m[2]
		
		Enfermeiro e[] = new Enfermeiro[4];
		
		e[0] = new Enfermeiro("Joana", "45612378982", "F", "98765432", 001, 987, "Urgência");
//		e[1]
//		e[2]
//		e[3]

		Hospital hospital = new Hospital();
		
		hospital.adicionarPaciente(p[0]);
		hospital.adicionarPaciente(p[1]);
		hospital.adicionarPaciente(p[2]);
		hospital.adicionarMedico(m[0]);
		hospital.adicionarMedico(m[1]);
		hospital.adicionarEnfermeiro(e[0]);
//		System.out.println(hospital.pesquisarPacientes("José"));
//		System.out.println(hospital.pesquisarMedicos("Paulo"));
//		System.out.println(hospital.pesquisarEnfermeiros("Joana"));
		hospital.listarPacientes(m[0]);
		hospital.listarPacientes(m[1]);
		
		
		
		
		
		
		
	}

}
