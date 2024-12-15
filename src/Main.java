import static java.io.IO.println;

void main() {
    // Crear un objeto, instancia de la clase Person
    // Para crear un objeto se proporcionan los valores iniciales para los campos
    // en la llamada al constructor
    Person armando = new Person("Armando Bronca Segura", Person.Gender.MALE);

    // Enviar un mensaje al objeto para que nos diga su edad
    println(armando.getGender());

    // Enviar un mensaje al objeto para que nos diga su nombre
    println(armando.getName());

    // Enviar un mensaje al objeto para que se cambie su nombre por Perico Palotes
    // El objeto modificará su estado,
    // ya que cambiará el valor de su variable (campo) de instancia "name"
    armando.setName("Perico Palotes");

    // Enviar un mensaje al objeto para volver a pedirle su nombre
    println(armando.getName());

    // Creamos otra instancia (objeto) de tipo Persona
    Person esther = new Person("Esther Malgín", Person.Gender.FEMALE);

    // Ahora el mensaje para pedir el nombre se lo enviamos al objeto "esther"
    println(esther.getName());

    // Y su genero
    println(esther.getGender());
}
