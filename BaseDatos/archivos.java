package BaseDatos;

import java.util.ArrayList;

public class archivos {
	public static void main(String[] args) {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		Persona persona1 = new Persona();
		persona1.setNombre("juan");
		persona1.setCedula("111");
		persona1.setTelefono("222");
		listaPersonas.add(persona1);

		Persona persona2 = new Persona();
		persona2.setNombre("jose");
		persona2.setCedula("664");
		persona2.setTelefono("1153");
		listaPersonas.add(persona2);

		Persona persona3 = new Persona();
		persona3.setNombre("miguel");
		persona3.setCedula("5554");
		persona3.setTelefono("66489");
		listaPersonas.add(persona3);

		Escritor.crear(listaPersonas);

		Persona persona4 = new Persona();
		persona4.setNombre("antonia");
		persona4.setCedula("888");
		persona4.setTelefono("9898");
		ArrayList nuevaLista = new ArrayList<>();
		nuevaLista.add(persona4);

		Escritor.agregarArchivo(nuevaLista);

		ArrayList<Persona> listaLeida = new ArrayList<Persona>();
		listaLeida = Escritor.leer();
		for (Persona persona : listaLeida) {
			listaPersonas.add(persona);
			System.out.println(persona.getNombre() + " " + persona.getCedula() + " " + persona.getTelefono());
		}
		for (Persona p : listaPersonas) {
			System.out.println(p.getNombre() + " " + p.getCedula() + " " + p.getTelefono());
		}

	}
}