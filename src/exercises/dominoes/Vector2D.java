package exercises.dominoes;

import java.util.StringJoiner;

public class Vector2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(x + v.x, y + v.y);
    }

    public Vector2D sub(Vector2D v) {
        return new Vector2D(x - v.x, y - v.y);
    }

    public Vector2D mul(Vector2D v) {
        return new Vector2D(x * v.x, y * v.y);
    }

    public Vector2D div(Vector2D v) {
        return new Vector2D(x / v.x, y / v.y);
    }

    public Vector2D neg() {
        return new Vector2D(-x, -y);
    }

    public Vector2D abs() {
        return new Vector2D(Math.abs(x), Math.abs(y));
    }

    public Vector2D cross(Vector2D v) {
        return new Vector2D(x * v.y, y * v.x);
    }

    /**
     * Obtiene el producto escalar de dos vectores
     *
     * @param v vector junto con el cual vamos a obtener el producto escalar
     * @return valor del producto escalar
     */
    public float dot(Vector2D v) {
        return x * v.x + y * v.y;
    }

    /**
     * Obtiene la magnitud (longitud) del vector
     *
     * @return longitud del vector
     */
    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public void normalize() {
        float len = length();
        x = x / len;
        y = y / len;
    }

    public static Vector2D normalized(Vector2D v) {
        Vector2D n = new Vector2D(v.x, v.y);
        n.normalize();
        return n;
    }

    @Override
    public String toString() {
        return new StringJoiner(",", "[", "]")
                .add(String.valueOf(x))
                .add(String.valueOf(y))
                .toString();
    }
}
