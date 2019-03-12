package Ej4;

public class Paralelepipedo extends Cuadrado {
	double altura;

	public Paralelepipedo(double lado, double altura) {
		super(lado);
		this.altura = altura;
	}
	
	public double Superficie() {
		return (lado*altura)+(2*lado*lado);
	}

	@Override
	public String toString() {
		return "El area de paralelepipedo de base "+lado+" y altura "+altura+" es "+Superficie();
	}
	
	
}
