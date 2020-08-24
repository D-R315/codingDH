package delivery;

public class Pizza extends Massa {
	private String[] sabores = {"Calabresa","Portuguesa","Marguerita","Frango com catupiry","Napolitana"};
			
	public Pizza(){
		super.setTempoDePreparo(super.getTempoDePreparo());
		this.setNome("Pizza");
		this.setPreco(24.79);
	}
	
	/**
	 * Cria um submenu e imprime os dados escolhidos pelo usuário.
	 */
	@Override
	void submenu() {
		String molho = Delivery.escolherUm(Main.teclado, this.getMolho(),"Molho");
		String sabor = Delivery.escolherUm(Main.teclado, sabores,"Sabores");

		System.out.println("=============================================");
		System.out.printf("Lanche: Pizza\nMolho: %s\nSabor: %s\n\n",molho,sabor);
		System.out.printf("Preço: R$ %.2f\n",this.getPreco());
		System.out.println("=============================================");

	}
}
