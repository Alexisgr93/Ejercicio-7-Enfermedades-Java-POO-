
public class Persona {

	private String nombre;
	private double peso;
	private double vitalidad;
	private double temperatura;
	
	public Persona() {
		vitalidad = 70;
		temperatura = 36;
		
	}
	
	public Persona(String nombre, double peso, double vitalidad, double temperatura) {
		setPeso(peso);
		setTemperatura(temperatura);
		setVitalidad(vitalidad);
		setNombre(nombre);
		
	}
	
	public void afectarEnfermedad(IEnfermedad enfermedad) {
	
		enfermedad.afectarEnfermedad(this);
	}
	
	public void aplicarCura(ICura cura) {
		
		cura.aplicarCura(this);
	}
	
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVitalidad() {
		return vitalidad;
	}
	public void setVitalidad(double vitalidad) {
		
		this.vitalidad = vitalidad;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		//se le pone signo + para que aumente un numero y no para que lo iguale
		this.temperatura = temperatura;
	}
	public void ActualizarTemperatura(double temperatura) {
		//se le pone signo * para que aumente un numero y no para que lo iguale
		this.temperatura += temperatura;
	}
	
	public void ActualizarVitalidad(double vitalidad) {
		
		this.vitalidad += vitalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
