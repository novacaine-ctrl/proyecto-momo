import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


    int a = 10, b = 3;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);    



    boolean mayorDeEdad = true;
    boolean tieneCarnet = false;

    System.out.println(mayorDeEdad && tieneCarnet);
    System.out.println(mayorDeEdad || tieneCarnet);
    System.out.println(!mayorDeEdad);


   // double base = 5.0;
    //double altura = 3.0;
    // double area = (base * altura) / 2;

     /*   Scanner sc = new Scanner(System.in);

        System.out.print("¿Ingrese la base del triángulo?: ");
        double base = sc.nextDouble();

        System.out.print("¿Ingrese la altura del triángulo?: ");
        double altura = sc.nextDouble();

     double area = (base * altura) / 2;
   System.out.println("El área del triángulo es: " + area); */

        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Ingrese la base del triángulo: ");
            double base = sc.nextDouble();

            System.out.print("Ingrese la altura del triángulo: ");
            double altura = sc.nextDouble();

            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);

            System.out.print("¿Desea calcular el área de otro triángulo? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);


        if (nota1 >= 90) {
            System.out.println("Excelente");
        } else if (nota1 >=70) {
            System.out.println("Bueno");
        } else if (nota1 >= 60) {
            System.out.println("Aprobado");
        } else if (nota1 < 60) {
            System.out.println("Reprobado");
        } else {
            System.out.println("Nota inválida");
        }

        if (nota2 >= 90) {
            System.out.println("Excelente");
        } else if (nota2 >=70) {
            System.out.println("Bueno");
        } else if (nota2 >= 60) {
            System.out.println("Aprobado");
        } else if (nota2 < 60) {
            System.out.println("Reprobado");
        } else {
            System.out.println("Nota inválida");
        }  

        if (nota3 >= 90) {
            System.out.println("Excelente");
        } else if (nota3 >=70) {
            System.out.println("Bueno");
        } else if (nota3 >= 60) {
            System.out.println("Aprobado");
        } else if (nota3 < 60) {
            System.out.println("Reprobado");
        } else {
            System.out.println("Nota inválida");
        }
    
//arectangulo, acirculo, acuadrado)
promedio

notas
notaspromedio
mayor de edad 
        
    }
}
