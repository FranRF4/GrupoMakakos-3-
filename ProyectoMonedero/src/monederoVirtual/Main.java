package monederoVirtual;
public class Main {

	public static void main(String[] args) {
		// Crear un monedero con saldo inicial
        Monedero monederoConSaldo = new Monedero(100.0);
        
        
        // Crear un monedero sin saldo inicial
        Monedero monederoSinSaldo = new Monedero();

        
        // Mostrar los valores en la terminal
       
        
        System.out.println("Monedero con saldo:");
        mostrarValoresMonedero(monederoConSaldo);
	
        System.out.println("\nMonedero sin saldo:");
        mostrarValoresMonedero(monederoSinSaldo);
        
        System.out.println("\nPagar: ");
        monederoSinSaldo.gastoDinero(150); 
        mostrarValoresMonedero(monederoConSaldo);
        mostrarValoresMonedero(monederoSinSaldo);
        
        monederoConSaldo.realizarTransferencia(200, monederoSinSaldo);
        mostrarValoresMonedero(monederoSinSaldo);
        
	}
	
	private static void mostrarValoresMonedero(Monedero monedero) {
        System.out.println("ID: " + monedero.getId());
        System.out.println("Saldo: " + monedero.getSaldo() + "€\n");
        
    } 
    

	}


