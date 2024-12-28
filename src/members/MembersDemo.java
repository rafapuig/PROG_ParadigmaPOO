package members;

class Person {

    /**
     * Campo estático con el texto para saludar que usan los objetos persona
     * Existe solamente una copia de esta variable
     * Pertenece a la propia clase y es compartida por todos los objetos de la clase
     */
    private static String greeting = "Hola";

    /**
     * Campo estático con el texto a mostrar cuando no hay objeto hablante
     * Su valor es constante (final)
      */
    private static final String NO_SPEAKER = "No hay hablante";

    /**
     * Campo de instancia name
     * Cada objeto tiene su propia version o copia de este campo
     * para mantener su estado. Cada objeto tiene su propio nombre
     */
    String name;

    public Person(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println(name + ": " + greeting);
    }

    void greetTo(Person greeted) {
        if (greeted == this || greeted == null) greet();
        else System.out.println(name + ": " + greeting + " " + greeted.name);
    }

    void introduce() {
        System.out.println(name + ": " + greeting + ", me llamo " + name);
    }

    void introduce(Person introduced) {
        if (introduced == this || introduced == null) introduce();
        else System.out.println(name + ": " + "Te presento a " + introduced.name);
    }

    /* Métodos estáticos */

    static void setGreeting(String newGreeting) {
        greeting = newGreeting;
    }

    static void makeGreet(Person speaker) {
        String message = NO_SPEAKER;
        if (speaker != null)
            message = speaker.name + ": " + greeting;
        System.out.println(message);
        // o
        //if (speaker != null) speaker.greet();
    }

    static void makeGreetTo(Person speaker, Person greeted) {
        if (speaker == null) {
            System.out.println(NO_SPEAKER);
            return;
        }
        if (greeted == speaker || greeted == null) makeGreet(speaker);
        else System.out.println(speaker.name + ": " + greeting + " " + greeted.name);
        //o
        //if (speaker != null) speaker.greetTo(greeted);
    }

    static void makeIntroduce(Person speaker) {
        if (speaker == null) {
            System.out.println(NO_SPEAKER);
            return;
        }
        System.out.println(speaker.name + ": " + greeting + ", me llamo " + speaker.name);
        // o
        //if (speaker != null) speaker.introduce();
    }

    static void makeIntroduce(Person speaker, Person introduced) {
        if (speaker == null) {
            System.out.println(NO_SPEAKER);
            return;
        }
        if (introduced == speaker || introduced == null)
            makeIntroduce(speaker);
        else
            System.out.println(speaker.name + ": " + greeting + " " + introduced.name);

    }

    static void makeIntroduce_v2(Person speaker, Person introduced) {
        // Delegando en el método de instancia
        if (speaker != null) speaker.introduce(introduced);
    }

}


public class MembersDemo {

    public static void main(String[] args) {
        Person lorenzo = new Person("Lorenzo Penco");
        Person belen = new Person("Belen Tilla");

        lorenzo.greet();
        belen.greet();

        lorenzo.greetTo(belen);
        belen.greetTo(lorenzo);
        belen.greetTo(belen);
        lorenzo.greetTo(null);

        Person.setGreeting("Buenos dias");

        lorenzo.introduce();
        belen.introduce();
        lorenzo.introduce(belen);
        belen.introduce(lorenzo);
        lorenzo.introduce(lorenzo);
        belen.introduce(null);

        Person.setGreeting("Muy buenas");

        Person.makeGreet(lorenzo);
        Person.makeGreet(belen);
        Person.makeGreet(null);
        Person.makeGreetTo(lorenzo, belen);
        Person.makeGreetTo(belen, lorenzo);
        Person.makeIntroduce(lorenzo);
        Person.makeIntroduce(belen);
        Person.makeIntroduce(lorenzo, belen);
        Person.makeIntroduce(belen, lorenzo);
        Person.makeIntroduce(lorenzo,lorenzo);
        Person.makeIntroduce(belen,null);
        Person.makeIntroduce(null,null);
    }


}
