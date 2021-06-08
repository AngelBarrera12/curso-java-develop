package prueba;

public class Aplicacion {
	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		c.saldo=10.5;
		
		System.out.println("07/06/2021 17:50");
		System.out.println("........................");

		MiFecha mf = new MiFecha();
		mf.setDia(32);
		//mf.setMes(13);
		//mf.getDia;
		System.out.println(mf.getDia()); //dia no valido
		//System.out.println(mf.mes); //dia no valido
		System.out.println("........................");



		//System.out.println(c.saldo);
		//System.out.println(c.mostrarCuenta());
	}
}