/**
Clase utilizada para representar los clieentes de una Cuenta.
Un cliente tiene una cuenta en el banco.
Cada cliente puede realizar operaciones como ver operacion.
*/

package dominio;
import java.util.Scanner;

/**
*@author Gabo
*/

public class Cliente{
	// Atributos
	private String nombre; //almacenar una cadena de texto
	private String apellido;

	public byte edad; // alamacene los años de vida del cliente
	private short afiliacion; // 32767
	private int codigoPostal; // cinco digitos 98605
	public long CLABE; //18 digitos 

	public float sueldo;
	public double saldo;

	// Un cliente tiene una cuenta
	public Cuenta cuentaCliente;

	// variable de clase
	public static Scanner entrada = new Scanner(System.in);

	// fromulario de registrar cliente
	public void fromularioRegistroCliente(){
		System.out.print("Ingresa el nombre del cliente: ");
		nombre = entrada.nextLine();
		System.out.print("Ingresa el apellido del cliente: ");
		apellido = entrada.nextLine();
		System.out.print("Ingresa la edad del cliente: ");
		edad = entrada.nextByte();
		System.out.print("Ingresa la afiliacion del cliente: ");
		afiliacion = entrada.nextShort();
		System.out.print("Ingresa el codigo postal del cliente: ");
		codigoPostal = entrada.nextInt();
		System.out.print("Ingresa la CLABE del cliente: ");
		CLABE = entrada.nextLong();
		System.out.print("Ingresa el sueldo del cliente: ");
		sueldo = entrada.nextFloat();
		System.out.print("Ingresa el saldo del cliente: ");
		saldo = entrada.nextDouble();
	}



	// Mostrar los detalles del cliente
	public void mostrarInformacionCliente(){
		System.out.println("Nombre: " +nombre+ " apellido: " +apellido+ " edad: " +edad+ " afiliacion: " +afiliacion+ " codigo Postal: " +codigoPostal);
	}
}