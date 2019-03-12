package Ej4;

public class Cuadrado {
	double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double Superficie() {
		return lado*lado;
	}
	@Override
	public String toString() {
		return "El cuadrado de lado"+getLado()+" su area es igual a "+Superficie();
	}
	
}
