package Ej6;

public class RecursosHumanos extends Administrativo {
	String Tipo, tip1="Tesoreria",tip2="Secretaria";

	public RecursosHumanos(String nombre, String cedula, String dependecia, double sal, String tipo) {
		super(nombre, cedula, dependecia, sal);
		Tipo = tipo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public double calcularSalario() {
		if(Tipo==tip1) {
			return sal+1000;
		}else {
			if(Tipo==tip2) {
				return  sal+700;
			}else {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return "RecursosHumanos [Tipo=" + Tipo + "]"+"salario "+calcularSalario();
	}

}
