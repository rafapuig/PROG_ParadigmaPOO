package relations;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Relationships {

    static class Salary {
        int amount;
        int payments;
    }

    static class Profesor {
        String name;
        float statusRate = 1.0f;

        public Profesor(String name) {
            this.name = name;
        }

        //Dependencia
        float calculatePayment(Salary salary) {
            return salary.amount * salary.payments * statusRate;
        }

    }

    static class Student {

        //Asociación
        private Profesor profesor;

        public Profesor getProfesor() {
            return profesor;
        }
        public void setProfesor(Profesor profesor) {
            this.profesor = profesor;
        }
    }


    static class Department {
        String name;
        List<Profesor> profesors = new ArrayList<>();
    }

    static class University {

        Department[] departments = new Department[] {
                new Department(),
                new Department(),
                new Department(),
        };
    }


    public static void main(String[] args) {

        Student student = new Student();
        Profesor rafa = new Profesor("Rafa Puig");

        student.setProfesor(rafa);
        System.out.println(student.getProfesor());
    }

}
