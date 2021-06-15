package umc7;

public class OperadorUnario{
	public static void main(String[] args){
		int a = 3;
		int b = ++a;
		// pre-incremento
		// primero se incrementa la variable, despues se usa su valor

		System.out.println("a: " + a); // 4
		System.out.println("b: " + b); // 4
		//post-incremento
		// primero se utiliza la variable y luego se incrementa
		int c = 4;
		int d = c++;
		System.out.println("c: " + c); // 5
		System.out.println("d: " + d); // 4

		//TODO
		int e = 2;
		int f = --e;

		int g = 4;
		int h = g--;

		boolean i = true;
		boolean j = !i;
		System.out.println("i: " + i); // true
		System.out.println("j: " + j); // false

		int k = 3;
		int l = -k;
		System.out.println("k: " + k); // 3
		System.out.println("l: " + l); // -3
	}
}