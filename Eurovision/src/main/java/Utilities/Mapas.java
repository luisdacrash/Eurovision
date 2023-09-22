/**
 * 
 */
package Utilities;

import java.util.Map;
import java.util.TreeMap;
/**
 * 
 */
public class Mapas 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Map<String,Coche> mapaDeCoches = new TreeMap<String,Coche>();
		Coche nuevoUno = new Coche("7711LPQ","Seat");
		Coche nuevoDos = new Coche("5566SQL","Megane");
		mapaDeCoches.put(nuevoUno.getMatricula(), nuevoUno);
		mapaDeCoches.put(nuevoDos.getMatricula(), nuevoDos);
		System.out.println(mapaDeCoches);
		
	}

}
