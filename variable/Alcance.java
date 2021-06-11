package variable;

/**
*Variables locales son creadas cuando se ejecuta el método
*Las variables de instancia son inicializadas automáticamente
*Se destruyen cuando ese método es terminado
*/

public class Alcance{
	public static void main(String[] args){
		//TODO
		Dato d = new Dato();
		d.uno();
	}

}

class Dato{
	private int i=1;
	private static int contador = 0;

	public void uno(){
		int i = 4, j= 5;
		this.i = i;
		dos(7);
	}

	public void dos(int i){
		int j=8;
		this.i = i + j;
	}
}