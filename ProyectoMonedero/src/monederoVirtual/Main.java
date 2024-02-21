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
    }

    // Método para mostrar los valores del monedero en la terminal
    private static void mostrarValoresMonedero(Monedero monedero) {
        System.out.println("ID: " + monedero.getId());
        System.out.println("Saldo: " + monedero.getSaldo());
    }

	}


