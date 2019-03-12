package Ej6;

public class Empleado {
	String Nombre,Cedula,Dependecia;

	public Empleado(String nombre, String cedula, String dependecia) {
		super();
		Nombre = nombre;
		Cedula = cedula;
		Dependecia = dependecia;
	}
	
	

	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getCedula() {
		return Cedula;
	}



	public void setCedula(String cedula) {
		Cedula = cedula;
	}



	public String getDependecia() {
		return Dependecia;
	}



	public void setDependecia(String dependecia) {
		Dependecia = dependecia;
	}



	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", Cedula=" + Cedula + ", Dependecia=" + Dependecia + "]";
	}
	
}
