
public class Polen implements ICura{

	private double gramos;
	public Polen() {
		
	}
	
	public Polen(double gramos) {
		setGramos(gramos);
	}
	
	@Override
	public void aplicarCura(Persona persona) {
		// TODO Auto-generated method stub
		persona.ActualizarVitalidad(persona.getPeso() * 0.1);
	}
	public double getGramos() {
		return gramos;
	}
	public void setGramos(double gramos) {
		this.gramos = gramos;
	}
	
	

}
