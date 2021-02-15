
public class Nuez implements ICura {

	@Override
	public void aplicarCura(Persona persona) {
		// TODO Auto-generated method stub
		persona.setVitalidad(persona.getVitalidad() * 1.3);
	}
	

}
