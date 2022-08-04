package cliente;

import java.util.List;

import cliente.dao.DaoCliente;
import cliente.entidades.Cliente;
import cliente.utilidades.Conexao;

public class JdbcCliente {

	public static void main(String[] args) {
		//>>>>TESTANDO CONEXÃO - CERTO
//		if(Conexao.conectar() != null) {
//			System.out.println("Conectado!");
//		}
//		else {
//			System.out.println("Erro ao conectar");
//		}
		
		//-------------------------------------------
		
		//>>>>INSERINDO CLIENTES - CERTO
//		Cliente cliente1 = new Cliente("Rob", "929999999", "rob@gmail.com", "69099777", "Rua Hawai", "35","", "Cachoeirinha", "Tocantins", "clienteT", "*****");		
		DaoCliente dc = new DaoCliente();
//		if(dc.inserir(cliente1)) {
//			System.out.println("Contato cadastrado com sucesso!");
//		}
		
		//--------------------------------------------
		
		//>>>>CONSULTANDO CLIENTE POR ID - CERTO
//		Cliente cliente = dc.consultar(1);  //este não inicializa porque está chamando a variavel que já está inicializada dentro do metodo
//		System.out.println(cliente);
		
		//--------------------------------------------
		
		//>>>>ALTERANDO CLIENTE ACIMA - CERTO (apenas o complemento)
//		cliente.setComplemento("Apto 23");
//		if(dc.alterar(cliente)) {
//			System.out.println("Contato alterado com sucesso");
//			System.out.println(cliente);
//		}
		
		//--------------------------------------------
		
		//>>>>CONSULTANDO TODOS
//		List<Cliente> clientes = dc.consultar();
//		System.out.println(clientes);
		
		//--------------------------------------------
		
		//>>>>EXCLUINDO CLIENTE
		Cliente cliente = dc.consultar(5);
		System.out.println(cliente);
		dc.excluir(5);
		System.out.println(cliente);

	}

}
