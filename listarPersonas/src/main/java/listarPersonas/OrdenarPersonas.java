package listarPersonas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPersonas {

	public static List<Persona> ordernarPorNombre (List<Persona> personas) {
		List<Persona> copiaPersonas = new ArrayList <>(personas);
		Collections.sort(copiaPersonas,(persona1,persona2)-> persona1.getNombre().compareTo(persona2.getNombre()));
		return copiaPersonas;
	}
	
	public static List<Persona> ordernarPorApellido (List<Persona> personas,String criterio) {
		List<Persona> copiaPersonas = new ArrayList <>(personas);
		Collections.sort(copiaPersonas,(persona1,persona2)-> persona1.getApellido().compareTo(persona2.getApellido()));
		
		switch(criterio) {
		case "ASC":
			break;
		case "DESC":
			 Collections.reverse(copiaPersonas);
			 break;
		default:
			throw new IllegalArgumentException("El criterio debe ser ASC o DESC");
		}
		return copiaPersonas;
		
	}

}
