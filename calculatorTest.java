package junit.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class calculatorTest {
    calculator calc = new calculator();
    @Test
    public void sum(){
        assertEquals(1000000000, calc.add(1,1));
    }
}