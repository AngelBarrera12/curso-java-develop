package prueba;
import dominio.Cuenta;
import dominio.Cliente;

public class Aplicacion {
	public static void main(String[] args) {
		
		Cuenta c = new Cuenta(1, 33);
		System.out.println(c.edad);
		
		
		System.out.println("08/06/2021 18:50");
		System.out.println("........................");

		Cliente c1 = new Cliente();
		c1.edad=127;
		System.out.println(c1.edad);


		System.out.println("........................");

	}
	{System.out.println("Bloque tercero");}
}

