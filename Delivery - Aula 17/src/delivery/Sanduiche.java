package delivery;

public class Sanduiche extends Lanche {
	
	private int tempoDePreparo = 900; // Tempo em segundos (15m*60s)
	private String[] ingredientes = {
			"Carne","Frango","Queijo","Alface","Cebola",
			"Tomate","Bacon","Barbecue","Maionese","Mostarda"
			};
	
	public Sanduiche(){
		this.setTempoDePreparo(tempoDePreparo);
		this.setIngredientes(ingredientes);
		this.setNome("Sanduíche");
		this.setPreco(8);
	}
	
	/**
	 * Cria um submenu e imprime os dados escolhidos pelo usuário.
	 */
	@Override
	void submenu() {
		String escolhidos = Delivery.escolherItens(Main.teclado, ingredientes);
		System.out.println("=============================================");
		System.out.printf("Lanche: Sanduíche\nIngredientes: %s\n\n",escolhidos);
		System.out.printf("Preço: R$ %.2f\n",this.getPreco());
		System.out.println("=============================================");

	}
}