
public class ProjetoHospital {

	public static void main(String[] args) {
		
		
		Paciente p[] = new Paciente[5];
		
		p[0] = new Paciente("José", "12345678998","M","Gripe", "Paulo", "Joana");
//		p[1]
//		p[2]
//		p[3]
//		p[4]
		
		Medico m[] = new Medico[3];
		
		m[0] = new Medico("Paulo", "98765432112", "M","1345843", 001, 321, 456);
//		m[1]
//		m[2]
		
		Enfermeiro e[] = new Enfermeiro[4];
		
		e[0] = new Enfermeiro("Joana", "45612378982", "F", "98765432", 001, 987, "Urgência");
//		e[1]
//		e[2]
//		e[3]

		Hospital hospital = new Hospital();
		
		hospital.adicionarPaciente(p[0]);
		hospital.adicionarMedico(m[0]);
		hospital.adicionarEnfermeiro(e[0]);
		System.out.println(hospital.pesquisarPacientes("José"));
		System.out.println(hospital.pesquisarMedicos("Paulo"));
		System.out.println(hospital.pesquisarEnfermeiros("Joana"));
		hospital.listarPacientes("Paulo");
		
		
		
		
		
		
	}

}
