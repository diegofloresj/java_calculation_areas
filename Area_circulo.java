import java.util.Scanner;
public class Area_circulo{
   public static void main (String args[]){
   
   Scanner t=new Scanner (System.in);
   
   int radio1;
   double pi = 3.14;
  
   System.out.println ("introduce el valor del radio");
   radio1=t.nextInt();
  
  
   double resultado = (pi*radio1*radio1);
  
   System.out.println ("El area del circulo es:\n" + resultado);   
   }
     
}