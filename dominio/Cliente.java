/**
Clase utilizada para representar los clieentes de una Cuenta.
Un cliente tiene una cuenta en el banco.
Cada cliente puede realizar operaciones como ver operacion.
*/

package dominio;

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


	// Mostrar los detalles del cliente
	public void mostrarInformacionCliente(){
		System.out.println("Nombre: " +nombre+ " apellido: " +apellido+ " edad: " +edad+ " afiliacion: " +afiliacion+ " codigo Postal: " +codigoPostal);
	}


}