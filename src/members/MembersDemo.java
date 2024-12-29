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

    private String getSpeechBubble() {
        return name + ": ";
    }

    private void printMessage(String message) {
        System.out.println(getSpeechBubble() + message);
    }


    public void greet() {
        printMessage(greeting);
    }

    void greetTo(Person greeted) {
        if (greeted == this || greeted == null) {
            greet();
        } else {
            printMessage(greeting + " " + greeted.name);
        }
    }

    void introduce() {
        printMessage(greeting + ", me llamo " + name);
    }

    void introduce(Person introduced) {
        if (introduced == this || introduced == null) introduce();
        else printMessage("Te presento a " + introduced.name);
    }


    /* Métodos estáticos */

    private static void printMessage(Person speaker, String message) {
        if (speaker == null) {
            System.out.println(NO_SPEAKER);
            return;
        }
        speaker.printMessage(message);
    }

    static void setGreeting(String newGreeting) {
        greeting = newGreeting;
    }

    static void makeGreet(Person speaker) {
        String message = greeting;
        printMessage(speaker, message);
    }

    static void makeGreetTo(Person speaker, Person greeted) {
        if (greeted == speaker || greeted == null) {
            makeGreet(speaker);
            return;
        }
        String message = greeting + " " + greeted.name;
        printMessage(speaker, message);
    }

    static void makeGreetTo_v2(Person speaker, Person greeted) {
        if(speaker != null) speaker.greetTo(greeted);
        else System.out.println(NO_SPEAKER);
    }

    static void makeIntroduce(Person speaker) {
        if (speaker != null) speaker.introduce();
        else System.out.println(NO_SPEAKER);
    }

    static void makeIntroduce(Person speaker, Person introduced) {
        if (introduced == speaker || introduced == null) {
            makeIntroduce(speaker);
            return;
        }
        String message = "Te presento a " + introduced.name;
        printMessage(speaker, message);
    }

    static void makeIntroduce_v2(Person speaker, Person introduced) {
        // Delegando en el método de instancia
        if (speaker != null) speaker.introduce(introduced);
        else System.out.println(NO_SPEAKER);
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
        Person.makeIntroduce(lorenzo, lorenzo);
        Person.makeIntroduce(belen, null);
        Person.makeIntroduce(null, null);
    }


}
