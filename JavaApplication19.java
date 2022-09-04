package javaapplication19;
import java.util.Scanner;
public class JavaApplication19 {
public static void main(String[] args) {
Scanner entrada = new Scanner (System.in) ;
int nota;

    System.out.println("Favor ingresar su nota");
    nota = entrada.nextInt();
    
    if (nota <=4)  
    {
    System.out.println("Necesita mejorar");
    }
    else
        if (nota >=6 && nota<11)
        {
        System.out.println("Aprobado");
}
    else
        if (nota>10)
        {
        System.out.println("Nota inválida");
   }
}
}
