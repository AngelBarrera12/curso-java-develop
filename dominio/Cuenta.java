package dominio;

public class Cuenta {
		public int numeroCuenta; //01
		public String propietario; // "Jesus"
		public double saldo; // 10.5 decimal 64

		public void mostrarCuenta() {
			System.out.println("Cuenta: " + numeroCuenta + " Propietario: " + propietario + " Saldo: " + saldo);
		}
	}