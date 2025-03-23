package abstraction.data.representation2;

/**
 * En esta version de la clase cambiamos la representación de la información
 * Podemos hacer sin afectar al resto del código gracias la abstracción de datos
 * la clase es un ADT
 */
public class Person {

    public enum Gender {MALE, FEMALE}

    /**
     * La ventaja que tiene definir todos los campos de la clase como privados
     * es que se abstrae al código que usa la clase
     * de como se maneja internamente el estado del objeto
     * (representación de la información)
     * Lo que la convierte en un tipo de datos abstracto ADT
     */

    private String name;    // Campo de instancia name

    // En esta versión para almacenar la información de los apellidos
    // usaremos un array de dos elementos
    private final String[] apellidos = new String[2];

    private final Gender gender;  // Campo de instancia gender


    /**
     * Constructor, crea instancia de clase Persona
     * Para crear un objeto se necesitan los valores iniciales para los campos
     * que determinan el estado inicial del objeto en el momento de su creación
     */
    public Person(String initialName, String initialApellido1,
                  String initialApellido2, Gender initialGender) {
        name = initialName;
        apellidos[0] = initialApellido1;
        apellidos[1] = initialApellido2;
        gender = initialGender;
    }

    // Métodos (comportamiento):

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
        return apellidos[0];
    }

    public void setApellido1(String newApellido1) {
        apellidos[0] = newApellido1;
    }

    public String getApellido2() {
        return apellidos[1];
    }

    public void setApellido2(String newApellido2) {
        apellidos[1] = newApellido2;
    }

    public String getFullName() {
        return "%s %s %s".formatted(getName(), getApellido1(), getApellido2());
    }
}
