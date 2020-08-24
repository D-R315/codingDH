package delivery;

public abstract class Massa extends Lanche {
	private String[] molho = {"Molho à Bolonhesa","Molho Pesto","Molho de Tomate"};
	private int tempoDePreparo = 1800; // Tempo em segundos (30m*60s)

	public int getTempoDePreparo() {
		return tempoDePreparo;
	}

	public String[] getMolho() {
		return molho;
	}

	public void setMolho(String[] molho) {
		this.molho = molho;
	}
}
