/****************************
*@author: Robbin Woods 15201
*@version: 1.0
*2/10/2016
*texto.java
*****************************/

import java.io.*;

public class Texto{

	private String operaciones;
	/**
	 * Este metodo se encarga de leer un archivo de texto y almacenar en un string su contenido
	 * @param String, Recibe como parametro la direccion donde se encuentra el .txt con la operaciones a realizar
	 * @return String retorna el string que se encontraba en el .txt
	 */
	public String leerArchivo(String direccionx) {
		
		try {
			FileInputStream dirtxt;
			dirtxt = new FileInputStream(direccionx);
			DataInputStream lineas = new DataInputStream(dirtxt);
			BufferedReader memoriabuf = new BufferedReader(new InputStreamReader(lineas));
			operaciones=memoriabuf.readLine();
			lineas.close();
		}catch(Exception e){
			System.err.println("Error Fatal");
			
		}

		return operaciones;
	}

	public Texto(){

	}
}