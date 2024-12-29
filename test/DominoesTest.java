import exercises.dominoes.Dominoes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DominoesTest {


    @Test
    public void testDominoesState() {
        // Given
        Dominoes dominoes = new Dominoes(5, 3);

        // When
        int top = dominoes.getTop();
        int bottom = dominoes.getBottom();

        // Then
        assertEquals(5, top);
        assertEquals(3, bottom);
    }

    @Test
    public void testDominoesPoints() {
        Dominoes dominoes = new Dominoes(5, 3);
        int points = dominoes.getPoints();
        assertEquals(5 + 3, points);
    }

    @Test
    public void testDominoesFlip() {
        // Given
        Dominoes dominoes = new Dominoes(5, 3);

        // When
        dominoes.flip();

        // Then
        assertEquals(5, dominoes.getBottom());
        assertEquals(3, dominoes.getTop());
    }

    @Test
    public void testDominoesCanLink() {
        // Given
        Dominoes dominoes1 = new Dominoes(5, 3);
        Dominoes dominoes2 = new Dominoes(3, 1);
        Dominoes dominoes3 = new Dominoes(4, 6);

        // When
        boolean canLink12 = dominoes1.canLink(dominoes2);
        boolean canLink13 = dominoes1.canLink(dominoes3);

        // Then
        assertTrue(canLink12);
        assertFalse(canLink13);
    }

    @Test
    public void testDominoesEquals() {
        Dominoes dominoes1 = new Dominoes(5, 3);
        Dominoes dominoes2 = new Dominoes(3, 5);
        Dominoes dominoes3 = new Dominoes(4, 5);

        assertTrue(dominoes1.equals(dominoes2));
        assertFalse(dominoes1.equals(dominoes3));
        assertFalse(dominoes1.equals(null));
        assertFalse(dominoes1.equals(dominoes3));
        assertTrue(dominoes1.equals(dominoes1));
    }

    @Test
    public void testDominoesToString() {

        // Given
        Dominoes dominoes = new Dominoes(5, 3);

        // When
        String text = dominoes.toString();

        System.out.println(dominoes);

        // Then
        assertEquals("[5:3]", text);


        /*String texto = "Hola mundo";
        System.out.println(texto.substring(0, Math.min(2, texto.length())));
        System.out.println(texto.substring(texto.length() - Math.min(texto.length(), 2), texto.length()));

        texto.replace('a', Character.toUpperCase('a'));


        String inversa = new StringBuilder(texto).reverse().toString();

        System.out.println(inversa);

        int j = 6;
        Integer a = Integer.valueOf(j); // Boxing de j
        int i = a.intValue(); // Unboxing*/


    }

}
