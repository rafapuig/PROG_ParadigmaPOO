package records;

// Un registro es un tipo especial de clase que extiende de la clase base java.lang.Record
// Define una serie de campos como atributos
// Los campos de un registro son inmutables (no se pueden modificar)
// Cada campo contará con un accesor cuyo nombre coincide exactamente con el nombre del campo
// Toman su valor inicial en el momento de instanciar un objeto del tipo del registro
// Por tanto, los registros se consideran objetos inmutables
// En un registro Java autogenera los métodos equals, hasCode y toString (ya se verán)
public record Computer(
        String name,
        int numberOfProcessors,
        int memory,
        int diskSpace,
        String brand) {
}

class ComputerDemo {

    public static void main(String[] args) {

        Computer flamante =
                new Computer(
                        "Flamante",
                        8,
                        32, 1000,
                        "Minis Forum");

        Computer surface8
                = new Computer(
                        "Surface 8",
                8,
                16,
                512,
                "Microsoft Surface Pro");

        System.out.println(flamante.name());
        System.out.println(flamante.numberOfProcessors());
        System.out.println(flamante.memory());
        System.out.println(flamante.diskSpace());
        System.out.println(flamante.brand());

        System.out.println(surface8.name());
        System.out.println(surface8.numberOfProcessors());
        System.out.println(surface8.memory());
        System.out.println(surface8.diskSpace());
        System.out.println(surface8.brand());

        //Invoca al método toString del tipo registro Computer para la instancia referenciada por flamante
        System.out.println(flamante);
        //Invoca al método toString del tipo registro Computer para la instancia referenciada por surface8
        System.out.println(surface8);
    }
}

