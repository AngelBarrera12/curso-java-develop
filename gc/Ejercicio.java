package gc;

class Uno{
	Dos dos;
	public Uno(){
		dos = new Dos(this);
	}
}

class Dos{
	Uno uno;
	public Dos(Uno u){
		uno = u;
	}
}

public class Ejercicio{
	public static void main(String[] args){
		Uno primero = new Uno();
		primero = null;
		// here SABER CUANTOS SON CANDIDATOS AL GC
	}
}