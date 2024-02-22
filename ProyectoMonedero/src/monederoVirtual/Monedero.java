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
		private double cantidadTransferida;

		
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
			this.id = creacionId();
		}
		public double getSaldo() {
			return this.saldo;
		}
		public void setSaldo(double saldo) {

			this.saldo = saldo;
		}
		
		
		//Métodos
		public  double ingresar(double cantidadIngreso) {
			if(cantidadIngreso <= 0.0) {
				System.out.println("No puedes ingresar esa cantidad. Debes ingresar una cantidad mayor de 0.0€");
			}else {
				System.out.println("Perfecto. Cantidad ingresada correctamente");
				this.saldo = saldo + cantidadIngreso;
			}
			return saldo;
		}
	
		public double gastoDinero (double cantidadGastada) {
			if(cantidadGastada <= 0.0) {
				System.out.println("Error. No has gastado nada este mes ");
			}else {
				System.out.println("Perfecto. Cantidad pagada correctamente");
				this.saldo = saldo - cantidadGastada;
			}
			return saldo;
		}
		
		public double realizarTransferencia (double cantidadTransferida, Monedero recibe) {
			if(cantidadTransferida <= 0.0) {
				System.out.println("Error. No puedes realizar una tranferencia inferior o igual a 0.0€");
			}else {
				System.out.println("Perfecto. Cantidad transferida correctamente");
				this.saldo = saldo - cantidadTransferida;
				recibe.ingresar(cantidadTransferida);
			}
			return saldo;
		}
			
		
		public String creacionId() {
			SecureRandom random = new SecureRandom();
			StringBuilder idGenerado = new StringBuilder(12);

			// Generar un número aleatorio en el rango deseado
			long numeroAleatorio = 100000000000L + Math.abs(random.nextLong()) % (999999999999L - 100000000000L + 1);

			// Convertir el número a una cadena de 12 dígitos y agregarlo al StringBuilder
			idGenerado.append(String.format("%012d", numeroAleatorio));

			return idGenerado.toString();
		}

		
		
		
		
		
		
	
}
