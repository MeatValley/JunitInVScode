package junit.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Q1Test {
    Q1 q1 = new Q1();
	@Test

	void teste() {
		int[] vet = new int[2];
		vet[0] = 3;
		vet[1]=-1;
		assertEquals(7.7, q1.Start( vet ));
	}
    @Test

    void teste2() {
		int[] vet = new int[3];
		vet[0] = 2;
        vet[1] = 2;
		vet[2]=-1;
		assertEquals(8.60, q1.Start( vet ));
	}
    @Test

    void teste3() {
		int[] vet = new int[2];
		vet[0] = 20;
        vet[1] = -1;
		assertEquals(21, q1.Start( vet ));
	}
    @Test

    void teste4() {
		int[] vet = new int[2];
		vet[0] = 100;
        vet[1] = -1;
		assertEquals(90, q1.Start( vet ));
	}
    
}
