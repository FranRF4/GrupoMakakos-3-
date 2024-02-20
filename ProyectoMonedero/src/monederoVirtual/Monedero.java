package monederoVirtual;

public class Monedero {
	// Atributos
		private String id;
		private double saldo;
		
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
		
}
