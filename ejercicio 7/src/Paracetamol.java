
public class Paracetamol implements ICura{

	@Override
	public void aplicarCura(Persona persona) {
		// TODO Auto-generated method stub
		if(persona.getTemperatura() > 37) {
			persona.setTemperatura(37);
		}
		
	}
	

}
