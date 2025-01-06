package construction.builder;

class Person {

    static final String DEFAULT_NAME = "Anonimo";
    static final int DEFAULT_AGE = 18;

    String name;
    int age;
    boolean married;

    public Person() {
        this(DEFAULT_NAME);
    }

    public Person(String name) {
        this(name, DEFAULT_AGE);
    }

    public Person(String name, int age) {
        this(name, age, false);
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public Person(String name, boolean married) {
        this(name, DEFAULT_AGE, married);
    }

    public Person(int age, boolean married) {
        this(DEFAULT_NAME, age, married);
    }

    public Person(int age) {
        this(DEFAULT_NAME, age);
    }

    public Person(boolean married) {
        this(DEFAULT_NAME, DEFAULT_AGE, married);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}

class PersonBuilder {

    private String name = Person.DEFAULT_NAME;
    private int age = Person.DEFAULT_AGE;
    private boolean married = false;

    PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    PersonBuilder setMarried(boolean married) {
        this.married = married;
        return this;
    }

    Person build() {
        return new Person(name, age, married);
    }

}


public class BuilderDemo {

    public static void main(String[] args) {

        Person p1b = new PersonBuilder().setName("Perico Palotes").setMarried(true).build();
        Person p1c = new Person("Perico Palotes", true);

        System.out.println(p1b);
        System.out.println(p1c);

        Person p2b = new PersonBuilder().setName("Lorenzo Penco").setAge(60).build();
        Person p2c = new Person("Lorenzo Penco", 60);

        System.out.println(p2b);
        System.out.println(p2c);

        Person p3b = new PersonBuilder().setAge(48).build();
        Person p3c = new Person(48);

        System.out.println(p3b);
        System.out.println(p3c);

    }
}
