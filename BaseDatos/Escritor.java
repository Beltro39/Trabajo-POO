package BaseDatos;
import java.util.*;
import java.io.*;

public class Escritor {
	public static void crear(ArrayList<Persona> lista) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("D:\\Users\\JUAN JOSE\\Documents\\GitHub\\Trabajo-POO\\Trabajo Poo\\src\\trabajo\\poo\\test.txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Persona persona : lista) {
				bfwriter.write(persona.getNombre() + ","+ persona.getCedula()+","+persona.getTelefono()+",");
			}
			bfwriter.close();
			System.out.println("Archivo creado");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(flwriter != null) {
				try {
					flwriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static ArrayList leer() {
		// crea el flujo para leer desde el archivo
		File file = new File("D:\\Users\\JUAN JOSE\\Documents\\GitHub\\Trabajo-POO\\Trabajo Poo\\src\\trabajo\\poo\\test.txt");
		ArrayList listaPersonas= new ArrayList<>();	
		Scanner scanner;
		try {
			//se pasa el flujo al objeto scanner
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				// el objeto scanner lee linea a linea desde el archivo
				String linea = scanner.nextLine();
				Scanner delimitar = new Scanner(linea);
				//se usa una expresión regular
				//que valida que antes o despues de una coma (,) exista cualquier cosa
				//parte la cadena recibida cada vez que encuentre una coma				
				delimitar.useDelimiter("\\s*,\\s*");
				Persona p= new Persona();
				p.setNombre(delimitar.next());
				p.setCedula(delimitar.next());
				p.setTelefono(delimitar.next());
				listaPersonas.add(p);
			}
			//se cierra el ojeto scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listaPersonas;
	}
	public static void agregarArchivo(ArrayList<Persona> lista) {
		FileWriter flwriter = null;
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("D:\\Users\\JUAN JOSE\\Documents\\GitHub\\Trabajo-POO\\Trabajo Poo\\src\\trabajo\\poo\\test.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Persona persona : lista) {
				//escribe los datos en el archivo
				bfwriter.write(persona.getNombre() + "," + persona.getCedula() + "," + persona.getTelefono() + "," + "\n");
			}
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}


