public class OperadorCondicional{
	public static void main(String[] args){
		int a = 8, min = 0, max = 10;
		
		//operador logico
		boolean res = a >= 0 & a <= 10; //true
		//operador logico de corto circuito
		boolean res1 = a >= 0 && a <= 10; //true
		if(res){
			System.out.println("Dentro");
		}else{
			System.out.println("Fuera");
		}
		
	}
}