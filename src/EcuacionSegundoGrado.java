public class EcuacionSegundoGrado {

    public static boolean esResoluble(double a, double b, double c) {
        return b * b - 4 * a * c >= 0 ;

    }
    public static double calcularX1 (double a, double b, double c) {

        return - b * b + Math.sqrt(b * b - 4 * a * c) / 2 * a;
    }
    public static double calcularX2 (double a, double b, double c) {

        return  - b * b - Math.sqrt(b * b - 4 * a * c) / 2 * a;
    }

}
