package umc8;

public class Switch{
	public static void main(String[] args){
		int valor = 3;
		String descripcion = "No identificado";
		switch(valor){
			case 1:
				descripcion = "Uno";
				break;
			case 2:
				descripcion = "Dos";
				break;
			case 3:
				descripcion = "Tres";
				break;
			case 4:
				descripcion = "Cuatro";
				break;
			case 5:
				descripcion = "Cinco";
				break;
			default:
				descripcion = "Valor no identificado";
		}
		System.out.println("Res: " + descripcion);

		//float b = 5.0f;
		//double a = 4.3;
		//java.util.Date fecha = new java.util.Date();
		long d = 3L; //Error
		int ba = (int) d;
		String b = "true";

		switch(b){
			case "1":
				System.out.println("a");
				break;
			default:
				throw new AssertionError();
		}
	}
}