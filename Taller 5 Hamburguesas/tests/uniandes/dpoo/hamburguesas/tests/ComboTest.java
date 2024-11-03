package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Combo;
import java.util.ArrayList;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ComboTest {
	
	private Combo combo;
	
	@BeforeEach
	void setUp() throws Exception {
		ArrayList<ProductoMenu> items = new ArrayList<ProductoMenu>();
		
		ProductoMenu producto_1 = new ProductoMenu("corral", 14000);
		items.add(producto_1);
		
		ProductoMenu producto_2 = new ProductoMenu("papas medianas", 5500);
		items.add(producto_2);
		
		ProductoMenu producto_3 = new ProductoMenu("gaseosas", 5000);
		items.add(producto_3);
		
		combo = new Combo("combo corral", 0.1, items);
	}
	
	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
	void testGetNombre() {
		assertEquals(24500, combo.getNombre(), "El nombre recibido no fue el esperado.");
	}
	
	@Test
	void testGetPrecio() {
		assertEquals("combo corral", combo.getPrecio(), "El precio recibido no fue el esperado.");
	}
	
	@Test
	void testGenerarTextoFactura() {
		assertEquals("Combo combo corral\n Descuento: 10%\n            24500\n", combo.generarTextoFactura(), "La factura generada no fue la esperada.");
	}
}
