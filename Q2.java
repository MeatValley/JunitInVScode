package junit.example.junit;

public class Q2 {
	public static String Start(int A, int B, int C) {
	    if(A == B && A == C)
	    	return "triangulo equilatero";
	    if(A >= (B + C) ||
	       B >= (A + C) ||
	       C >= (B + A))
	    	return "nao formam um triangulo";
	    if( A == B ||
	    	A == C ||
	    	B == C)
	    	return "triangulo isosceles";
	    else return "triangulo escaleno";
	}
}