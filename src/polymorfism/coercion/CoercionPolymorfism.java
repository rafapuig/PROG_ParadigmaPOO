package polymorfism.coercion;

public class CoercionPolymorfism {

    // Método polimórfico para tipos double, float, int
    static double square(double x) {
        return x * x;
    }

    public static void main(String[] args) {
        int num = 12345;
        double d1 = (double) num; // Conversión explicita

        // Conversión de AMPLIACIÓN puede ser implícita en Java
        double d2 = num; // Conversion implícita (automática) - coerción

        double d3 = 4.6;
        double result = square(d3);

        int i = 5;
        double result2 = square(i); // Conversion implícita de ampliación
    }
}
