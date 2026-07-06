
public class Passageiro {
	private String nome;
	private String cpf;
	
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}n
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return String.format("Nome: %s; CPF: %s", nome, cpf);
	}
}
