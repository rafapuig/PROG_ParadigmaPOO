package abstraction.procedural;

import static java.io.IO.println;


public class ProceduralAbstraction {

    /**
     * Programa que suma todos los números enteros entre 10 y 20
     */
    private static void sumAllIntegersFrom10to20() {
        int sum = 0;
        int contador = 10;
        while (contador <= 20) {
            sum += contador;
            contador++;
        }
        println(sum); //165
    }

    /**
     * Programa que suma todos los números enteros entre 40 y 60
     */
    private static void sumAllIntegersFrom40to60() {
        int sum = 0;
        int contador = 40;
        while (contador <= 60) {
            sum += contador;
            contador++;
        }
        println(sum); //1050
    }

    // La lógica es la misma en ambos "programas"
    // El que suma de 10 a 20 y el que suma de 40 a 60

    // Sí somos capaces de ignorar las diferencias
    // entre los dos fragmentos de código
    // podremos evitar la duplicidad de la lógica en ambos sitios

    // ABSTRACCIÓN POR ESPECIFICACIÓN
    // Escribir la especificación, documentación, comentario, o "manual"
    // del programa o función
    // Describe lo QUE hace la función
    // y esconde (ignora o suprime) COMO lo hace a sus usuarios (código llamador)
    // Se especifican las pre-condiciones
    // - El límite inferior debe ser menor o igual al superior
    // - Los límites tienen que ser lo suficientemente pequeños para que al sumar
    // todos los enteros entre ambos el valor resultante "quepa" dentro de un entero
    // La post-condición (resultado) se cumple siempre que se cumplan las pre-condiciones
    // Es como un contrato entre el llamador y la función
    /**
     * Programa que suma todos los números enteros entre
     * un límite inferior y uno superior especificados como parámetros
     * El valor del parámetro lowerLimit debe ser menor o igual al valor
     * del parámetro upperLimit.
     * Si la suma de todos los enteros entre el límite inferior y superior
     * excede el rango del tipo entero el valor del resultado no está definido.
     * @param lowerLimit El límite inferior del rango
     * @param upperLimit El límite superior del rango
     * @return La suma de todos los enteros entre lowerLimit (inclusivo) y upperLimit (inclusivo)
     */
    private static int sumAllIntegers(int lowerLimit, int upperLimit) {
       /* El código está escrito ignorando el valor real que tendrán
          los valores del límite inferior y superior
          Se ha aplicado el proceso de ABSTRACCIÓN POR PARAMETRIZACIÓN
          Se encapsula el código dentro de una entidad denominada función (procedimiento)
          y se definen los parámetros formales lowerLimit y upperLimit de la función
          y tiene un tipo de retorno int, se devolverá un entero al código llamador de la función */
        int sum = 0;
        int contador = lowerLimit; //marcador donde sustituir por el valor real del límite inferior
        while (contador <= upperLimit) {//marcador donde sustituir por el valor real del límite superior
            sum += contador;
            contador++;
        }
        return sum;
    }


    public static void main(String[] args) {
        sumAllIntegersFrom10to20();
        sumAllIntegersFrom40to60();
        // Al llamar a la función se proporcionan los valores reales con los
        // que se desea realizar la suma a los parámetros formales
        // Aquí somos el usuario de la función
        int sum1 = sumAllIntegers(10, 20);
        println(sum1);
        int sum2 = sumAllIntegers(40, 60);
        println(sum2);
    }


}
