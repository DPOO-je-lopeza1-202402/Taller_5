package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoMenuTest {
	private ProductoMenu productoMenu;
	
	@BeforeEach
	void setUp() throws Exception {
		productoMenu = new ProductoMenu("corral", 14000);
	}
	
	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
    void testGetNombre() {
        assertEquals( "corral", productoMenu.getNombre( ), "El nombre del producto no es el esperado." );
    }
	
	@Test
    void testGetPrecio() {
        assertEquals( 14000, productoMenu.getPrecio( ), "El precio del producto no es el esperado." );
    }
	
	@Test
	void testGenerarTextoFactura() {
		assertEquals( "corral\n            12000\n", productoMenu.generarTextoFactura(), "La factura generada no es la esperada.");
	}
}
