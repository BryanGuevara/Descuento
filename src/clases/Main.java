/*Desarrollar un programa que solicite la cantidad de puntos que un cliente ha
obtenido por sus compras en una tienda y en base a esta cantidad muestre
que tipo de cliente es; sabiendo que, si los puntos son menos de 1000, el
cliente es Bronce; si los puntos están entre 1000 y 3000 es un cliente Plata
y si los puntos son más de 3000 es un cliente Oro.*/
package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion de varibles y Scanner
        Scanner scanner = new Scanner(System.in);
        int puntos;

        //Ingresar valores
        System.out.println("=============[Puntos]==============");
        System.out.println("                                   ");
        System.out.print("Cantidad de Puntos: ");
        puntos = scanner.nextInt();

        //Imprimir Resultados
        System.out.println("                                   ");
        System.out.println("=============[Nivel]===============");
        System.out.println("                                   ");
        if (puntos < 1000) {

            System.out.println("El Nivel del Cliente es Bronce");

        } else {
            if (puntos < 3000) {

                System.out.println("El Nivel del Cliente es Plata");

            } else {

                System.out.println("El Nivel del Cliente el Oro");

            }
        }
        System.out.println("                                   ");
        System.out.println("===================================");

    }

}
