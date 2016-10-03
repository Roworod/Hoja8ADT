/****************************
*@author: Robbin Woods 15201
*@version: 1.0
*2/10/2016
*Principal.java
*****************************/

import java.util.Scanner;
import java.util.Vector;

public class Principal{
	public static void main(String args[]){
		String direccion;
		Scanner usuario = new Scanner(System.in);


		try
		{
			System.out.println("Ingrese el nombre del archivo que contiene la operacion (incluir el .txt) ");
			direccion= usuario.next();

			Texto miTexto=new Texto();
			String lista=miTexto.leerArchivo(direccion);
			int intento=0;
			Paciente tempPaciente=new Paciente();
			boolean pacienteCompletado=false;
			Vector tempVector=new Vector();

			for(int i=0;i<lista.length();i++){
				String temp="";
				String caracter=lista.substring(i,i+1);
				if(caracter.equals(",")==false){
					temp+=caracter;
				}
				else if(intento==0){
					tempPaciente.setNombre(temp);
					intento=1;
				}
				else if(intento==1){
					tempPaciente.setSintoma(temp);
					intento=2;
				}
				else if(intento==2){
					tempPaciente.setCodigo(temp);
					pacienteCompletado=true;
					intento=0;
				}
				if(pacienteCompletado==true){
					tempVector.add(tempPaciente);
					pacienteCompletado=false;
				}
			}
			System.out.println(tempVector);
			

		}
		catch(Exception e)
		{
			System.out.println("no se encontro o no existe el archivo solicitado");
		}

	}
}