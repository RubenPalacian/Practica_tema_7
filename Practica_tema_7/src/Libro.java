
public class Libro {

	//atributos
		
	
	private int Numero_de_ejemplares1=2;
	
	private int Numero_de_ejemplares2=1;
	
	private String libro1="Autor: Miguel de Cervantes, Titulo: El Quijote de la Mancha";
	
	private String libro2="Autor: Arturo Perez Reverte, Titulo: El Capital Alatriste";
	
	public Libro() {//constructor por defecto		
		
	}

	public Libro( String lib2, int num_ejem1, int num_ejem2, String lib1) {//constructor con parametros		
		this.libro1=lib1;
		this.libro2=lib2;
		Numero_de_ejemplares1=num_ejem1;
		Numero_de_ejemplares2=num_ejem2;		
	}
	public String dameLibro1() {//metodo getter
		return this.libro1;
	}
	public String dameLibro2() {//metodo getter
		return this.libro2;
	}
	public int ejemplares1() {
		return Numero_de_ejemplares1;
	}
	public int ejemplares2() {
		return Numero_de_ejemplares2;
	}
	public void prestamo() {//metodo setter
		
		
		if (Numero_de_ejemplares1>0) {
			Numero_de_ejemplares1--;
			System.out.println(" Ahora queda/n " + Numero_de_ejemplares1 + " ejemplares de este libro");
		}
		
		else if
		 (Numero_de_ejemplares1<=0) 
			System.out.println("No se pueden prestar mas ejemplares de este libro");
		}
		
	
	public void prestamo2() {//metodo setter
		if (Numero_de_ejemplares2>0) {
			Numero_de_ejemplares2--;
			System.out.println(" Ahora queda/n " + Numero_de_ejemplares2 + " ejemplares de este libro");
		}
		
		else if
		 (Numero_de_ejemplares2<=0) 
			System.out.println("No se pueden prestar mas ejemplares de este libro");
		}
	
	public void devolucion() {//metodo setter
		
		if (Numero_de_ejemplares1>=2) {
			System.out.println("No se puden deveolver mas libros");
			
		}
		
		else if
		 (Numero_de_ejemplares1>=0) {
			Numero_de_ejemplares1++;
			System.out.println(" Ahora queda/n " + Numero_de_ejemplares1 + " ejemplares de este libro");
			
		}
			
		}
		
public void devolucion2() {//metodo setter	
	if (Numero_de_ejemplares2>=1) {
		System.out.println("No se puden deveolver mas libros");
		
	}
	
	else if
	 (Numero_de_ejemplares2>=0) {
		Numero_de_ejemplares2++;
		System.out.println(" Ahora queda/n " + Numero_de_ejemplares2 + " ejemplares de este libro");
		
	}
		
	}
	@Override
    public String toString() {
        return "Autor: Miguel de Cervantes, Titulo: El Quijote de la Mancha, número de ejemplares: " + this.Numero_de_ejemplares1;       
    }
	public String toString2() {
		return "Autor: Arturo Perez Reverte, Titulo: El Capital Alatriste, número de ejemplares: " + this.Numero_de_ejemplares2;
	}
}
	
