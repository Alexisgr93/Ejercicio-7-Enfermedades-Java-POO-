
public class Varicela implements IEnfermedad{

	@Override
	public void afectarEnfermedad(Persona persona) {
		// TODO Auto-generated method stub
		persona.ActualizarVitalidad(-5);
		persona.setPeso(persona.getPeso() * 0.9);
		
	}

}
