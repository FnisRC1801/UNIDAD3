import java.util.*;
import java.lang.*;


// Tarde 1000 años pero ya salioooo :,3.
class Main {
    
    public static void main(String[] args) {
        Scanner cute = new Scanner (System.in);

     System.out.println ("Ingrese un numero >1: ");
        int numero = cute.nextInt();
        cute.close();

        int F1=0;
        int F2=1;
        int FIBO;
        

        System.out.println("La serie Fibonacci de "+numero+" es:");
        
            for (int k = 1;k <= numero;k++) {
                System.out.println(F1);

          FIBO = F1+F2;
           F1 = F2;
           F2 = FIBO;     
                
            } 

        System.out.println("Gracias por usarme UvU");
     
    }
}