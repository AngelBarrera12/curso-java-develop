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

		System.out.println("09/06/2021 17:13");
		c1.CLABE = 2147483648L;
		//9 223 372 036 854 775 807 //64bits
		//c1.CLABE = 31411401600326941;
		System.out.println(c1.CLABE); //2147483648
		System.out.println(2L); //2
		System.out.println(077); //63
		System.out.println(0xBACL); //2988
		c1.sueldo = 168.5F;
		c1.saldo = 222.2;
		System.out.println(c1.sueldo); 
		System.out.println(c1.saldo);
		char ejemplo = 65535; //16 bits
		char ejemplo2 = '@';
		char ejemplo3 = '\t';
		char ejemplo4 = '\u03b6';
		//System.out.println(ejemplo4);

		c.tipoCuenta = 'N';
		System.out.println(c.tipoCuenta);

		boolean b = (3 != 4); //true - false (default)
		System.out.println(b);

		String a1, a2, a3;
		String a="Jesus", e="Jose";
		//String s, int i;

		System.out.println("........................");

	}
	{System.out.println("Bloque tercero");}
}


