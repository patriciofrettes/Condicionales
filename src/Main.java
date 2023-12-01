import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sueldo = 0;
        int categoria;

        System.out.println("Este programa calcula el sueldo de los empleados, a continuación ingrese el tipo de categoría que desea calcular");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 + 0.1);
        } else {
            if (categoria == 2){
                sueldo = 25630.89;
            }else {
                if (categoria == 3){
                    sueldo = 35560.20 - (35560.20*0.11);
                } else {
                    System.out.println("Error, ingrese un numero de categoría valido (1, 2 o 3)");
                }
            }
        }
        System.out.println("El total del sueldo para la categoría " + categoria + "es " + sueldo);
    }
}