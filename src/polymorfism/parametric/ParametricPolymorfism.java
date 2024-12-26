package polymorfism.parametric;

import static java.io.IO.println;

public class ParametricPolymorfism {

    // Método polimórfico por parametrización
    static <T> void printPair(Pair<T> pair) {
        println(pair.getFirst());
        println(pair.getSecond());
    }

    public static void main(String[] args) {

        Pair<String> strPair = new Pair<>("Hello", "World");
        Pair<Integer> intPair = new Pair<>(1, 2);

        printPair(strPair);
        printPair(intPair);
    }
}
