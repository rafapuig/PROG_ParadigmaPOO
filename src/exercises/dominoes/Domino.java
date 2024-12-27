package exercises.dominoes;

public class Domino {

    private static final int TOP = 0;
    private static final int BOTTOM = 1;

    private final int[] sides = new int[2];


    public Domino(int top, int bottom) {
        sides[TOP] = top;
        sides[BOTTOM] = bottom;
    }

    public int getTop() {
        return sides[TOP];
    }

    public int getDown() {
        return sides[BOTTOM];
    }

    public boolean isDouble() {
        return sides[BOTTOM] == sides[TOP];
    }

    public int getPoints() {
        return sides[BOTTOM] + sides[TOP];
    }

    public void flip() {
        int temp = sides[TOP];
        sides[TOP] = sides[BOTTOM];
        sides[BOTTOM] = temp;
    }

    public boolean canLink(Domino dominoes) {
        if( this.sides[BOTTOM] == dominoes.sides[BOTTOM]) return true;
        if( this.sides[TOP] == dominoes.sides[TOP]) return true;
        if( this.sides[BOTTOM] == dominoes.sides[TOP]) return true;
        return this.sides[TOP] == dominoes.sides[BOTTOM];
    }

    public boolean equals(Domino other) {
        if(this == other) return true;
        if(other == null) return false;
        int max = Math.max(sides[BOTTOM], sides[TOP]);
        int min = Math.min(sides[BOTTOM], sides[TOP]);
        int otherMax = Math.max(other.sides[BOTTOM], other.sides[TOP]);
        int otherMin = Math.min(other.sides[BOTTOM], other.sides[TOP]);
        if(max != otherMax) return false;
        return min == otherMin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Dominoes other = (Dominoes) obj;
        return equals(other);
    }

    @Override
    public String toString() {
        return "[" + sides[TOP] + ":" + sides[BOTTOM] + "]";
    }

}
