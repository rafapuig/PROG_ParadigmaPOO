package initializers;

public class AnonymousDemo {

    static class Person {
        String name;
        protected int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void turnYear() {
            age++;
        }
    }

    public static void main(String[] args) {

        Person person = new Person("Perico Palotes", 45);

        // Crea una clase anónima derivada de Person
        Person benjamin = new Person("Benjamin", 22) {

            // Inicializador de instancia
            {
                // La clase anónima no tiene ningún nombre
                System.out.println("Creando un objeto de la clase anonima: " + this.getClass().getSimpleName());
                age = 100;
            }

            @Override
            public void turnYear() {
                age--;
            }
        };

        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        person.turnYear();
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");

        System.out.println(benjamin.getName() + " tiene " + benjamin.getAge() + " años.");
        benjamin.turnYear();
        System.out.println(benjamin.getName() + " tiene " + benjamin.getAge() + " años.");
    }

}
