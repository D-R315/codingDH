package delivery;

public class Bolo extends Lanche {
	private String[] massas = {"Pão-de-ló","Génoise","Chiffon","Amanteigada"};
	private String[] recheios = {"Brigadeiro","Baba de Moça","Beijinho","Nozes","Chantilly e morango"};
	private String[] coberturas = {"Ganache","Chantilly","Brigadeiro","Coco"};
	private int tempoDePreparo = 600; // Tempo em segundos (10m*60s)
	
	public Bolo(){
		super.setTempoDePreparo(this.tempoDePreparo);
		this.setNome("Bolo");
		this.setPreco(25);
	}
	
	/**
	 * Cria um submenu e imprime os dados escolhidos pelo usuário.
	 */
	@Override
	void submenu() {
		String massa = Delivery.escolherUm(Main.teclado, massas,"Tipo de Massa");
		String recheio = Delivery.escolherUm(Main.teclado, recheios,"Tipo de Recheio");
		String cobertura = Delivery.escolherUm(Main.teclado, coberturas, "Tipo de Cobertura");
		System.out.println("=============================================");
		System.out.printf("Lanche: Bolo\nMassa: %s\nRecheio: %s\nCobertura: %s\n\n",massa,recheio,cobertura);
		System.out.printf("Preço: R$ %.2f\n",this.getPreco());
		System.out.println("=============================================");

	}

}
