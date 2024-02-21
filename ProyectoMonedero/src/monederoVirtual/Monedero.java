package monederoVirtual;

// Importamos la libereria SecureRandom que nos permite poder generar un id aleatorio con su metodo random
import java.security.SecureRandom;

public class Monedero {
	/* Implementa la clase monedero virtual: 
		 Cada monedero tiene un ID de 12 dígitos. 
		 Para simplificar, el ID se genera de forma aleatoria cuando se crea un monedero nuevo. 
		 El monedero se puede crear con un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente. 
		 En un monedero se pueden hacer ingresos y gastos. 
		 También es posible hacer una transferencia entre un monedero y otro. 
		 Se permite el saldo negativo.*/
	// Atributos
		private String id;
		private double saldo;
		private double cantidadIngreso;
		private String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
	// Constructor
		public Monedero( double saldo) {
			this.id = creacionId();
			this.saldo = saldo;
		}
		public Monedero() {
			this.id = creacionId();
			this.saldo = 0.0;
		}
		
		
		// Getters y Setters
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public double getSaldo() {
			return this.saldo;
		}
		public void setSaldo(double saldo) {

			this.saldo = saldo;
		}
		
		//Métodos
		public double ingresar(double cantidadIngreso) {
			System.out.println("¿Qué cantidad de dinero quieres ingresar a tu saldo");
			if(cantidadIngreso <= 0) {
				System.out.println("No puedes ingresar esa cantidad. Debes ingresar una cantidad mayor de 0");
			}else {
				System.out.println("Perfecto. Cantidad ingresada correctamente");
				this.saldo = saldo + cantidadIngreso;
			}
			return saldo;
		}
		
		
			
		
		public String creacionId() {
			SecureRandom random = new SecureRandom();
			StringBuilder idGenerado = new StringBuilder(12);
			
			for (int i = 0; i < 12; i++) {
				
	            int indice = random.nextInt(caracteres.length());
	           
	            idGenerado.append(caracteres.charAt(indice));
	        }

	        return idGenerado.toString();
		}
		
		
		
		
	
}
