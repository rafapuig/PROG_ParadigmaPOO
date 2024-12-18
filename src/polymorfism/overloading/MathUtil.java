package polymorfism.overloading;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MathUtil {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static double max(double x, double y) {
        return x > y ? x : y;
    }

    @Contract(pure = true)
    static String max(@NotNull String s1, String s2) {
        return s1.compareTo(s2) > 0 ? s1 : s2;
    }

    /*static int max(int[] nums) {
        return Arrays.stream(nums).max().orElse(0);
    }*/

    static int max(int... nums) {
        return Arrays.stream(nums).max().orElse(0);
    }

    static void main(String... args) {

        int max1 = max(1, 2);

        double max2 = max(2.0, 3.0);

        String max3 = max("Libro", "Pelicula");

        int max4 = max(new int[]{1, 2, 3, 4});

        int max5 = max(1, 2, 3, 4, 5);

        // Sobrecarga del operador + en Java
        // En Java no se puede sobrecargar los operadores con tipos definidos por el usuario (programador)
        int n1 = 10 + 20;
        double n2 = 10.0 + 20.0;
        String s = "Hola" + "mundo";
    }

}
