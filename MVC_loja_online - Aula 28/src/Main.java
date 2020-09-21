import controller.ClienteController;
import controller.EnderecoController;
import controller.PedidoController;
import controller.ProdutoController;
import controller.Produto_PedidoController;
import controller.TelefoneController;
import model.Cliente;
import model.Endereco;
import model.Pedido;
import model.Produto;
import model.Produto_Pedido;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.PedidoView;
import view.ProdutoView;
import view.Produto_PedidoView;
import view.TelefoneView;

public class Main {

	public static void main(String[] args) {

		Cliente clienteModel = clienteDB();
		Endereco enderecoModel = enderecoDB();
		Pedido pedidoModel = pedidoDB();
		Produto produtoModel = produtoDB();
		Telefone telefoneModel = telefoneDB();
		Produto_Pedido produto_pedidoModel = produto_pedidoDB();

		ClienteView clienteView = new ClienteView();
		EnderecoView enderecoView = new EnderecoView();
		PedidoView pedidoView = new PedidoView();
		ProdutoView produtoView = new ProdutoView();
		TelefoneView telefoneView = new TelefoneView();
		Produto_PedidoView produto_pedidoView = new Produto_PedidoView();

		ClienteController clienteController = new ClienteController(clienteModel, clienteView);
		EnderecoController enderecoController = new EnderecoController(enderecoModel, enderecoView);
		PedidoController pedidoController = new PedidoController(pedidoModel, pedidoView);
		ProdutoController produtoController = new ProdutoController(produtoModel, produtoView);
		TelefoneController telefoneController = new TelefoneController(telefoneModel, telefoneView);
		Produto_PedidoController produto_pedidoController = new Produto_PedidoController(produto_pedidoModel, produto_pedidoView);

		clienteController.updateView();
		clienteController.setNome("José");
		clienteController.updateView();
		
		enderecoController.updateView();
		enderecoController.setCidade("Pororó");
		enderecoController.setEstado("RJ");
		enderecoController.updateView();
		
		pedidoController.updateView();
		
		produtoController.updateView();
		produtoController.setPreco(100);
		produtoController.updateView();
		
		telefoneController.updateView();
		
		produto_pedidoController.updateView();

	}

	public static Cliente clienteDB() {
		Cliente clienteDB = new Cliente(
				"nome", 
				"000.000.000-00", 
				"00.000.000-0", 
				"email@email.com", 
				"00/00/0000"
				);
		return clienteDB;
	}

	public static Endereco enderecoDB() {
		Endereco enderecoDB = new Endereco("0", "Rua dos Bobos", "Vilaró");
		return enderecoDB;
	}
	
	public static Pedido pedidoDB() {
		Pedido pedidoDB = new Pedido("0", "00/00/0000", 0.000, "pendente");
		return pedidoDB;
	}
	
	public static Produto produtoDB() {
		Produto produtoDB = new Produto("nome", "...", 0, 0.000);
		return produtoDB;
	}
	
	public static Telefone telefoneDB() {
		Telefone telefoneDB = new Telefone("00", "000000000");
		return telefoneDB;
	}
	
	public static Produto_Pedido produto_pedidoDB() {
		Produto_Pedido produto_pedidoDB = new Produto_Pedido(0, null, 0);
		return produto_pedidoDB;
		
	}
}