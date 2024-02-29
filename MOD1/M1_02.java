/*
Crear un programa que realice algunas operaciones matemáticas.
1. Pedir por consola al usuario que introduzca 3 números enteros y almacenar su valor en variables.
2. Operación 1 : a*b/c Mostrar por consola el resultado
3. Operación 2 : (a*c)%b Mostrar por consola el resultado
4. Operación 3 : 2*(a+c-b)/(b*c) Mostrar por consola el resultado
5. Operación 4 : ((a*c)+(b%a))/a-c Mostrar por consola el resultado

6. Opcional: Repetir las operaciones con números decimales para ver las diferencias de resultado. 
 */

import java.util.Scanner;

public class M1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // A
        System.out.println("\nIntroduce el primer número:");
        double a = scanner.nextDouble();
        int decimalA = (int)a;
        
        // B
        System.out.println("\nIntroduce el segundo número:");
        double b = scanner.nextDouble();
        int decimalB = (int)b;

        // C
        System.out.println("\nIntroduce el tercer número:");
        double c = scanner.nextDouble();
        int decimalC = (int)c;

        //Close Scanner
        scanner.close();

        System.out.println(a + "," + b + "," + c);

    }
    
}
