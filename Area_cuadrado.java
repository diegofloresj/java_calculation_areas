import java.util.Scanner;
public class Area_cuadrado{
   public static void main (String args[]){
   
   Scanner t=new Scanner (System.in);
   
   int lado1,lado2;
  
   System.out.println ("introduce el valor del primer lado");
   lado1=t.nextInt();
  
   System.out.println ("introduce el valor del segundo lado");
   lado2=t.nextInt(); 
  
   double resultado = (lado1*lado2);
  
   System.out.println ("El area del cuadrado es\n" + resultado);
   
   } 
   
}