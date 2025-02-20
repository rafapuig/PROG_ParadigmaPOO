package exercises.dominoes.quieesquien;

import static exercises.dominoes.quieesquien.Character.Gender.*;
import static exercises.dominoes.quieesquien.Character.*;
import static exercises.dominoes.quieesquien.Character.HairColor.BROWN;
import static exercises.dominoes.quieesquien.Character.HairColor.RED;
import static exercises.dominoes.quieesquien.Character.HairStyle.*;
import static exercises.dominoes.quieesquien.Character.SkinColor.*;

class Character {
    public enum Gender {MALE, FEMALE}

    public enum HairColor {WHITE, BLACK, RED, BLOND, BROWN}

    public enum HairStyle {LONG, SHORT}

    public enum SkinColor {WHITE, BLACK}

    String name;
    Gender gender;
    SkinColor skinColor;
    HairColor hairColor;
    boolean hasBeard;
    boolean isBald;
    HairStyle hairStyle;
    boolean hasMoustache;
    boolean wearGlasses;
    boolean hasBraids; // Trenzas
    boolean hasPonytails;

    private Character(String name, Gender gender, SkinColor skinColor, HairColor hairColor, boolean hasBeard,
                      boolean isBald, HairStyle hairStyle, boolean hasMoustache, boolean wearGlasses,
                      boolean hasBraids, boolean hasPonytails) {
        this.name = name;
        this.gender = gender;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.hasBeard = hasBeard;
        this.isBald = isBald;
        this.hairStyle = hairStyle;
        this.hasMoustache = hasMoustache;
        this.wearGlasses = wearGlasses;
        this.hasBraids = hasBraids;
        this.hasPonytails = hasPonytails;
    }

    public String getName() {
        return name;
    }

    public boolean hasPonytails() {
        return hasPonytails;
    }

    public boolean hasBraids() {
        return hasBraids;
    }

    public boolean wearGlasses() {
        return wearGlasses;
    }

    public boolean hasMoustache() {
        return hasMoustache;
    }

    public HairStyle getHairStyle() {
        return hairStyle;
    }

    public boolean isBald() {
        return isBald;
    }

    public boolean hasBeard() {
        return hasBeard;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Gender getGender() {
        return gender;
    }


    static class Builder {

        private String name;
        private Gender gender;
        private SkinColor skinColor;
        HairColor hairColor;
        boolean hasBeard;
        boolean isBald = false;
        HairStyle hairStyle;
        boolean hasMoustache;
        boolean wearGlasses;
        boolean hasBraids; // Trenzas
        boolean hasPonytails;

        public Builder(String name, Gender gender) {
            this(name, gender, WHITE);
        }

        public Builder(String name, Gender gender, SkinColor skinColor) {
            this.name = name;

            this.gender = gender;
            hairStyle = switch (this.gender) {
                case MALE -> SHORT;
                case FEMALE -> LONG;
            };

            this.skinColor = skinColor;
            if (this.skinColor == BLACK) {
                hairColor = HairColor.BLACK;
            }
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setSkinColor(SkinColor skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public Builder setHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder hasBeard() {
            this.hasBeard = true;
            return this;
        }

        public Builder isBald() {
            this.isBald = true;
            return this;
        }

        public Builder setHairStyle(HairStyle hairStyle) {
            this.hairStyle = hairStyle;
            this.isBald = false;
            return this;
        }

        public Builder hasMoustache() {
            this.hasMoustache = true;
            return this;
        }

        public Builder wearGlasses() {
            this.wearGlasses = true;
            return this;
        }

        public Builder hasBraids() {
            this.hasBraids = true;
            this.hasPonytails = false;
            this.setHairStyle(HairStyle.LONG);
            this.isBald = false;
            return this;
        }

        public Builder hasPonytails() {
            this.hasPonytails = true;
            this.hasBraids = false;
            this.setHairStyle(HairStyle.LONG);
            this.isBald = false;
            return this;
        }

        Character build() {
            return new Character(name, gender, skinColor, hairColor, hasBeard, isBald, hairStyle,
                    hasMoustache, wearGlasses, hasBraids, hasPonytails);
        }

    }

}


public class QuienEsQuien {

    public static void main(String[] args) {

        Character paco = new Character.Builder("Paco", MALE)
                .setHairColor(BROWN)
                .hasBeard()
                .build();

        Character alba = new Character.Builder("Alba", FEMALE)
                .setHairColor(BROWN)
                .setHairStyle(SHORT)
                .wearGlasses()
                .build();

        Character daniel = new Character.Builder("Daniel", MALE)
                .setHairColor(RED)
                .build();

        Character rafa = new Character.Builder("Rafa", MALE)
                .setHairColor(BROWN)
                .wearGlasses()
                .build();

        Character paz = new Character.Builder("Paz", FEMALE)
                .setHairColor(BROWN)
                .setHairStyle(SHORT)
                .build();

        Character noelia = new Character.Builder("Noelia", FEMALE)
                .setHairColor(BROWN)
                //.setHairStyle(LONG) // Innecesaria
                .hasBraids()
                .build();

        Character elisa = new Character.Builder("Elisa", FEMALE, BLACK)
                //.setHairColor(HairColor.BLACK)
                .setHairStyle(SHORT)
                .build();

        Character jorge = new Character.Builder("Jorge", MALE)
                .setHairColor(HairColor.BLACK)
                //.setHairStyle(SHORT) // No necesario
                .wearGlasses()
                .build();

        Character pablo = new Character.Builder("Pablo", MALE)
                .setHairColor(HairColor.BLOND)
                .build();

        Character irene = new Character.Builder("Irene", FEMALE)
                .setHairColor(HairColor.WHITE)
                .setHairStyle(SHORT)
                .wearGlasses()
                .build();

        Character mar = new Character.Builder("Mar", FEMALE)
                .setHairColor(HairColor.BLACK)
                .hasBraids()
                .build();

        Character antonio = new Character.Builder("Antonio", MALE, BLACK)
                //.setHairColor(HairColor.BLACK)
                .build();

    }

}
