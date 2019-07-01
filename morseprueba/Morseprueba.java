package morseprueba;
import java.util.Scanner;

// Autor: Luis Felipe Alamilla Calixto
// Correo: luisfelipe.axg@gmail.com
// Teléfono: 9831551774

public class Morseprueba {
    public static void main(String[] args) {
        char [] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };
        String [] morse = { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", " " };
        
        System.out.println( "Elija el número de la opción a usar:" );
        System.out.println( "1. Morse a Texto." );
        System.out.println( "2. Texto a Morse." );
                
        Scanner input = new Scanner (System.in);
        int opcion = input.nextInt();
        
        switch (opcion){
            
            case 1:   
                    System.out.println( "Ingrese un código morse:" );
                    Scanner input2 = new Scanner (System.in);
                    String codigom = input2.nextLine();
                    String[] frase = null;
                    
                    System.out.println( "\nTraducción a texto:\n" );
                    if(codigom.contains(" ")){
                        frase = codigom.split("[ ]");
                        }
                        else{
                            frase = new String[1];
                            frase[0] = codigom;
                            }
                        for (String word: frase ){
                                String[] characters = word.split(" ");
                                for (int h = 0;h < characters.length;h++){
                                    for (int i = 0;i < morse.length;i++){
                                        if (characters[h].equals(morse[i])){
                                            System.out.print(letras[i]);
                                            }
                                        }
                                    }
                                System.out.print(" ");    
                            }
                        System.out.println( "\n" );
            break;
                    
            case 2:
                Scanner input3 = new Scanner (System.in);
                System.out.println("Ingrese una palabra o frase en texto normal(minúsculas):");
                String texto = input3.nextLine(); 
                texto = texto.toLowerCase ();

                System.out.println( "\nTraducción a morse:\n" );
                for ( int x = 0; x < texto.length(); x++ )
                    {
                        for ( int y = 0; y < letras.length; y++ )
                        {
                            if ( letras [ y ] == texto.charAt ( x ) ){
                                System.out.print ( morse [ y ] + " " );
                                }
                            }
                    }
                System.out.println( "\n" );
            break;
            
            default:
                System.out.println("\nPor favor, seleccione una opción válida.");
        }
    }
}