package exercises.personalnames;

public class Name {

    private final String firstName;
    private final String lastName;

    //String[] surnames = new String[2];

    private final String fatherSurname;
    private final String motherSurname;


    private Name(String firstName, String lastName, String fatherSurname, String motherSurname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherSurname() {
        return fatherSurname;
    }

    public String getMotherSurname() {
        return motherSurname;
    }

    /**
     * Comprueba que un texto contiene caracteres distintos a blancos
     * @param text texto del que se va a comprobar que tiene contenido
     * @return true si el texto contiene caracteres, aparte de blancos
     */
    protected static boolean hasContent(String text) {
        return text != null && !text.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //Fabricante de objetos String
        if (hasContent(firstName)) {
            sb.append(firstName);
            sb.append(" ");
        }
        if (hasContent(lastName)) {
            sb.append(lastName);
            sb.append(" ");
        }
        if (hasContent(fatherSurname)) {
            sb.append(fatherSurname);
            sb.append(" ");
        }
        if (hasContent(motherSurname)) {
            sb.append(motherSurname);
            //sb.append(" ");
        }
        int lastIndex = sb.length() - 1;
        if(sb.charAt(lastIndex) == ' ') {
            sb.deleteCharAt(lastIndex); // Eliminar el último carácter añadido
        }
        //sb.append("<--");
        return sb.toString(); // Fabricar y devolver el String
    }


    static class Builder {

        private String firstName;
        private String lastName;
        private String fatherSurname;
        private String motherSurname;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder fatherSurname(String fatherSurname) {
            this.fatherSurname = fatherSurname;
            return this;
        }

        public Builder motherSurname(String motherSurname) {
            this.motherSurname = motherSurname;
            return this;
        }

        // Método factoría, fabrica el objeto producto: Name
        Name build() {
            return new Name(firstName, lastName, fatherSurname, motherSurname);
        }
    }

}



