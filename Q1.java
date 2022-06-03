package junit.example.junit;

public class Q1 {
    public double Start(int[] preco) {
	    double pDesc = 0.1;
        double totalPagar = 0.0;
        double frete = 5.0;
        double valorDesconto;
		int i = 0;
	    while(preco[i] != -1) {
	        totalPagar = totalPagar + preco[i];
			i++;
	    }

	    if ( (totalPagar > 15.0) && (totalPagar <= 70.0) )
	        pDesc = pDesc + 0.1;
	    valorDesconto = totalPagar * pDesc;
	    if (totalPagar > 50.0)
	    	frete = 0.0;
	    totalPagar = totalPagar - valorDesconto + frete;
	    return (totalPagar);
	}
}
