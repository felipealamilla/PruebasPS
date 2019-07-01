package romanosprueba;
import java.util.Scanner;

// Autor: Luis Felipe Alamilla Calixto
// Correo: luisfelipe.axg@gmail.com
// Teléfono: 9831551774

public class Romanosprueba {
    public static String ARomanos(int n) {
        String romano="";
        
        int reglas[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String simbolo[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int repetir;
        
        for(int x=0; x<reglas.length; x++){
            repetir = n / reglas[x];
            
            for(int i=1; i<=repetir; i++){
                romano = romano + simbolo[x];
            }
            n = n % reglas[x];
        }
        return romano;
    }
 
    public static void main(String args[]){
               
        System.out.println("Ingrese un número del 1 al 1000:");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
        if (numero>0 & numero <= 1000){
            System.out.println("Su representación en Romanos es:");
            System.out.println(ARomanos(numero) + " = " + numero);
        }
        else {
            System.out.println("No puede ser menor a 1 ni mayor a 1000");
        }
    }
}