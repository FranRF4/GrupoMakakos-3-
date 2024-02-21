package monederoVirtual;

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
		
	// Constructor
		public Monedero(String id, double saldo) {
			this.id = id;
			this.saldo = saldo;
		}
		public Monedero(String id) {
			this.id = id;
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
		public void ingresar(double cantidadIngreso) {
			this.saldo = saldo + cantidadIngreso;
		}
	
}
