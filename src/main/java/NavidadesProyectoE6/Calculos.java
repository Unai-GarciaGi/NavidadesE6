package NavidadesProyectoE6;

public class Calculos {
	
	private int a;
	private int b;
	private int c;
	public int suma(int x, int y) {
		return x+y;
	}
	
	public int resta(int x, int y) {
		return x-y;
	}
	
	public double division(int x, int y) {
		if(y==0) {
			return -1;
		}
		else {
			return x/y;
		}
	}
	
}
