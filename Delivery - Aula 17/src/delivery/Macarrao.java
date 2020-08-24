package delivery;

public class Macarrao extends Massa {
	
	public Macarrao(){
		super.setTempoDePreparo(super.getTempoDePreparo());
		this.setNome("Macarrão");
		this.setPreco(15.7);
	}
	
	/**
	 * Cria um submenu e imprime os dados escolhidos pelo usuário.
	 */
	@Override
	void submenu() {
		String molho = Delivery.escolherUm(Main.teclado, this.getMolho(),"Molho");
		System.out.println("=============================================");
		System.out.printf("Lanche: Macarrao\nMolho: %s\n\n",molho);
		System.out.printf("Preço: R$ %.2f\n",this.getPreco());
		System.out.println("=============================================");

	}

}
