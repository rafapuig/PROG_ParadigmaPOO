package exercises.personalnames;

public class Name {

    private String firstname;
    private String lastname;

    //String[] surnames = new String[2];

    private String fatherSurname;
    private String motherSurname;


    private Name(String firstname, String lastname, String fatherSurname, String motherSurname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fatherSurname = fatherSurname;
        this.motherSurname = motherSurname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
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
        if (hasContent(firstname)) {
            sb.append(firstname);
            sb.append(" ");
        }
        if (hasContent(lastname)) {
            sb.append(lastname);
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

        private String firstname;
        private String lastname;
        private String fatherSurname;
        private String motherSurname;

        public Builder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder withFatherSurname(String fatherSurname) {
            this.fatherSurname = fatherSurname;
            return this;
        }

        public Builder withMotherSurname(String motherSurname) {
            this.motherSurname = motherSurname;
            return this;
        }

        // Método factoría, fabrica el objeto producto: Name
        Name build() {
            return new Name(firstname, lastname, fatherSurname, motherSurname);
        }
    }

}



