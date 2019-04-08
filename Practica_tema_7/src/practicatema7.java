import java.util.*;;
public class practicatema7 {

	

	public static void main(String[] args) {
		
		Libro milibreria= new Libro();
		
		Scanner sc = new Scanner(System.in);		
		
		int tecla;
		
		do {
			System.out.println("Libro 1:");	
			System.out.println(milibreria.toString());
			System.out.println("--------------------------------------");
			System.out.println("Libro 2:");
			System.out.println(milibreria.toString2());
			System.out.println("--------------------------------------");
				
			System.out.println("1-Devolver Libro 1");
			System.out.println("2-Devolver Libro 2");
			System.out.println("3-Alquilar Libro 1");
			System.out.println("4-Alquilar Libro 2");
			System.out.println("5-No realizar ninguna acción");
		
		tecla=sc.nextInt();
		
		switch (tecla) {
        case 1:
            
            milibreria.devolucion();
            
            break;
        case 2:
            
            milibreria.devolucion2();
            
            break;
        case 3:
            
            milibreria.prestamo();
            
            
            break;
        case 4:
            
            milibreria.prestamo2();
           
            
            break;
		}
			}
		    
            while(tecla !=5);
            
            System.out.println("Aplicación finalizada");
            
            System.out.print("Hasta pronto");
                      
            sc.close();
			}
	
            }
		
		
		

