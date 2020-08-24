package delivery;

public class Lasanha extends Massa {
	private String[] sabores = {"Frango","Queijo e Presunto","Berinjela","4 queijos"};

	public Lasanha(){
		super.setTempoDePreparo(super.getTempoDePreparo());
		this.setNome("Lasanha");
		this.setPreco(20);
	}
	
	/**
	 * Cria um submenu e imprime os dados escolhidos pelo usuário.
	 */
	@Override
	void submenu() {
		String molho = Delivery.escolherUm(Main.teclado, this.getMolho(),"Molho");
		String sabor = Delivery.escolherUm(Main.teclado, sabores,"Sabores");

		System.out.println("=============================================");
		System.out.printf("Lanche: Lasanha\nMolho: %s\nSabor: %s\n\n",molho,sabor);
		System.out.printf("Preço: R$ %.2f\n",this.getPreco());
		System.out.println("=============================================");

	}
}
