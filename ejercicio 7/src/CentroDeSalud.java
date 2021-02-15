import java.util.ArrayList;
import java.util.List;



public class CentroDeSalud {
	private List<Persona> pacientes = new ArrayList<Persona>();

	public void agregarPaciente (Persona persona) {
		pacientes.add(persona);
	}
	
	public void quitarPaciente (Persona persona) {
		pacientes.remove(persona);
	}
	
	public int cantidadDePacientes() {
		return pacientes.size();
	}
	
	public double pesoPromedio() {
		double sumaPesos = 0;
		for(Persona persona : pacientes) {
			sumaPesos += persona.getPeso();
		}
		return sumaPesos / cantidadDePacientes();
	}
}

