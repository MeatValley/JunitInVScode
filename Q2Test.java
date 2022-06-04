package junit.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Q2Test {

    Q2 q2 = new Q2();

	@Test
	void teste() {
		assertEquals( "triangulo equilatero", q2.Start( 420, 420, 420 ));
	}
    @Test
	void teste2() {
		assertEquals( "triangulo isosceles", q2.Start( 420, 420, 69 ));
	}
    @Test
	void teste3() {
		assertEquals( "triangulo isosceles", q2.Start( 420, 69, 420 ));
	}
    @Test
	void teste4() {
		assertEquals( "triangulo isosceles", q2.Start( 69, 420, 420 ));
	}

    @Test
	void teste5() {
		assertEquals( "triangulo escaleno", q2.Start( 1001, 1002, 1003 ));
	}
    @Test
	void teste6() {
		assertEquals( "nao formam um triangulo", q2.Start( 1109, 1, 2 ));
	}
    @Test
	void teste7() {
		assertEquals( "nao formam um triangulo", q2.Start( 1, 1109, 2 ));
	}
    @Test
	void teste8() {
		assertEquals( "nao formam um triangulo", q2.Start( 1, 2, 1109));
	}
}
