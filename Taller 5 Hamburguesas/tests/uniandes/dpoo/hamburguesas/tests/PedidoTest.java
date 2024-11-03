package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class PedidoTest {
	private Pedido pedido1, pedido2, pedido3;
	private ProductoMenu productoMenu1, productoMenu2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		pedido1 = new Pedido("John Doe", "45th Wall Street");
		pedido2 = new Pedido("Mun-Dee", "2 Saggers Road");
		pedido3 = new Pedido("Tavish Finnegan DeGroot", "23 Corrennie Gardens");
		
		productoMenu1 = new ProductoMenu("corral", 14000);
		productoMenu2 = new ProductoMenu("papas grandes", 6900);
		
		pedido1.agregarProducto(productoMenu1);
		pedido1.agregarProducto(productoMenu2);
	}
	
	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
	void testGetIDPedido() {
		assertEquals(1, pedido1.getIdPedido(), "El ID del 1er pedido no es el esperado.");
		assertEquals(2, pedido2.getIdPedido(), "El ID del 2do pedido no es el esperado.");
		assertEquals(3, pedido3.getIdPedido(), "El ID del 3er pedido no es el esperado.");
	}
	
	@Test
	void testGetnombreCliente() {
		assertEquals("John Doe", pedido1.getNombreCliente(), "El nombre del cliente no es el esperado.");
	}
		
	
	@Test
	void testGetPrecioTotalPedido() {
		assertEquals(24871, pedido1.getPrecioTotalPedido(), "El total del pedido no es el esperado.");
	}
	
	@Test
	void testGenerarTextoFactura() {
		assertEquals("----------------\nPrecioNeto:  20900\nIVA:          3971\nPrecio Total: 24871\n", pedido1.generarTextoFactura(), "La factura generada no fue la esperada.");
	}
	
}
