package view;

public class EnderecoView {
	public void printDetails(String numero, String rua, String bairro, String complemento, String cidade, String estado) {
		System.out.printf("%s, %s, %s, %s, %s – %s\n\n", rua, numero, bairro, complemento, cidade, estado);
	}
}
