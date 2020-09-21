package view;

public class ClienteView {
	
	public void printDetails(String nome, String cpf, String rg, String email, String nascimento){

		System.out.printf("Cliente:\nNome: %s\nCpf: %s\nRg: %s\nEmail: %s\nData de Nascimento: %s\n\n", 
				nome,cpf,rg,email,nascimento);

	}
}
