package Ej6;

public class Administrativo extends Empleado {
	double sal;

	public Administrativo(String nombre, String cedula, String dependecia, double sal) {
		super(nombre, cedula, dependecia);
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Administrativo [sal=" + sal + "]";
	}
	
	
}
