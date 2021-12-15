import java.util.Scanner;
public class Area_triangulo{
   public static void main (String args[]){
   
   Scanner t=new Scanner (System.in);
   
   int base, altura;
  
   System.out.println ("introduce la base");
   base=t.nextInt();
  
   System.out.println ("introduce la altura");
   altura=t.nextInt(); 
  
   double resultado = (base*altura/2);
  
   System.out.println ("El area del cuadrado es\n" + resultado);
   
   }
   
   
}