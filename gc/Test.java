package gc;

public class Test{
	Test t; //variable de instancia
	public static void main(String[] args){
			//TODO
			Test t = new Test();
			Test t2 = t.m(t);
			t2 = null;
			// more code
	}

	Test m(Test t){
		Test t1 = new Test();
		Test t2 = new Test();

		t1.t = t2; //almaceno el valor de t2 en ?
		t2.t = t1;
		t.t = t2;

		return t1;
	}
}

//a) error al compilar
//b) erro de eecucion
//c) 3 objetos
//d) 2 objetos
//e) 0 objetos