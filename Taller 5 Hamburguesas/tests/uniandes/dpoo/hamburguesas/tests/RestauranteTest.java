package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Restaurante;

public class RestauranteTest {
	private Restaurante restaurante;
	
	@BeforeEach
	void setUp() throws Exception {
		restaurante = new Restaurante();
	}
	
	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
	void testGetPedidoEnCurso() {
		assertEquals(null, restaurante.getPedidoEnCurso());
	}
}
