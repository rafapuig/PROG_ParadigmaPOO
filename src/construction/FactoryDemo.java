package construction;

class Person {

    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // Método factoría estática
    public static Person create(String name, int age) {
        return new Person(name, age);
    }
}

public class FactoryDemo {

    public static void main(String[] args) {

        Person perico = Person.create("Perico Palotes", 45);

        System.out.println(perico.getName());
        System.out.println(perico.getAge());
    }

}
