import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***********************************************");
		System.out.println("******** Calculadora Calculator S.A************");
		System.out.println("***********************************************");
	 
	     Scanner entradaDatos = new Scanner(System.in);
	     
	     int opcion = 0;
	    
	     do {
	    	 
			 System.out.println("");
	   	     System.out.println("Introduzca una opción del menú:");
		     System.out.println("1. Sumar");
		     System.out.println("2. Restar");
		     System.out.println("3. Multiplicar");
		     System.out.println("4. Dividir");
		     System.out.println("5. Numero mayor de 3 números");
		     System.out.println("6. Capicúa");
		     System.out.println("0. Salir");
		     System.out.print("Introduzca una opción:");
	    	  
	    	opcion = entradaDatos.nextInt(); 
	     
	    	switch(opcion) {
	         case 1:
	        	 sumar();
	        	 break;
	         case 2:
	        	 restar();
	        	 break;
	         case 3:
	        	 multiplicar();
	        	 break;
	         case 4:
	        	 dividir();
	        	 break;
	         case 5:
	        	 mayortres();
	        	 break;
	         case 6:
	        	 capicua();
	        	 break;
	         case 0:
	        	 salida();
	        	 break;
	         default:
	        	 System.out.println("");
	        	 System.out.println("**************");
	        	 System.out.println("Opción errónea");
	        	 System.out.println("**************");
	        	 } 
	        }while (opcion !=0);
	         
	         System.out.println("");
	         System.out.println("**************************");
	         System.out.println("El programa ha finalizado.");
	         System.out.println("**************************");
	}
	 
	//SUMA
	static void sumar(){
	   System.out.println("");
	   System.out.println("****** Sumar ******");
	   Scanner entradaDatos = new Scanner(System.in);
		
	   System.out.println("");
	     
	   float num1 = 0.0f;
	   float num2 = 0.1f;
	   float resultado = 0.3f;
	   
	   System.out.print("Introduzca el primer número flotante a sumar: ");
	   num1 = entradaDatos.nextFloat();
	   System.out.print("Introduzca el segundo número flotante a sumar: ");
	   num2 = entradaDatos.nextFloat();
	   
	   resultado = num1 + num2;
	   
	   System.out.println("");
	   System.out.println("**************************************");
	   System.out.println("La suma de"+" "+ num1+ " "+ "y" + " " + num2 + " es" + " " + resultado);
       System.out.println("**************************************");
	
	}
	
	//RESTAR
	static void restar() {
		System.out.println("");
		System.out.println("****** Restar ******");
		Scanner entradaDatos = new Scanner(System.in);
		
		 System.out.println("");
		 
		 float num1 = 0.0f;
		 float num2 = 0.1f;
		 float resultado = 0.2f;
		
	System.out.print("Introduzca el primer número flotante a restar: ");	
		num1 = entradaDatos.nextFloat();
		System.out.print("Introduzca el segundo número flotante a restar: ");
		num2 = entradaDatos.nextFloat();
		
		resultado = num1 - num2;
		
		System.out.println("");
		   System.out.println("**************************************");
		   System.out.println("La resta de"+" " + num1 +" "+ "y"+" "+ num2 +" "+ "es" +" " + resultado);
	       System.out.println("**************************************");
	
	}
	
	//MULTIPLICAR
	static void multiplicar() {
		System.out.println("");
		System.out.println("****** Multiplicar ******");
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("");
		
		float num1 = 0.0f;
		float num2 = 0.1f;
		float resultado = 0.2f;
		
		System.out.print("Introduzca el primer número flotante a multiplicar: ");
		num1 = entradaDatos.nextFloat();
		System.out.print("Intoduzca el segundo número flotante a multiplicar: ");
		num2 = entradaDatos.nextFloat();
		
		resultado = num1 * num2;
		
		System.out.println("");
		   System.out.println("**************************************");
		   System.out.println("La multiplicacion de"+" "+ num1 +" "+ "y"+" "+ num2 +" "+ "es"+ " "+ resultado);
	       System.out.println("**************************************");	
		
	}
		
	//DIVISION
	static void dividir() {	
		System.out.println("");
	    System.out.println("****** Dividir ******");
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("");
		
		
		float num1 = 0.1f;
		float num2 = 0.2f;
	    float resultado = 0.2f;
	    
		System.out.print("Introduzca el primer número flotante a dividir: ");		
		num1 = entradaDatos.nextFloat();
		System.out.print("Introduzca el segundo número flotante a dividir: ");
		num2 = entradaDatos.nextFloat();
		
		if ( num2 <= 0) {
			System.out.println("");
			System.out.println("**********");
			System.out.println("Error division por 0");
			System.out.println("**********");
		
		} else {
			
			 resultado = num1 / num2;
		  		
				System.out.println("");
				   System.out.println("**************************************");
				   System.out.println("La division de "+" "+ num1 +" "+ "y"+" "+ num2 +" "+ "es"+ " "+ resultado);
			       System.out.println("**************************************");
			       
		}
	
	}
	
	//MAYOR3
    static void mayortres() {
    	System.out.println("");
  	    System.out.println("****** Número mayor de 3  ******");
    	Scanner entradaDatos = new Scanner(System.in);
    	
    	float a = 0.0f;
    	float b = 0.1f;
    	float c = 0.2f;
    	
    	System.out.print("Introduzca el primer número flotante de los 3: ");
    	a = entradaDatos.nextFloat();
    	System.out.print("Introduzca el segundo número flotante de los 3: ");
        b = entradaDatos.nextFloat();
        System.out.print("Introduzca el tercer número flotante de los 3: ");
        c = entradaDatos.nextFloat();
        
    if (a>b && a>c) {
    	System.out.println("");
    	System.out.println("*****************************************************");
    	System.out.println("El número"+" "+ a +" "+"es el mayor de los 3 números" );
        System.out.println("*****************************************************");
    	
    }
    else if (b>a && b>c) {
    	System.out.println("");
    	System.out.println("***************************************************");
    	System.out.println("El número"+" "+ b +" "+"es el mayor de los 3 números");
        System.out.println("***************************************************");
    	
    }
    else if (c>a && c>b) {
    	System.out.println("");
    	System.out.println("****************************************************");
    	System.out.println("El número"+" "+ c +" "+"es el mayor de los 3 números");
    	System.out.println("****************************************************");		
    }

    }
    
	
    //CAPICUA
   	static void capicua() {
   	
   		System.out.println("");
   		System.out.println("****** Capicúa ******");
   		
   		
   	Scanner entradaDatos = new Scanner(System.in);
   		int n = 0;
   		int aux = 0;
   		int inverso = 0;
   		int cifras = 0;
   	
   		do {
   			System.out.println("");
   			System.out.println("Introduzca un número para saber si es capicúa: ");
   			n = entradaDatos.nextInt();
   		}while (n<10);
   		
   		aux = n;
   		while (aux!=0) {
   			cifras = aux % 10;
   			inverso = inverso * 10 + cifras;
   			aux = aux / 10;
   		}
   			
   		if (n == inverso) {
   			System.out.println("");
   			System.out.println("*************");
   			System.out.println("SI es capicúa");
   		    System.out.println("*************");
   		}else {
   			System.out.println("");
   			System.out.println("*************");
   			System.out.println("NO es capicúa");
   			System.out.println("*************");
   		}
   		
   		
   	}
	
   	//SALIDA
	static void salida() {
	}
	
}
