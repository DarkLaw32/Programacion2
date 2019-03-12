package Ej6;

public class ProfesorHoraCatedra extends Docente {
	int horas;
	
	public ProfesorHoraCatedra(String nombre, String cedula, String dependecia, double calAsig, int horas) {
		super(nombre, cedula, dependecia, calAsig);
		this.horas = horas;
	}
	
	

	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public double calcularSalario(){
		return horas*50.0;
	}

	@Override
	public String toString() {
		return "ProfesorHoraCatedra [horas=" + horas + "]"+"Salario "+calcularSalario();
	}
	
	
}
