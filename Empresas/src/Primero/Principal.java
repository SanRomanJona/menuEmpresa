package Primero;

import javax.swing.JOptionPane;

public class Principal {

	private static int comparaciones;
	private static int tiempo;

	public static void main(String[] args) {
		
		String Aux;
		int [] NumEmp = new int [5];
		String [] Nombre = new String [5];
		String [] ApePat = new String [5];
		String [] Depto = new String [5];
		double [] Sueldo = new double [5];
		int Op,ap,i,elementos;
		boolean Existe=false;
		String dto="";
		String Temp;
		ap=-1; 
		
		do
		{
			Op=Integer.parseInt(JOptionPane.showInputDialog("Menú\n\n1.- Registro.\n2.- Consulta General.\n3.- Búsqueda por Número de Empleado.\n" + "4.- Búsqueda por Departamento\n5.- Modificar Sueldo\n6.- Eliminar\n7.- Ordenar Por Apellido\n\n8.- Salida"));
			
			int Numero;
			
			switch(Op)
			{
			case 1: if (ap!=4) //Registro De Empleado
			{
				ap++;
			    NumEmp[ap]=Integer.parseInt(JOptionPane.showInputDialog("Inserte Número de Empleado"));	
				Nombre[ap]=JOptionPane.showInputDialog("Inserte Nombre");
				ApePat[ap]=JOptionPane.showInputDialog("Inserte Apellido Paterno");
				int x=Integer.parseInt(JOptionPane.showInputDialog("Inserte Departamento:\n1.-Calidad\n2.-Ingenieria\n3.-RecursosHumanos\n4.-Producción"));
				if(x==1)
					Depto[ap]="Calidad";
				if(x==2)
					Depto[ap]="Ingenieria";
				if(x==3)
					Depto[ap]="Recursos Humanos";
				if(x==4)
					Depto[ap]="Produccion";
				Sueldo[ap]=Double.parseDouble(JOptionPane.showInputDialog("Inserte Sueldo"));
			
				 
			} 
			else
				JOptionPane.showMessageDialog(null, "No Hay Espacio");
			break;
			
			case 2: if(ap!=-1) //Registro General
				{
				Aux="";
				for(i=0;i<=ap;i++)
				{
					Aux=Aux+"\nNúmero Empleado:"+NumEmp[i]+"\nNombre: "+Nombre[i]+"\nApellido Paterno: "+ApePat[i]+"\nDepartamento: "+Depto[i]+"\nSueldo: "+Sueldo[i]+"\n\n";
				}
				JOptionPane.showMessageDialog(null, "Consulta General\n"+Aux);
				}
				else
					JOptionPane.showMessageDialog(null, "No Hay Registro");
			break;
				
			case 3: if(ap!=-1)//Búsqueda por Número de Empleado
			         {		
				        Existe=false;
				        Aux=JOptionPane.showInputDialog("Número de Empleado que Desea buscar");
				        Numero = Integer.parseInt(Aux);
				        for(i=0;i<=ap;i++)
				         {
					      if(Numero == NumEmp[i])
					        {
						     Existe = true;
						     JOptionPane.showMessageDialog(null,"\n Empleado es: \n numero de empleado "+NumEmp[i]+"\n Apellido: "+ApePat[ap]+"\n Nombre: "+Nombre[i]+"\n Departamento: "+Depto[i]+"\n Suledo: "+Sueldo[i]);
						 
					       }					
				         }
					       if(Existe == false)   
					          JOptionPane.showMessageDialog(null, "El Número "+Numero+" no existe");
				
					}
			             
			else
					JOptionPane.showMessageDialog(null, "No Hay Datos");
				break;
			
			case 4: if(ap!=-1)//Búsqueda por Departamento
			          {
				        Existe=false;
				        int x=Integer.parseInt(JOptionPane.showInputDialog("Selecciona  Departamento:\n1.-Calidad\n2.-Ingenieria\n3.-RecursosHumanos\n4.-Producción"));
				         if(x==1)
					        dto="Calidad";
				         if(x==2)
						        dto="Ingenieria";
				         if(x==3)
						        dto="Recursos Humanos";
				         if(x==4)
						        dto="Produccion";
				         
				         for(i=0;i<=ap;i++)
				         {
					      if(dto.equals(Depto[i]))
					        {
						     Existe = true;
						     JOptionPane.showMessageDialog(null,"\n Empleado es: \n numero de empleado "+NumEmp[i]+ "\n" + "Apellido: "+ApePat[ap]+"\n Nombre: "+Nombre[i]+"\n"
						     				+ " Departamento: "+Depto[i]+"\n Suledo: "+Sueldo[i]);
						 
					       }					
				         }
					       if(Existe == false)   
					          JOptionPane.showMessageDialog(null, "No hay empleados en ese departamento");
					}
			
			     else
				     JOptionPane.showMessageDialog(null, "No Hay Registro");
				break;
			
			case 5: if(ap!=-1)//Modificar Sueldo
			{
				 
			}
			else
				JOptionPane.showMessageDialog(null, "No Hay Registro " );			
			break;
			
			case 6: if(ap!=-1) //Eliminar Empleado
			{
				ap--;
			}
			else 
				JOptionPane.showMessageDialog(null, "No Hay Registro");
			break;
			
			case 7: if (ap!=-1)
			{
				
			}
			else
				JOptionPane.showMessageDialog(null,"No Hay Registro " );
					break;
				}//Menú
			
			}while (Op!=8);
	}

}
	


