package dominio;

public class Cuenta {
		public int numeroCuenta; //0
		public String propietario; // null
		public double saldo; // 0.0
		public int edad;


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