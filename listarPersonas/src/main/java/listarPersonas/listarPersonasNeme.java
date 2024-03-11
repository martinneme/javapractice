package listarPersonas;

import java.util.ArrayList;
import java.util.List;

public class listarPersonasNeme {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Martin","Neme");
		Persona persona2 = new Persona ("Juan","Cito");
		Persona persona3 = new Persona ("Pedro","Celiz"); 
		Persona persona4 = new Persona ("Maria","Angeles"); 
		Persona persona5 = new Persona ("Carmela","Descalza"); 
		
		List<Persona> personas = new ArrayList<>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		personas.add(persona5);
		
		try {
				List<Persona> personasOrderByName = OrdenarPersonas.ordernarPorNombre(personas);
		List<Persona> personasOrderByLastName = OrdenarPersonas.ordernarPorApellido(personas,"ASC");
		List<Persona> personasOrderByLastNameReversed = OrdenarPersonas.ordernarPorApellido(personas,"DESC");
		
		
		System.out.println("Personas ordenadas por nombre \n");
		for(Persona persona : personasOrderByName) {
			System.out.println("Nombre: "+persona.getNombre()+" "+"Apellido: "+ persona.getApellido());
		
		}
		System.out.println("Personas ordenadas por Apellido \n");
		for(Persona persona : personasOrderByLastName) {
			System.out.println("Nombre: "+persona.getNombre()+" "+"Apellido: "+ persona.getApellido());
		
		}
		System.out.println("Personas ordenadas por Apellido inverso \n");
		for(Persona persona : personasOrderByLastNameReversed) {
			System.out.println("Nombre: "+persona.getNombre()+" "+"Apellido: "+ persona.getApellido());
		
		}
		
		}catch(Exception e) {
			System.out.println("Error al ordenar:"+ e);
		}
	
		
	
		

	}

}
