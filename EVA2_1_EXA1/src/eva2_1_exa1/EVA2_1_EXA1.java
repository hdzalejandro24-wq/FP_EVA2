/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA2_1_EXA1 {
 public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int saldo = 5000;
int pin, opc,mont, calculo;
System.out.println("introduce el PIN");
pin = input.nextInt();
if(pin == 1234){
System.out.println("Selecciona la operacion");
System.out.println("1 Consulta el saldo");
System.out.println("2 Retirar monto");
System.out.println("3 Depositar monto");

opc = input.nextInt();

 if(opc == 1){
     int sal = 5000;
     //Consultar saldo
    System.out.println("Tu saldo es " + sal );
  
} else if (opc == 2){
 //Retirar dinero
System.out.println("cuanto vas a retitar?" );
mont = input.nextInt();
int calc = 5000- mont;

if(mont <= 5000){
calculo = saldo - mont;
System.out.println("Retiro exitoso" );
System.out.println("tu saldo es" + calculo );
}else{

    System.out.println("Monto mayor al saldo disponible");
}
}else if (opc == 3){
System.out.println("cuanto vas a depositar?" );

int dep = input.nextInt();
int pos = 5000 + dep;
System.out.println("Tu saldo actual es: " + pos );
}else if (opc > 3){
     System.out.println("Seleccionaste la operacion correcta" );
}
 }else{
    System.out.println("Acesso denegado" );
 
}
}
 }


        




    
    
    

