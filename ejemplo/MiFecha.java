package ejemplo;

public class MiFecha{
	private int dia; //1 - 31
	private int mes; //1 -12
	private int ano; //

	public void setDia(int day){

		if(day>0 && day <= 31){
			this.dia = day;
		} else {
			System.out.println("Valor no permitido...");
		}
	}

	public int getDia(){
		return dia;
	}
}