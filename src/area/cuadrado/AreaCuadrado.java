/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¿Qué desea saber?");
        System.out.println("1. Area");
        System.out.println("2. Perimetro");
        int a;
        int s;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Digíte el lado del cuadrado");
                s = sc.nextInt();
                s = s*s;
                System.out.println("El area del cuadrado es: "+s);
                break;
            case 2:
                System.out.println("Digíte el lado del cuadrado");
                s = sc.nextInt();
                s = s*4;
                System.out.println("El perimetro del cuadrado es: "+s);
                break;
        }
        // TODO code application logic here
    }
    
}
