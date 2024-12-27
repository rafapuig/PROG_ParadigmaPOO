package exercises.dominoes;

public class Dominoes {

    private int top;
    private int bottom;

    public Dominoes(int top, int down) {
        this.top = top;
        this.bottom = down;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public boolean isDouble() {
        return bottom == top;
    }

    public int getPoints() {
        return bottom + top;
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public boolean canLink(Dominoes dominoes) {
        if( this.bottom == dominoes.bottom) return true;
        if( this.top == dominoes.top) return true;
        if( this.bottom == dominoes.top) return true;
        return this.top == dominoes.bottom;
    }

    public boolean equals(Dominoes other) {
        if(this == other) return true;
        if(other == null) return false;
        int max = Math.max(bottom, top);
        int min = Math.min(bottom, top);
        int otherMax = Math.max(other.bottom, other.top);
        int otherMin = Math.min(other.bottom, other.top);
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
        return "[" + top + ":" + bottom + "]";
    }
}
