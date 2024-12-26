package polymorfism.inclusion;

import static java.io.IO.println;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        println("Miau");
    }
}
