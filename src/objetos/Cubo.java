package objetos;

public class Cubo extends Cuadrado{
	
	float volumen = 0;
	
	public Cubo(float side) {
		super(side);
		volumen = calcularVolumen();
	}
	
	@Override
	public float calcularPerimetro() {
		return lado * 6;
	}
	
	public float calcularVolumen() {
		return super.calcularArea() * lado;
	}
}
