package codo.a.codo;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=10;
		
		while(contador>0) {
			System.out.println("contado: "+contador);
			
			
			if(contador % 2==0) {
				System.out.println( contador +"Es par");
			}
			contador--;
		}

		
	}

}
