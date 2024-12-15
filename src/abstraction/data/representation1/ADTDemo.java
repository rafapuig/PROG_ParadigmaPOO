package abstraction.data.representation1;

import static java.io.IO.println;

public class ADTDemo {

    public static void main(String[] args) {
        Person armando =
                new Person(
                        "Armando",
                        "Bronca",
                        "Segura",
                        Person.Gender.MALE
                );

        armando.setApellido1("Pérez");
        armando.setApellido2("Oso");

        println(armando.getFullName());
    }

}
