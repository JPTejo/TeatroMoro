package teatromoro2;
import java.util.Scanner;
/**
 *
 * @author Juan Pablo Tejo; Kevin Rojas
 */
public class TeatroMoro2 {
    static Scanner input = new Scanner(System.in);
    static Scanner cierre = new Scanner(System.in);
    

    public static void main(String[] args) {
        int zonaA = 15000;
        int zonaB = 13000;
        int zonaC = 10000;
        float precioFinal = 0;
        int precioBase = 0;
        double descuento = 1;
        String zona = "ninguna";
    
        //Bienvenida al programa
        for(int menu = 1; menu <= 2;  menu++){
            System.out.println("Bienvenido al menu de compras del Teatro Moro");
            System.out.println("Por favor seleccione que desea hacer:");
            System.out.println("1 - Comprar entradas");
            System.out.println("2 - Salir");
            int opcion = input.nextInt();
            if(opcion == 1){
                
                //Se solicita la ubicacion deseada
                System.out.println("Estas son las siguientes ubicaciones que tiene el teatro:");
                System.out.println("  |  Escenario  |  ");
                System.out.println("  ---------------  ");
                System.out.println("  |  Zona  A    |  ");
                System.out.println("  |  Zona  B    |  ");
                System.out.println("  |  Zona  C    |  ");
                System.out.println("Que ubicación le gustaria? ");
                System.out.println("1 - Zona A");
                System.out.println("2 - Zona B");
                System.out.println("3 - Zona C");
                int ubicacion = input.nextInt();
                if(ubicacion == 1){
                    precioFinal = zonaA;
                    zona = "Zona A";
                    precioBase = zonaA;
                }else if(ubicacion == 2){
                    precioFinal = zonaB;
                    zona = "Zona B";
                    precioBase = zonaB;
                }else if(ubicacion ==3){
                    precioFinal = zonaC;
                    zona = "Zona C";
                    precioBase = zonaC;
                }

                // Se solicita la edad para saber que desceunto hacer
                System.out.println("Por favor ingrese su edad");
                int edad = input.nextInt();
                if(edad <= 18 ){
                    System.out.println("Se aplicara el descuento de estudiantes, que corresponde al 10%");
                    descuento = 0.90;
                }else if(edad >= 65){
                    System.out.println("Se aplicara el descuento de tercera edad, que corresponde al 15%");
                    descuento = 0.85;
                }else{
                    System.out.println("A usted no le corresponde un descuento");
                }
                
                //Se calcula el precio final
                do{
                    precioFinal *= descuento;
                    
                }while(precioFinal == 0);
                
                
                //Visualización de la compra
                System.out.println("Su ubicacion sera en: " + zona);
                System.out.println("El precio base es: " + precioBase);
                System.out.println("La tarifa a pagar es: " + descuento + "%");
                System.out.println("El precio final es: " + precioFinal);
                
                //Permite al usuario seguir comprando si eso desea
                System.out.println("Desea seguir comprando?");
                String opcionfinal = cierre.nextLine();
                        if(opcionfinal.equalsIgnoreCase("si")){
                            System.out.println("Volvera al inicio del menu");
                        }else{
                            menu = 2;
                        }
                
            //cierre del proyecto
            }else if(opcion == 2){
                System.out.println("Usted ha seleccionado terminar la compra");
                menu = 2;
            }else{
                System.out.println("Opcion invalida");
            }
        }
        
        System.out.println("Muchas gracias por preferirnos!");
    }
    
}
