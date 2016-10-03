/****************************
*@author: Robbin Woods 15201
*@version: 1.0
*1/10/2016
*Paciente.java
*****************************/

public class Paciente{
	private String nombre;
	private String sintoma;
	private String codigo;

	public Paciente(){
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setSintoma(String sintoma){
		this.sintoma=sintoma;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public String getNombre(){
		return nombre;
	}

	public String getSintoma(){
		return sintoma;
	}

	public String getCodigo(){
		return codigo;
	}

	//comparar el nivel de emergencia del paciente con otro
	//@pre: paciente p existe
	//@return: 1 si es mas urgente atender a este paciente
	//		   0 si la urgencia de ambos pacientes es igual
	//		  -1 si es mas urgente atender al otro paciente
	public int compareTo(Paciente p){
		if(p.getCodigo().compareTo(codigo)<0)
			return 1;
		else if(p.getCodigo().compareTo(codigo)==0)
			return 0;
		else
			return -1;
	}
}