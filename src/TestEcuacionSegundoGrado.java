import java.util.Scanner;

public class TestEcuacionSegundoGrado {
    public static void main(String[] args) {
        //LECTURA DE LOS COEFICIENTES
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el coeficinte a:");
        double a = sc.nextDouble();
        System.out.println("Introduce el coeficinte b:");
        double b = sc.nextDouble();
        System.out.println("Introduce el coeficinte c:");
        double c = sc.nextDouble();
        sc.close();

        //COMPROBACION SI ES RESOLUBLE O NO
        if (EcuacionSegundoGrado.esResoluble(a, b, c)) {
            System.out.println("Es resoluble");
            double x1 = EcuacionSegundoGrado.calcularX1(a, b, c);
            double x2 = EcuacionSegundoGrado.calcularX2(a, b, c);
            System.out.printf("X1 = %.3f%n", x1);
            System.out.printf("X2 = %.3f%n", x2);
        } else {
            System.out.println("No es resoluble");


        }
    }
}
