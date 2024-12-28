package intro;

public class Person {

    // Campos para almacenar el estado de un objeto Persona
    String name = "Desconocido";  // Inicialización del valor del campo (cada instancia creada tendrá ese valor inicial en el campo name)
    int age;    // Si no se inicializa toma el valor por defecto de ese tipo de datos

    // Comportamiento
    // Método saludar, que responde al mensaje "saluda"
    public void greet() {
        System.out.println("Hola, me llamo " + name + " y tengo " + age + "años!");
    }

}
