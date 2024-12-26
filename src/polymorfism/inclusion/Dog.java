package polymorfism.inclusion;

import static java.io.IO.println;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        println("Guau");
    }
}
