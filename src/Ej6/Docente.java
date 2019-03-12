package Ej6;

public class Docente extends Empleado {
	double CalAsig;

	public Docente(String nombre, String cedula, String dependecia, double calAsig) {
		super(nombre, cedula, dependecia);
		CalAsig = calAsig;
	}

	
	public double getCalAsig() {
		return CalAsig;
	}


	public void setCalAsig(double calAsig) {
		CalAsig = calAsig;
	}


	@Override
	public String toString() {
		return "Docente [CalAsig=" + CalAsig + "]";
	}


	
}
