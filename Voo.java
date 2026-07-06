package trabalhoPOO;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voo {
	
	private String codigo;
	private Aeroporto origem;
	private Aeroporto destino;
	private LocalDate data;
	private LocalTime hora;
	private int capacidade;
	private Aviao aviao;
	

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public Aviao getAviao() {
		return aviao;
	}
	
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	

	
	
	
	
}
