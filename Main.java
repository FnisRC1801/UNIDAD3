import java.util.Scanner;


// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
       Scanner cute = new Scanner(System.in);
        
        int numero;
        System.out.println("Ingrese una cantidad entera: ");
        numero = cute.nextInt();
        
      cute.close();
        
        if (numero%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}