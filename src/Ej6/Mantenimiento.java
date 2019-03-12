package Ej6;

public class Mantenimiento extends Administrativo{
	String Aula;
	int HExtra;
	public Mantenimiento(String nombre, String cedula, String dependecia, double sal, String aula, int hExtra) {
		super(nombre, cedula, dependecia, sal);
		Aula = aula;
		HExtra = hExtra;
	}
	public String getAula() {
		return Aula;
	}
	public void setAula(String aula) {
		Aula = aula;
	}
	public int getHExtra() {
		return HExtra;
	}
	public void setHExtra(int hExtra) {
		HExtra = hExtra;
	}
	
	public double calcularSalario() {
	
			return getSal()+HExtra*40;
		
	}
	@Override
	public String toString() {
		return "Mantenimiento [Aula=" + Aula + ", HExtra=" + HExtra + "]"+"Salario "+calcularSalario();
	}
	
}
