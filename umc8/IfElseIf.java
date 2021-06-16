package umc8;

public class IfElseIf{
	public static void main(String[] args){
		int valor = 5;
		String descripcion = "No identificado";

		if (valor == 1) {
			descripcion = "Uno";
		} else if (valor == 2){
			descripcion = "Dos";
		} else if (valor == 3){
			descripcion = "Tres";
		} else {
			descripcion = "Otro";
		}
		System.out.println("descripcion: " +descripcion);
	}
}