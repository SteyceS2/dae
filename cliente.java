package classe;

public class cliente {
	int id;
	String nome;
	String telefone;
	String endereco;
	String cpf;
	String rg;
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
	public String getEndereco() {
	return endereco;
	}
	public void setEndereco(String endereco) {
	this.endereco = endereco;
	}
	public String getCpf() {
	return cpf;
	}
	public void setCpf(String cpf) {
	this.cpf = cpf;
	}
	public String getRg() {
	return rg;
	}
	public void setRg(String rg) {
	this.rg = rg;
	}
	public String pagar( ) {
		return "pagando";
	}
	public String reservar( ) {
		return "reservado";
}
	public String experimentar( ) {
		return "experimentando";
	}
}