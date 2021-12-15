import java.util.Scanner;//importas el escaner

public class Area_Esfera //declara el nombre de la clase 
{

   public static void main(String [] args)// hace estatica la clase 

{
   
   Scanner t=new Scanner (System.in);//manda a llamar el escaner
   
   int radio1; //declara variable
   double pi= 3.14; // declara variable 
      
   System.out.println("Introduce el valor del radio"); //pide informacion 
   radio1=t.nextInt(); // introduces datos por teclado
   
   double resultado = (4*pi*(radio1*radio1)); // hace una operacion 
   
   System.out.println("El area del circulo es:" + resultado); // muestra el resultado 
   


   } // finaliza el programa
   
}   // finaliza el programa