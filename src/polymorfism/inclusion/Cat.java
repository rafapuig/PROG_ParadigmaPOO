package polymorfism.inclusion;

import static java.io.IO.println;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        println("Miau");
    }
}
