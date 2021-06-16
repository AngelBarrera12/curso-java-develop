package umc8;

public class Ejemplo{
	public static void main(String[] args){
		int a = 1, b = 0;
		
		if (a++ > ++b) {
			System.out.println("Modulo 1");
			System.out.println("if");
		}else {
			System.out.println("UMC 8");
			System.out.println("else");
		}
		System.out.println("Estructura de control " +a+ " : " +b); // a=2 b=1
	}
}

//