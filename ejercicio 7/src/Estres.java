
public class Estres implements IEnfermedad{

	@Override
	public void afectarEnfermedad(Persona persona) {
		// TODO Auto-generated method stub
		//resta un 20%
		persona.setVitalidad(persona.getVitalidad() * 0.8);
		
	}

}
