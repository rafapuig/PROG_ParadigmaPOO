package polymorfism.inclusion;

import static java.io.IO.println;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        println("Guau");
    }
}
