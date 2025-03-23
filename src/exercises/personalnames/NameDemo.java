package exercises.personalnames;

public class NameDemo {

    public static void main() {

        Name name = new Name.Builder()
                .firstName("John")
                .lastName("Jacob")
                .fatherSurname("Smith")
                .motherSurname("Jones")
                .build();

        System.out.println(name);
    }
}
