package delivery;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);
	static Lanche lanche;

	public static void main(String[] args) {
		
		List<Lanche> cardapio = new ArrayList<>();

		cardapio.add(new Sanduiche());
		cardapio.add(new Bolo());
		cardapio.add(new Lasanha());
		cardapio.add(new Macarrao());
		cardapio.add(new Pizza());
				
		lanche = Delivery.escolherLanche(teclado, cardapio);		
		lanche.submenu();
		System.out.println(Delivery.calcularTempo(teclado, lanche));	
		
	}
}