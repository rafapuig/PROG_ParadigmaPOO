/**
 * Una clase contiene la definición, los planos (blueprint), o plantilla
 * que indica al compilador que datos tiene y como se comportan
 * los objetos (instancias) de la clase definida
 *
 * Encapsula miembros (members)
 * - de estado: campos (fields)
 * - de comportamiento: métodos (methods)
  */
public class Person {
    //Campos (estado):
    // Almacenan los datos internos de un objeto de la clase

    /**
     * Tipo enumerado Gender para indicar el género de una Persona
     * Define un nuevo tipo de datos y, por tanto, podemos crear variables de
     * tipo Gender que solamente podrán tener como valor alguno de los del conjunto
     * de valores de la lista
     */
    public enum Gender {MALE, FEMALE}

    // Se definen dos campos de instancia para la clase persona
    private String name;    // Variable (campo) de instancia name
    private final Gender gender;  // Variable (campo) de instancia gender
    // El valor conjunto de todos los campos
    // para una instancia concreta de tipo persona
    // en un momento dado del tiempo lo denominamos ESTADO

    /**
     * Constructor, crea instancia de clase Persona
     * Para crear un objeto se necesitan los valores iniciales para los campos
     * que determinan el estado inicial del objeto en el momento de su creación
     */
    public Person(String initialName, Gender initialGender) {
        name = initialName;
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

    // Dado que no se ha definido un método setGender
    // los objetos no pueden responder a un mensaje para
    // cambiar su género
    // El género queda establecido de manera permanente
    // en el momento de su creación (instanciación)

    // NOTA:
    // Si ningún campo de un objeto puede cambiar después
    // de asignarles su valor inicial,
    // es decir, su estado inicial ya no se modifica
    // diremos que el objeto es inmutable
}
