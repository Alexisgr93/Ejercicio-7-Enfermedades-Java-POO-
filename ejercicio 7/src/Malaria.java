
public class Malaria implements IEnfermedad{

	@Override
	public void afectarEnfermedad(Persona persona) {
		// TODO Auto-generated method stub
		persona.ActualizarTemperatura(3);
	}
	

}
