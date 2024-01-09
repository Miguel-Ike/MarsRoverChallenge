import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import app.model.Plateau;

public class PlateauTest {

    @Test
    public void testIsPositionValid() {
        Plateau plateau = new Plateau(5, 5);
        boolean result = plateau.isPositionValid(1, 2);
        assertTrue(result, "The position 1, 2 should be valid");
    }

    @Test
    public void testIsPositionInvalid() {
        Plateau plateau = new Plateau(5, 5);
        boolean result = plateau.isPositionValid(6, 2);
        assertTrue(!result, "The position 6, 2 should be invalid");
    }
}
