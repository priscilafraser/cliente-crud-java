package cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cliente.entidades.Cliente;
import cliente.interfaces.ICrud;
import cliente.utilidades.Conexao;

public class DaoCliente implements ICrud<Cliente> {

	@Override
	public boolean inserir(Cliente obj) {
		String sql = "insert into cliente(nome, telefone, email, cep, logradouro, numero, complemento, bairro, estado, perfil, senha)values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getTelefone());
			stm.setString(3, obj.getEmail());
			stm.setString(4, obj.getCep());
			stm.setString(5, obj.getLogradouro());
			stm.setString(6, obj.getNumero());
			stm.setString(7, obj.getComplemento());
			stm.setString(8, obj.getBairro());
			stm.setString(9, obj.getEstado());
			stm.setString(10, obj.getPerfil());
			stm.setString(11, obj.getSenha());
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		finally {
			Conexao.fecharConexao();
		}
		return true;
	}

	@Override
	public boolean alterar(Cliente obj) {
		String sql = "update cliente set nome=?, telefone=?, email=?, cep=?, logradouro=?, numero=?, complemento=?, bairro=?, estado=?, perfil=?, senha=? where id=?";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getTelefone());
			stm.setString(3, obj.getEmail());
			stm.setString(4, obj.getCep());
			stm.setString(5, obj.getLogradouro());
			stm.setString(6, obj.getNumero());
			stm.setString(7, obj.getComplemento());
			stm.setString(8, obj.getBairro());
			stm.setString(9, obj.getEstado());
			stm.setString(10, obj.getPerfil());
			stm.setString(11, obj.getSenha());
			stm.setInt(12, obj.getId());
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		finally {
			Conexao.fecharConexao();
		}
		return true;
	}

	@Override
	public void excluir(int id) {
		String sql = "delete from cliente where id= " + id;
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Conexao.fecharConexao();
		}
		
	}

	@Override
	public Cliente consultar(int id) {
		Cliente cliente = new Cliente();
		String sql = "select * from cliente where id= " + id;
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {				
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEmail(rs.getString("email"));
				cliente.setCep(rs.getString("cep"));
				cliente.setLogradouro(rs.getString("logradouro"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setComplemento(rs.getString("complemento"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setEstado(rs.getString("estado"));
				cliente.setPerfil(rs.getString("perfil"));
				cliente.setSenha(rs.getString("senha"));				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Conexao.fecharConexao();
		}
		return cliente;
	}

	@Override
	public List<Cliente> consultar() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "select * from cliente";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEmail(rs.getString("email"));
				cliente.setCep(rs.getString("cep"));
				cliente.setLogradouro(rs.getString("logradouro"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setComplemento(rs.getString("complemento"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setEstado(rs.getString("estado"));
				cliente.setPerfil(rs.getString("perfil"));
				cliente.setSenha(rs.getString("senha"));
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Conexao.fecharConexao();
		}
		return clientes;
	}

}
