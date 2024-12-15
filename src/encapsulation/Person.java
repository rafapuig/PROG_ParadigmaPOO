package encapsulation;

public class Person {

    public enum Gender {MALE, FEMALE}

    /**
     * Se definen cuatro campos de instancia para la clase persona
     * Como son públicos, únicamente estamos encapsulando no ocultando información
     */
    public String name;    // Campo de instancia name
    public String apellido1;
    public String apellido2;
    public final Gender gender;  // Campo de instancia gender


    /**
     * Constructor, crea instancia de clase Persona
     * Para crear un objeto se necesitan los valores iniciales para los campos
     * que determinan el estado inicial del objeto en el momento de su creación
     */
    public Person(String initialName, String initialApellido1,
                  String initialApellido2, Gender initialGender) {
        name = initialName;
        apellido1 = initialApellido1;
        apellido2 = initialApellido2;
        gender = initialGender;
    }

    // Métodos (comportamiento):

    // Solamente a nivel de cada método se produce ocultación en esta clase
    // Ya que los cuerpos de los métodos y del método constructor
    // ocultan la lógica escrita dentro de ellos

    /**
     * Responde al mensaje "dame tu nombre" devolviendo un valor String
     * con valor igual al valor del campo name de la instancia que ha recibido
     * el mensaje
     */
    public String getName() {
        return name;
    }

    /**
     * Responde al mensaje "cámbiate el nombre por el nuevo nombre que te proporciono"
     * La instancia que recibe este mensaje responde cambiando su estado,
     * ya que modifica el valor de unos de sus campos (el campo name)
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Responde al mensaje "dime tu género"
     * La instancia que recibe el mensaje devuelve un valor del tipo enumerado Gender
     * igual al que tiene almacenado en su estado, concretamente en el campo gender
     */
    public Gender getGender() {
        return gender;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String newApellido1) {
        apellido1 = newApellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String newApellido2) {
        apellido2 = newApellido2;
    }

    public String getFullName() {
        return "%s %s %s".formatted(getName(), getApellido1(), getApellido2());
    }
}
