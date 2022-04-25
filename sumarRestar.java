import java.util.Scanner;

public class sumarRestar {
    public static int sumar (int a, int b){
        int suma;
        suma=a+b;
        return suma;
    }
    public static int restar (int a, int b){
        int resta;
        resta=a-b;
        return resta;
    }

    public static void main(String[] args) {

        int a,b;
        Scanner teclado = new Scanner(System.in);


        String[] menu = new String[]{"SUMAR", "RESTAR"};
        System.out.println("MENU: ");
        int opciones;
        for(opciones = 0; opciones < menu.length; ++opciones) {
            System.out.println(opciones + 1 + ". " + menu[opciones]);
        }

        System.out.println("elije una opcion: ");
        opciones = teclado.nextInt();
        if (opciones==1){
            System.out.println("<----  Vamos a sumar  ---->\n");
            System.out.println("introduce un número");
            a= teclado.nextInt();
            System.out.println("introduce otro número");
            b= teclado.nextInt();
            System.out.println("La suma es: "+sumar(a,b));
        }else if(opciones==2){
            System.out.println("<----  Vamos a restar  ---->\n");
            System.out.println("introduce un número");
            a= teclado.nextInt();
            System.out.println("introduce otro número");
            b= teclado.nextInt();
            System.out.println("La resta es: "+restar(a,b));

        }
    }
}
