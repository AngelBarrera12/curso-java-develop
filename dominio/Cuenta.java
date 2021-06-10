package dominio;

public class Cuenta {
		public int numeroCuenta; //0
		public Cliente propietario; // Una cuenta tiene un cliente
		public double saldo; // 0.0
		public int edad;

		/*
			* Diferentes tipos de cuenta
			* Cuenta corriente: Cuenta básica permite operaciones sencillas depósitos, retiros, etc.
			* Cuenta remunerada: Genera remuneración por ahorros
			* Cuenta nómina: Exige domicialización de la nómina, ofrece reducción de comisiones, promociones
			*Se utiliza la siguiente nomenclatura: c:corriente, r: remunerada, n:nomina
		*/

	public char tipoCuenta = 'C';

		// La cuenta se encuentra activa o no
		public boolean activa; //false


		{
			edad = edad + 2; 
			//este es un inicializador de instancia
		}

		static{
			//edad = 3; 
			//inicializador de contenido estatico (variables globales, varibales de clase)
		} 
		public Cuenta(int numeroCuenta, int edad){
			this.edad = edad;
			this.numeroCuenta = numeroCuenta;
			System.out.println("Vacio");
		}

		/*public Cuenta(int numeroCuenta, String cliente){
			this.numeroCuenta = numeroCuenta;
			propietario = cliente;
		}*/

		public void mostrarCuenta() {
			System.out.println("Cuenta: " + numeroCuenta + " Propietario: " + propietario + " Saldo: " + saldo);
		}
	}