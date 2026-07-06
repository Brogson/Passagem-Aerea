package trabalhoPOO;

public class Aeroporto {
	private String sigla;
    private String nome;
    private String cidade;
    private String estado;

    public Aeroporto(String sigla, String nome, String cidade, String estado) {
    	this.sigla = sigla;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public String getSigla() {
		return sigla;
	}
    
    public void setSigla(String sigla) {
		this.sigla = sigla;
	}
    
    public String getNome() {
		return nome;
	}
    
    public void setNome(String nome) {
		this.nome = nome;
	}
    
    public String getCidade() {
		return cidade;
	}
    
    public void setCidade(String cidade) {
		this.cidade = cidade;
	}
    
    public String getEstado() {
		return estado;
	}
    
    public void setEstado(String estado) {
		this.estado = estado;
	}
    
    public String toString() {
    	return String.format("%s (%s), %s - %s", nome, sigla, cidade, estado);
    }
}

