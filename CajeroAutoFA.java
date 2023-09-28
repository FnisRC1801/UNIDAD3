
package cajeroauto;

// Creado por Estefania Reynoso Colin y Alexander Medina Dominguez

import java.util.Scanner;

public class CajeroAutoFA {

    public static void main(String[] args) {
        
        double saldoA = 35220;
        
        Scanner coco = new Scanner (System.in);
        
        System.out.println("Hola :D ¿Que decea hacer?");
        System.out.println("Opciion 1: consultar saldo");
        System.out.println("Opciion 2: hacer un deposito");
        System.out.println("Opciion 3: hacer un retiro");
        System.out.println("Seleccion 1, 2 o 3");
        int option = coco.nextInt();
           
       
        switch (option){
           
           case 1:
               System.out.println("Su saldo es de "+saldoA);
               break;
               
           case 2:
               System.out.println("Ingrese cantidad que desea depositar: ");
               double depos = coco.nextDouble();
               double deposSal = saldoA+depos;
               System.out.println("Deposito exitoso!! su saldo actual es de "+deposSal);
               break;
               
          case 3:
               System.out.println("Ingrese cantidad que desea retirar: ");
               double retiro = coco.nextDouble();
                    if (saldoA>=retiro){
                        double actsal = saldoA-retiro;    
               System.out.println("Retiro exitoso, su saldo actualizado seria: "+actsal);
                   }else {
                    System.out.println("Fondos insuficientes :c");
                    } 
                    break;
                    
          default : 
               System.out.println("Opcion no valida. Porfavor seleccione opcion valida");   
       }
        
       
    }
    
}
