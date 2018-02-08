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
        System.out.println("Digite el lado del cuadrado");
        int a;
        int s;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        s = a*a;
        System.out.println("El area del cuadrado es: "+s);
        // TODO code application logic here
    }
    
}
