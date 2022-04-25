/*
* @autor: Emerson de la cruz
* @DATE: 25/04/2022
* @Version:1.0
* @DESCRIPCION: Se trata de un propgram para sumar y restar dos números eneteros.
*
* */

import java.util.Scanner;
public class sumarRestar {
    /*
    * el metodo sumar recibe dos parametros como entero y los suma como resultado nos devuelve otro entero.
    * */

    public static int sumar (int a, int b){
        int suma;
        suma=a+b;
        return suma;
    }
    /*
     * el metodo restar recibe dos parametros como enteros y los resta
     * como resultado nos devuelve otro entero positivo o negativo.
     * */
    public static int restar (int a, int b){
        int resta;
        resta=a-b;
        return resta;
    }

    public static void main(String[] args) {
        //declaramos las variablles y el scanner que nos permite introducir daos por consol
        int a,b; //en a y b se almacenaran los números a sumar o restar según corresponda.
        Scanner teclado = new Scanner(System.in);

        //Hacemos un enu para que el usuario pueda elegir entre sumar y restar
        String[] menu = new String[]{"SUMAR", "RESTAR"}; //declaramos el array con las opciones del menu.
        System.out.println("MENU: ");
        int opciones;
        //mediante ese for reorremos el array y mostramos su contenido en pantalla.
        for(opciones = 0; opciones < menu.length; ++opciones) {
            System.out.println(opciones + 1 + ". " + menu[opciones]);
        }

        System.out.println("elije una opcion: ");
        opciones = teclado.nextInt();
        //con este if accedemos a la opcion indicada por el usuario y procedmos a ejecutar la operación
        if (opciones==1){
            System.out.println("<----  Vamos a sumar  ---->\n");
            System.out.println("introduce un número");
            a= teclado.nextInt();
            System.out.println("introduce otro número");
            b= teclado.nextInt();
            System.out.println("La suma es: "+sumar(a,b)); //muestra el resultado
        }else if(opciones==2){
            System.out.println("<----  Vamos a restar  ---->\n");
            System.out.println("introduce un número");
            a= teclado.nextInt();
            System.out.println("introduce otro número");
            b= teclado.nextInt();
            System.out.println("La resta es: "+restar(a,b));//muestra el resultado

        }
    }
}
