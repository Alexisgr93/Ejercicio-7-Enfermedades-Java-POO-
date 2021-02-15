import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class TestEnfermedades {

	CentroDeSalud centrodesalud = new CentroDeSalud();
	
	Malaria malaria = new Malaria();
	Varicela varicela = new Varicela();
	Estres estres = new Estres();
	
	Paracetamol paracetamol = new Paracetamol();
	Polen polen = new Polen();
	Nuez nuez = new Nuez();
	
	Persona p1 = new Persona();
	Persona p2 = new Persona();
	Persona p3;
	
	@BeforeEach
	void setUp() throws Exception {
		p3 = new Persona("sara", 75, 42, 41.3);
	}

	@Test
	@Order(1)
	void testSaraAfectadaPorMalaria() {
		p3.afectarEnfermedad(malaria);
		System.out.println(p3.getTemperatura());
		assertEquals(44.3, p3.getTemperatura());
		
	}
	
	@Test
	@Order(2)
	void testSaraAfectadaPorVaricela() {
		p3.afectarEnfermedad(varicela);
		System.out.print(p3.getVitalidad()+"\n");
		System.out.println(p3.getPeso());
		assertEquals(37, p3.getVitalidad());
		assertEquals(67.5, p3.getPeso());
		
	}
	
	@Test
	@Order(3)
	void testSaraTomeParacetamol() {
		p3.aplicarCura(paracetamol);
		
		System.out.println(p3.getTemperatura());
		assertEquals(37, p3.getTemperatura());
			
	}
	
	@Test
	@Order(4)
	void testSaraTome10GramosDePolen() {
		p3.aplicarCura(polen);
		polen.setGramos(10);
		
		System.out.println(p3.getVitalidad());
		assertEquals(49.5, p3.getVitalidad());
			
	}
	
	@Test
	@Order(5)
	void testSaraAfectadaPorEstres() {
		p3.afectarEnfermedad(estres);
	
		
		System.out.println(p3.getVitalidad());
		assertEquals(33.6, p3.getVitalidad());
			
	}
	
	@Test
	@Order(6)
	void testSaraTomeUnaNuez() {
		p3.aplicarCura(nuez);
	
		
		System.out.println(p3.getVitalidad());
		assertEquals(54.6, p3.getVitalidad());
			
	}
	
	
	@Test
	@Order(7)
	void testConocerLaCantidadDePacientes() {
		centrodesalud.agregarPaciente(p1);
		centrodesalud.agregarPaciente(p2);
		System.out.print(centrodesalud.cantidadDePacientes());
		assertEquals(2, centrodesalud.cantidadDePacientes());
		
	}
	
	

}
