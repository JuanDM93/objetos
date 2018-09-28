package objetos;

public class Main {

	public static void main(String[] args) {
		
		float side = 8;
		
		Cuadrado cuadro = new Cuadrado(side);
		
		Cubo cubo= new Cubo(side);
		
		System.out.println(cubo.calcularVolumen());
	}

}
