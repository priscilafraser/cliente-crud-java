package cliente.entidades;

public class Cliente {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String perfil;
	private String senha;
	
	
	
	
	public Cliente(String nome, String telefone, String email, String cep, String logradouro, String numero,
			String complemento, String bairro, String estado, String perfil, String senha) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.perfil = perfil;
		this.senha = senha;
	}
	
	
	
	public Cliente() {
		
	}

	


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep
				+ ", logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
				+ bairro + ", estado=" + estado + ", perfil=" + perfil + ", senha=" + senha + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
