package objetosprueba;
import java.util.Scanner;

// Autor: Luis Felipe Alamilla Calixto
// Correo: luisfelipe.axg@gmail.com
// Teléfono: 9831551774

class Cuadrado {      
    int lado;
    
    void cal_area(int lado) { 
        int area = lado * lado;  
        System.out.println("El Área del Cuadrado es = " + area + " u²");  
    }
    void cal_perimetro(int lado) {
        int perimetro = 4 * lado;
        System.out.println("El Perímetro del Cuadrado es = " + perimetro + " u");
    }
}

class Cubo extends Cuadrado {
    
    void cal_volumen(int lado) {
        int volumen = lado * lado * lado;
        System.out.println("El Volumen del Cubo es = " + volumen + " u³");
    }
    void cal_perimetroc(int lado) {
        int perimetroc = 12 * lado;
        System.out.println("El perímetro del Cubo es = " + perimetroc + " u");
    }
}

public class Objetosprueba {
    
    public static void main(String[] args) {

        System.out.println("¡ ¡ B I E N V E N I D O ! ! ");         
        boolean salir1 = false;
        
        do {
            System.out.println("\nMedida de un lado: \n");
            Scanner in1 = new Scanner(System.in);
            int lado = in1.nextInt(); 
            boolean salir2 = false;
                        
            do {
                System.out.println("\n¿Qué objeto usará?:\n"
                        + "1. Cuadrado          2. Cubo\n"
                        + "3. Cambiar medida    0. Salir del programa");
                Scanner in2 = new Scanner(System.in);
                int objeto = in2.nextInt();
                Cuadrado cd = new Cuadrado();
                Cubo cb = new Cubo();
                
                switch (objeto){
                    case 1:
                        boolean salir31 = false;
                        do{
                            System.out.println("\n** Eligió: Cuadrado con lado = " + lado);
                            System.out.println("\n¿Qué desea calcular del cuadrado?\n"
                            + "1. Área              2. Perímetro\n"
                            + "3. Cambiar objeto    0. Salir");
                            Scanner in3 = new Scanner(System.in);
                            int opcioncuadrado = in3.nextInt();
                            
                            boolean salir32 = false;
                            do {
                                switch (opcioncuadrado){
                                    case 1: cd.cal_area(lado);
                                        salir32 = true;
                                        break;
                                    case 2: cd.cal_perimetro(lado);
                                        salir32 = true;
                                        break;
                                    case 3: salir31 = true;
                                        salir32 = true;
                                        break;
                                    case 0: System.exit(0);
                                        break;
                                    default: System.out.println("\nX Opción no válida... ");
                                        salir32 = true;
                                        salir31 = true;
                                        break;
                                }
                            } while (!salir32);
                            System.out.println("\n¿Desea continuar calculando con lado = " + lado+ " ?\n"
                                    + "1. Sí    2. Cambiar medida/objeto     0. No, salir");
                            Scanner ch1 = new Scanner(System.in);
                            int resp1 = ch1.nextInt();

                            switch(resp1){
                                case 1: break;
                                case 2: salir31 = true;
                                        salir2 = true;
                                        break;
                                case 0: salir31 = true;
                                        salir2 = true;
                                        salir1= true;
                                        break;
                                default: System.out.println("\n X Opción no válida...");
                                        break;
                            }
                        } while (!salir31);
                        break;
//------------------------------------------------------------------------------                    
                    case 2: 
                        boolean salir41 = false;
                        do{
                            System.out.println("\n** Eligió: Cubo con lado = " + lado);
                            System.out.println("\n¿Qué desea calcular del cubo?\n"
                            + "1. Volumen           2. Perímetro\n"
                            + "3. Cambiar objeto    0. Salir");

                            Scanner in4 = new Scanner(System.in);
                            int opcioncubo = in4.nextInt();
                            
                            boolean salir42 = false;
                            do {
                                switch (opcioncubo){
                                    case 1: cb.cal_volumen(lado);
                                        salir42 = true;
                                        break;
                                    case 2: cb.cal_perimetroc(lado);
                                        salir42 = true;
                                        break;
                                    case 3: salir41 = true;
                                        salir42 = true;
                                        break;
                                    case 0: System.exit(0);
                                        break;
                                    default: System.out.println("\nOpción no válida, vuelva a intentar");
                                        salir42 = true;
                                        break;
                                    }
                            } while (!salir42);
                            System.out.println("\n¿Desea continuar calculando con lado = " + lado+ " ?\n"
                                    + "1. Sí    2. Cambiar medida/objeto     0. No, salir");
                            
                            Scanner ch1 = new Scanner(System.in);
                            int resp1 = ch1.nextInt();

                            switch(resp1){
                                case 1: break;
                                case 2: salir41 = true;
                                        salir2 = true;
                                        break;
                                case 0: salir41 = true;
                                        salir2 = true;
                                        salir1= true;
                                        break;
                                default: System.out.println("\n X Opción no válida...");
                                        break;
                            }
                        } while (!salir41);
                        break;
//------------------------------------------------------------------------------                                        
                    case 3: salir2 = true;
                        break;
//------------------------------------------------------------------------------                                            
                    case 0: salir2 = true;
                        salir1 = true;
                        break;
//------------------------------------------------------------------------------                    
                    default: System.out.println("Elija opción válida...");
                        break;
                    }
            } while (!salir2);
        } while (!salir1);
        System.out.println("¡Gracias por su visita!");
    }
}