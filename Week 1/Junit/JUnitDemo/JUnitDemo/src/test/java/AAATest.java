import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAATest {

    private int a;
    private int b;

    @BeforeEach
    public void setUp() {
        System.out.println("Setup method executed");
        a = 10;
        b = 20;
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Teardown method executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int result = a + b;

        // Assert
        assertEquals(expected, result);
    }
}