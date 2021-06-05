public class Cuenta {
		// atributos
		public int numeroCuenta;
		public String propietario;
		public double saldo;

		// mostrar informacion de la cuenta
		public void mostrarCuenta() {
			System.out.println("Cuenta: " + numeroCuenta + " Propietario: " + propietario + " Saldo: " + saldo);
		}
	}