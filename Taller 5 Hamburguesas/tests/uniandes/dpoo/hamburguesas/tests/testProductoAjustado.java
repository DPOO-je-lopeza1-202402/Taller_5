package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class testProductoAjustado {
	private ProductoAjustado productoAjustado;
	
	@BeforeEach
	void setUp() throws Exception {
		ProductoMenu productoBase = new ProductoMenu("corral", 14000);
		productoAjustado = new ProductoAjustado(productoBase);
	}
	
	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
    void testGetNombre() {
        assertEquals( "corral", productoAjustado.getNombre( ), "El nombre del producto no es el esperado." );
    }
	
	@Test
    void testGetPrecio() {
        assertEquals( 14000, productoAjustado.getPrecio( ), "El precio del producto no es el esperado." );
    }
}
