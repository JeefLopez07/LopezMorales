package miTrabajo;

import java.util.Scanner;

class serieConsola
	{
		public static void main (final String[] args) {
	        Scanner n1;
	        System.out.println("Ingresa el valor de inicio");
	        n1 = new Scanner(System.in);
	        int val1=n1.nextInt();
	        
	        System.out.println("Ingresa el segundo valor");
	        Scanner n2; 
	        n2 = new Scanner(System.in);
	        int val2=n2.nextInt();

	        
	        System.out.println("Ingresa el numero de repeticiones");
	        Scanner repeticiones;
	        repeticiones = new Scanner(System.in);
	        int repetir=repeticiones.nextInt();

	        
	        System.out.println(n1);
	        System.out.println(n2);
	        int x = 0;
	        //ciclo
	        do 
	        {

	            int n3 = val1+val2;
	            System.out.println(n3);
	            val1=val2;
	            val2=n3;
	           x++;
	        }        
	        while(x<repetir);
	    }
	}

