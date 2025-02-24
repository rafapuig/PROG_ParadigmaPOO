package exercises.personalnames;

public class NameDemo {

    public static void main(String[] args) {

        Name name = new Name.Builder()
                .withFirstname("John")
                .withMotherSurname("Jones")
                .build();

        System.out.println(name);
    }
}
