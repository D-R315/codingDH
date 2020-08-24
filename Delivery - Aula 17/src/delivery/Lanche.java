package delivery;

public abstract class Lanche {
	
	private String nome;
	private double preco;
	private String[] ingredientes;
	private int tempoDePreparo;
	private int tempoKm = 600; // tempo(em segundos) gasto por km para entrega (10m*60s)
	
	abstract void submenu();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String[] getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public int getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(int tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
	
	public int getTempoKm() {
		return tempoKm;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
