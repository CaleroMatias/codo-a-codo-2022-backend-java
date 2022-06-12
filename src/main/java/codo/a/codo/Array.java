package codo.a.codo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nombres =new String[] {"matias","ezequiel"};
		
		int[] array = new int[4]; //0-2
		array[0]=10;
		array[1]=11;
		array[2]=12;
		array[3]=13; //Error
			
	    System.out.println("fin");
	    
	    //como recorrer el array
	    
	    for(int i=0;i< array.length; i++){
	    	System.out.println(array[i]);
	    }
	    
	    	    
	    //si quiero mostrar solo el indice 3
	    
	   System.out.println("muestro el indice 3 :"+array[3]);
	    
	  //recorrer el array usando un for each
	    for(int aux :array) {
	    	System.out.println(aux);
	    }
 
	}

}
