package Ej6;
import javax.swing.*;
public class IntEmp {

	public static void main(String[] args) {
		String Nombre,Cedula,Dependencia,Investigacion,Aula;
		double CalAsig;
		int a=0,b=0,c=0,d=0,e=0,f=0,horas,HExtra;
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
	    	   Dependencia="Economia";
	    	   while(b!=3) {
	    		   b=Integer.parseInt(JOptionPane.showInputDialog(Menu1()));
	    		   switch(b) {
	    		   case 1://Docente
	    			   while(c!=3) {
	    				   CalAsig=Double.parseDouble(JOptionPane.showInputDialog("Calificacion Asignada"));
	    				   c=Integer.parseInt(JOptionPane.showInputDialog(Menu2()));
	    				   switch(c) {
	    				   case 1://TiempoCompleto
	    					   while(d!=4) {
	    						   d=Integer.parseInt(JOptionPane.showInputDialog(Menu3()));
	    						   switch(d) {
	    						   case 1://Pregrado
	    							   ProfesorTiempoCompleto unC1=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Pregrado");
	    							   System.out.println(unC1);
	    			    		        break;
	    						   case 2://Maestria
	    							   ProfesorTiempoCompleto unC2=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Maestria");
	    							   System.out.println(unC2);
	    			    		        break;
	    						   case 3://Doctorado
	    							   ProfesorTiempoCompleto unC3=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Doctorado");
	    							   System.out.println(unC3);
	    			    		        break;
	    						   case 4:
	    				 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	    				 	    	      break;
	    						   }
	    					   }
	    					  
	    				        break;
	    				   case 2://TiempoHorario
	    					   horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo"));
	    					   ProfesorHoraCatedra unCatedra=new ProfesorHoraCatedra(Nombre,Cedula,Dependencia,CalAsig,horas);
	    					   System.out.println(unCatedra);
	    				        break;
	    				   }
	    			   } 
	    		        break;
	    		   case 2://Administrativo
	    			   while(e!=3) {
	    				   e=Integer.parseInt(JOptionPane.showInputDialog(Menu4()));
	    				   switch(e) {
	    				   case 1://Recursos Humanos
	    					   while(f!=3) {
	    						   f=Integer.parseInt(JOptionPane.showInputDialog(Menu5()));
	    						   switch(f) {
	    						   case 1://Tesoreria
	    							   RecursosHumanos unR1= new RecursosHumanos(Nombre, Cedula, Dependencia, 5000, "Tesoreria");
	    							   break;
	    						   case 2://Secretaria
	    							   RecursosHumanos unR2= new RecursosHumanos(Nombre, Cedula, Dependencia, 5000, "Secretaria");
	    							   break;
	    						   case 3:
	 	    		 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	 	    		 	    	      break;
	 	    		    		        
	    						   }
	    					   }
	    			    	   
	    			        break;
	    				   case 2://Mantenimiento
	    					   Aula=JOptionPane.showInputDialog("Ingrese el aula asignada");
	    					   HExtra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo"));
	    					   Mantenimiento unMante=new Mantenimiento(Nombre, Cedula, Dependencia, 5000, Aula,HExtra);
	    					   System.out.println(unMante);
	    			    	   
		    			        break;
	    				   case 3:
	    		 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	    		 	    	      break;
	    		    		        
	    				   }
	    			   }
	    		       
	    		        break;
	    		   case 3:
	 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	 	    	      break;      
	    		   }
	    	   }
	        break;
	       case 2://Ingenieria
	    	   Dependencia="Ingenieria";
	    	   while(b!=3) {

	    		   b=Integer.parseInt(JOptionPane.showInputDialog(Menu1()));
	    		   switch(b) {
	    		   case 1://Docente
	    			   while(c!=3) {
	    				   CalAsig=Double.parseDouble(JOptionPane.showInputDialog("Calificacion Asignada"));
	    				   c=Integer.parseInt(JOptionPane.showInputDialog(Menu2()));
	    				   switch(c) {
	    				   case 1://TiempoCompleto
	    					   while(d!=4) {
	    						   d=Integer.parseInt(JOptionPane.showInputDialog(Menu3()));
	    						   switch(d) {
	    						   case 1://Pregrado
	    							   ProfesorTiempoCompleto unC1=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Pregrado");
	    							   System.out.println(unC1);
	    			    		        break;
	    						   case 2://Maestria
	    							   ProfesorTiempoCompleto unC2=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Maestria");
	    							   System.out.println(unC2);
	    			    		        break;
	    						   case 3://Doctorado
	    							   ProfesorTiempoCompleto unC3=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Doctorado");
	    							   System.out.println(unC3);
	    			    		        break;
	    						   case 4:
	    				 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	    				 	    	      break;
	    						   }
	    					   }
	    					  
	    				        break;
	    				   case 2://TiempoHorario
	    					   horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo"));
	    					   ProfesorHoraCatedra unCatedra=new ProfesorHoraCatedra(Nombre,Cedula,Dependencia,CalAsig,horas);
	    					   System.out.println(unCatedra);
	    				        break;
	    				   }
	    			   } 
	    		        break;
	    		   case 2://Administrativo
	    			   while(e!=3) {
	    				   e=Integer.parseInt(JOptionPane.showInputDialog(Menu4()));
	    				   switch(e) {
	    				   case 1://Recursos Humanos
	    					   while(f!=3) {
	    						   f=Integer.parseInt(JOptionPane.showInputDialog(Menu5()));
	    						   switch(f) {
	    						   case 1://Tesoreria
	    							   RecursosHumanos unR1= new RecursosHumanos(Nombre, Cedula, Dependencia, 5000, "Tesoreria");
	    							   System.out.println(unR1);
	    							   break;
	    						   case 2://Secretaria
	    							   RecursosHumanos unR2= new RecursosHumanos(Nombre, Cedula, Dependencia, 5000, "Secretaria");
	    							   System.out.println(unR2);
	    							   break;
	    						   case 3:
	 	    		 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	 	    		 	    	      break;
	 	    		    		        
	    						   }
	    					   }
	    			    	   
	    			        break;
	    				   case 2://Mantenimiento
	    					   Aula=JOptionPane.showInputDialog("Ingrese el aula asignada");
	    					   HExtra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo"));
	    					   Mantenimiento unMante=new Mantenimiento(Nombre, Cedula, Dependencia, 5000, Aula,HExtra);
	    					   System.out.println(unMante);
	    			    	   
		    			        break;
	    				   case 3:
	    		 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	    		 	    	      break;
	    		    		        
	    				   }
	    			   }
	    		       
	    		        break;
	    		   case 3:
	 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
	 	    	      break;      
	    		   }
	    	   
	    	   }
	    	   
	        break;
	       case 3://Derecho
	    	   Dependencia="Derecho";

    		   b=Integer.parseInt(JOptionPane.showInputDialog(Menu1()));
    		   switch(b) {
    		   case 1://Docente
    			   while(c!=3) {
    				   CalAsig=Double.parseDouble(JOptionPane.showInputDialog("Calificacion Asignada"));
    				   c=Integer.parseInt(JOptionPane.showInputDialog(Menu2()));
    				   switch(c) {
    				   case 1://TiempoCompleto
    					   while(d!=4) {
    						   d=Integer.parseInt(JOptionPane.showInputDialog(Menu3()));
    						   switch(d) {
    						   case 1://Pregrado
    							   ProfesorTiempoCompleto unC1=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Pregrado");
    							   System.out.println(unC1);
    			    		        break;
    						   case 2://Maestria
    							   ProfesorTiempoCompleto unC2=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Maestria");
    							   System.out.println(unC2);
    			    		        break;
    						   case 3://Doctorado
    							   ProfesorTiempoCompleto unC3=new ProfesorTiempoCompleto(Nombre,Cedula,Dependencia,CalAsig,"Doctorado");
    							   System.out.println(unC3);
    			    		        break;
    						   case 4:
    				 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
    				 	    	      break;
    						   }
    					   }
    					  
    				        break;
    				   case 2://TiempoHorario
    					   horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo"));
    					   ProfesorHoraCatedra unCatedra=new ProfesorHoraCatedra(Nombre,Cedula,Dependencia,CalAsig,horas);
    					   System.out.println(unCatedra);
    				        break;
    				   }
    			   } 
    		        break;
    		   case 2://Administrativo
    			   while(e!=3) {
    				   e=Integer.parseInt(JOptionPane.showInputDialog(Menu4()));
    				   switch(e) {
    				   case 1://Recursos Humanos
    					   while(f!=3) {
    						   f=Integer.parseInt(JOptionPane.showInputDialog(Menu5()));
    						   switch(f) {
    						   case 1://Tesoreria
    							   RecursosHumanos unR1= new RecursosHumanos(Nombre, Cedula, Dependencia, 5000, "Tesoreria");
    							   break;
    						   case 2://Secretaria
    							   RecursosHumanos unR2= new RecursosHumanos(Nombre, Cedula, Dependencia, 5000, "Secretaria");
    							   break;
    						   case 3:
 	    		 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
 	    		 	    	      break;
 	    		    		        
    						   }
    					   }
    			    	   
    			        break;
    				   case 2://Mantenimiento
    					   Aula=JOptionPane.showInputDialog("Ingrese el aula asignada");
    					   HExtra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo"));
    					   Mantenimiento unMante=new Mantenimiento(Nombre, Cedula, Dependencia, 5000, Aula,HExtra);
    					   System.out.println(unMante);
    			    	   
	    			        break;
    				   case 3:
    		 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
    		 	    	      break;
    		    		        
    				   }
    			   }
    		       
    		        break;
    		   case 3:
 	    	      JOptionPane.showMessageDialog(null,"Fin del Programa");
 	    	      break;      
    		   }
    	   
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
	private static String Menu2() {
		   return "**Opciones**\n1.Profesor Tiempo Completo\n2.Profesor Horario\n3.Salir";
		  }
	private static String Menu3() {
		   return "**Opciones**\n1.Pregrado\n2.Maestria\n3.Doctorado\n4.Salir";
		  }
	private static String Menu4() {
		   return "**Opciones**\n1.Recursos Humanos\n2.Mantenimiento\n3.Salir";
		  }
	private static String Menu5() {
		   return "**Opciones**\n1.Tesoreria\n2.Secretaria\n3.Salir";
		  }
}
