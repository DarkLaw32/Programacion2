package Ej6;

public class ProfesorTiempoCompleto extends Docente {
	String Investigacion,grad1="Pregrado",grad2="Maestria",grad3="Doctorado";

	
	



	public ProfesorTiempoCompleto(String nombre, String cedula, String dependecia, double calAsig,
			String investigacion) {
		super(nombre, cedula, dependecia, calAsig);
		Investigacion = investigacion;
	}
	
	

	public String getInvestigacion() {
		return Investigacion;
	}



	public void setInvestigacion(String investigacion) {
		Investigacion = investigacion;
	}



	public double calcularSalario() {
		if(Investigacion==grad1) {
			if(CalAsig>4.5) {
				return 10000+2000;
			}else {
				return 10000;
			}
		}else {
			if(Investigacion==grad2) {
				if(CalAsig>4.5) {
					return 18000+2000;
				}else {
					return 18000;
				}
			}else {
				if(Investigacion==grad3) {
					if(CalAsig>4.5) {
						return 25000+2000;
					}else {
						return 25000;
					}
				}else {
					return 0;
				}
					
			}
		}
	}

	@Override
	public String toString() {
		return "ProfesorTiempoCompleto [Investigacion=" + Investigacion + "]"+"Salario "+calcularSalario();
	}
	
}
