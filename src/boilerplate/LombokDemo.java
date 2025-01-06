package boilerplate;

public class LombokDemo {

    public static void main(String[] args) {

        Person person = new Person();
        Person perico = new Person("Perico Palotes", 35);
        Person victor = new Person("Victor Nado", 35, true);

        Person belen = new Person.PersonBuilder()
                .name("Belen Tilla")
                .age(32)
                .married(true)
                .build();

        person.setName("Lorenzo Penco");
        person.setAge(56);
        person.setMarried(true);

        System.out.println(person);
        System.out.println(perico);
        System.out.println(victor);
        System.out.println(belen);

        System.out.println(perico.getName() + " esta casado? : " + (perico.isMarried() ? "SI" : "NO"));
    }

}
