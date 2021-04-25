package prog2.ha1.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display correct number after pressing digit keys")
    void testDigitInput() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressDigitKey(2);

        String expected = "42";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after adding two positive numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "4";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("should display result after Multiplication two positive numbers")
    void testPositiveMultiplication() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressBinaryOperationKey("*");
        calc.pressDigitKey(2);

        calc.pressEqualsKey();
        String expected = "8";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after Division two positive numbers")
    void testPositiveDivision() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressBinaryOperationKey("?");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "invalid";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after pressing two time the negativeKey  of positive numbers")
    void testPressNegativeKey() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);

        calc.pressNegativeKey();
        calc.pressNegativeKey();

        String expected = "4";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    //TODO hier weitere Tests erstellen
}

