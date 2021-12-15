import java.util.Scanner;// Importas el escaner

public class Area_Cilindro{ // Declara el nombre de la clase

   public static void main(String [] args){ // Hace estatica la clase 
   
   Scanner t=new Scanner (System.in); // Manda a llamar el escaner
   
   int radio1; // Declara variable
   int altura1; // Declara variable
   double pi= 3.14;
      
   System.out.println("Introduce el valor del radio"); // Pide informacion 
   radio1=t.nextInt(); // Introduces datos por teclado
   
   System.out.println("Introduce el valor de la altura"); // Pide informacion 
   altura1=t.nextInt(); // Introduces datos por teclado
   
   double resultado1 = (2* pi*radio1*altura1); // Hace una operación
   
   double resultado2 = (2* pi*(radio1*radio1));// Hace una operación

   double resultado3 = (resultado1 + resultado2); // Hace una operación
  
   System.out.println("El area del cilindro es:" + resultado3); // Muestra el area del cilindro
   
   } // Finaliza el programa
   
}   // Finaliza el programa