package Ej6;
import javax.swing.*;
public class IntEmp {

	public static void main(String[] args) {
		String Nombre,Cedula;
		int a=0,b=0,c=0;
		/*
		Empleado unEmpleado=new Empleado("Jorge","6900979","Ingenieria");
		Docente unDocente=new Docente("Jorge","6900979","Ingenieria",4.8);
		ProfesorTiempoCompleto unCompleto=new ProfesorTiempoCompleto("Jorge","6900979","Ingenieria",4.0,"Pregrado");
		ProfesorHoraCatedra unCatedra=new ProfesorHoraCatedra("Jorge","6900979","Ingenieria",4.0,50);
		Administrativo unAdm= new Administrativo("Luis", "123456", "Economia", 5000); 
		RecursosHumanos unRecur= new RecursosHumanos("Luis", "123456", "Economia", 5000, "Secretaria");
		Mantenimiento unMante=new Mantenimiento("Luis", "123456", "Economia", 5000, "Aula 103",15);
		System.out.println(unEmpleado);
		System.out.println(unDocente);
		System.out.println(unCompleto);
		System.out.println(unCatedra);
		System.out.println(unAdm);
		System.out.println(unRecur);
		System.out.println(unMante);
		*/
		
		Nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		Cedula=JOptionPane.showInputDialog("Ingrese la cedula del empleado");
		while(a!=4) {
		a=Integer.parseInt(JOptionPane.showInputDialog(Menu()));
		 switch(a){
	       case 1://Economia
	    	   while(b!=3) {
	    		   b=Integer.parseInt(JOptionPane.showInputDialog(Menu1()));
	    		   switch(b) {
	    		   case 1://Docente
	    			   	
	    		        break;
	    		   case 2://Administrativo
	    		       
	    		        break;
	    		   case 3:
	 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	 	    	      break;
	    		        
	    		   }
	    	   }
	        break;
	       case 2://Ingenieria
	    
	    	   
	        break;
	       case 3://Derecho
		      
		        break;
	       case 4:
	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	    	      break;
	       }
			 
		}
		
		
		
	}
	private static String Menu() {
		   return "**Opciones**\n1.Economia\n2.Ingenieria\n3.Derecho\n4.Salir";
		  }
	private static String Menu1() {
		   return "**Opciones**\n1.Docente\n2.Administrativo\n3.Salir";
		  }
}
