package delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Delivery {
	
	/**
	 * Calcula o tempo estimado para entrega.
	 * @param scanner Scanner para leitura dos dados do console.
	 * @param lanche Lanche selecionado
	 * @return Tempo estimado de entrega
	 */
	public static String calcularTempo(Scanner scanner, Lanche lanche) {
		
		System.out.println("Qual a sua distância em km do restaurante?");
		double km = scanner.nextDouble();
		int tempo = (int) (lanche.getTempoKm()*km) + lanche.getTempoDePreparo();
		return "Tempo estimado de entrega: " + formatarTempo(tempo);		
	}

	/**	 
	 * Recebe um tempo em segundos e formata em horas, minutos e segundo.
	 * Método codificado mais para praticar a lógica. Não é necessário neste sistema.
	 * @param tempo Tempo em segundos.
	 * @return Retorna uma string em horas, minutos e segundo.
	 */
	public static String formatarTempo(int tempo){
		int segundos = tempo%60;
		int minutos = tempo/60%60;
		int horas = tempo/3600;

		return String.format("%02dh %02dm %02ds", horas, minutos, segundos);
	}

	/**
	 * Cria um menu com os dados de uma lista de Lanches.
	 * @param scanner Scanner para leitura dos dados do console.
	 * @param cardapio Lista de Lanches.
	 * @return Retorna o Lanche selecionado.
	 */
	public static Lanche escolherLanche(Scanner scanner, List<Lanche> cardapio) {

		System.out.println("=============================================");
		System.out.println("              Escolha um Lanche              ");
		System.out.println("=============================================");

		for(int index = 0; index<cardapio.size(); index++) {
			System.out.printf("%4d – %s\n",(index+1),cardapio.get(index).getNome());
		}

		int opcao =0;
		int confirmar = 0;

		while(confirmar !=1) {
			System.out.println("=============================================");
			System.out.println("       Digite o número da sua escolha        ");
			opcao = scanner.nextInt();
			System.out.printf("O lanche selecionado foi: %s\n", cardapio.get(opcao-1).getNome());
			System.out.println("[0]Escolher novamente		[1]Confirmar");
			confirmar = scanner.nextInt();
		}

		return cardapio.get(opcao-1);
	}

	/**
	 * Cria um menu de multipla escolha com os dados de um vetor de Strings.
	 * @param scanner Scanner para leitura dos dados do console.
	 * @param itens vetor de Strings com os itens a serem selecionados.
	 * @return Retorna uma String com os itens selecionados.
	 */
	public static String escolherItens(Scanner scanner, String[] itens){

		System.out.println("=============================================");
		System.out.println("           Escolha os ingredientes           ");
		System.out.println("=============================================");

		for(int index = 0; index<itens.length; index++) {
			System.out.printf("%4d – %s\n",(index+1),itens[index]);
		}

		System.out.println();
		System.out.println("   0 – Finalizar escolha");

		int opcao = -1;
		int index = 0;
		int confirmar = 0;
		String ingredientes = "";

		while(confirmar !=1) {
			System.out.println("=============================================");
			System.out.println("Digite um número e Enter para selecionar \ncada ingrediente (max 10)");

			opcao = scanner.nextInt();

			List<String> itensEscolhidos = new ArrayList<>();

			while(index<itens.length && opcao != 0) {
				itensEscolhidos.add(itens[opcao -1]);
				index++;
				opcao =scanner.nextInt();
			}

			for(int i = 0; i<itensEscolhidos.size(); i++) {
				ingredientes += (itensEscolhidos.get(i) + " ");
				System.out.print(itensEscolhidos.get(i)+ " ");
			}
			
			System.out.println();
			System.out.println("=============================================");
			System.out.println("[0]Escolher novamente		[1]Confirmar");
			confirmar = scanner.nextInt();
		}
		
		return ingredientes;
	}
	
	/**
	 * Cria um menu de multipla escolha com os dados de um vetor de Strings.
	 * @param scanner scanner Scanner para leitura dos dados do console.
	 * @param menu Vetor de Strings com os itens a serem selecionados.
	 * @param titulo Titulo do menu.
	 * @return Retorna uma String com o item selecionado.
	 */
	public static String escolherUm(Scanner scanner, String[] menu, String titulo) {

		System.out.println("=============================================");
		System.out.printf("              %s\n",titulo);
		System.out.println("=============================================");

		for(int index = 0; index<menu.length; index++) {
			System.out.printf("%4d – %s\n",(index+1),menu[index]);
		}
		

		int opcao =0;
		int confirmar = 0;

		while(confirmar !=1) {
			System.out.println("=============================================");
			System.out.println("       Digite o número da sua escolha        ");
			opcao = scanner.nextInt();
			System.out.printf("%s: %s\n",titulo, menu[opcao-1]);
			System.out.println("[0]Escolher novamente		[1]Confirmar");
			confirmar = scanner.nextInt();
		}

		return menu[opcao-1];
	}
}
