package classes.access;

public class AccessTest {

    public static void main(String[] args) {

        // Para que la clase AccessTest pueda acceder a la clase Human
        // Dado que Human está encapsulada en el paquete classes y la clase AccessTest en el paquete classes.access
        // y, por tanto, pertenecen a paquetes diferentes
        // la clase Human ha tendido que ser declarada con acceso public

        // Podemos acceder a la clase Human declarada en el paquete classes
        // Pero como estamos en otro paquete, tenemos que escribir el nombre completamente cualificado de la clase
        // El nombre completamente cualificado de una clase consiste en:
        // <nombre-paquete-donde-se-define-clase>.<nombre-clase>
        classes.Human human = new classes.Human();

        human.name = "Perico Palotes";
        //human.age // No podemos acceder a un campo que no sea público fuera de su paquete


    }

}
