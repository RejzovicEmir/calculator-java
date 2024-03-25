package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Calculator;

public class basicTest {
        @Test
        public void testAddition() {
            assertEquals("5.0", Calculator.Run("2+3"));
            assertEquals("0.0", Calculator.Run("0+0"));
            assertEquals("-1.0", Calculator.Run("-2+1"));
        }

        @Test
        public void testSubtraction() {
            assertEquals("3.0", Calculator.Run("6-3"));
            assertEquals("0.0", Calculator.Run("5-5"));
            assertEquals("-6.0", Calculator.Run("0-6"));
        }

        @Test
        public void testMultiplication() {
            assertEquals("10.0", Calculator.Run("2*5"));
            assertEquals("0.0", Calculator.Run("0*5"));
            assertEquals("-12.0", Calculator.Run("4*-3"));
        }

        @Test
        public void testDivision() {
            assertEquals("2.0", Calculator.Run("6/3"));
            assertEquals("-2.0", Calculator.Run("6/-3"));
            assertEquals("0.0", Calculator.Run("0/5"));
        }

        @Test
        public void testDivisionByZero() {
            assertEquals("ERROR", Calculator.Run("6/0"));
        }
    }

