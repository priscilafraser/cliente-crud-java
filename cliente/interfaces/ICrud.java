package cliente.interfaces;

import java.util.List;

public interface ICrud<T> {
	boolean inserir(T obj);
	boolean alterar(T obj);
	void excluir(int id);
	T consultar(int id);
	List<T> consultar();

}
