import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class marketMain {

	public static void main(String[] args) {
		
		String respuesta;
		Scanner input = new Scanner(System.in);
		
		List<String> arrayProducts = new ArrayList<>();
		arrayProducts.add("manteca");
		arrayProducts.add("Coca-Cola");
do {
	
	
	System.out.print("Ingrese el producto:");
	String product = input.next();
	arrayProducts.add(product);
	System.out.print("Desea agregar otro producto? S ->para si | N ->para no");
	respuesta = input.next();
	respuesta = respuesta.toUpperCase();

}while(respuesta.equals("S"));


System.out.print("Lista del Carrito de compras:" + arrayProducts);
	}

}