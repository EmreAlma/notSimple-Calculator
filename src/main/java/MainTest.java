import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.Test
    void addition() {
        double result = 4 + 7;
        double methodsResult = Main.addition(4,7);
        assertEquals(result, methodsResult);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        double result = 8 - 4;
        double methodsResult = Main.subtraction(8,4);
        assertEquals(result, methodsResult);

    }

    @org.junit.jupiter.api.Test
    void multiply() {
        double result = 5 * 4;
        double methodsResult = Main.multiply(5,4);
        assertEquals(result, methodsResult);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        double result = 18 / 3;
        double methodsResult = Main.divide(18,3);
        assertEquals(result, methodsResult);
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}