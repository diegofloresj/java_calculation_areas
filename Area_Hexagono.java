import java.util.Scanner;//importas el escaner

public class Area_Hexagono //declara el nombre de la clase 
{

   public static void main(String [] args)// hace estatica la clase 

{
   
   Scanner t=new Scanner (System.in);//manda a llamar el escaner
   
   int perimetro1; //declara variable
   int apotema1; // declara variable
   
   System.out.println("Introduce el valor de un lado"); //pide informacion 
   perimetro1=t.nextInt(); // introduces datos por teclado
   
   System.out.println("Introduce el valor del apotema"); //pide informacion 
   apotema1=t. nextInt(); // introduces datos por teclado 
   
   double resultado = ((perimetro1*6)*apotema1/2);// hace una operacion 
   
   System.out.println("El area del cuadrado es:" + resultado);// muestra el resultado 
   
   }// finaliza el programa
   
}   // finaliza el programa