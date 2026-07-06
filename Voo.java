package trabalhoPOO;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voo {
	private Aeroporto origem;
	private Aeroporto destino;
	private LocalDate data;
	private LocalTime hora;
	private int capacidade;
	private String id;
	private Aviao aviao;
	private double precoMinimo;
	
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Aviao getAviao() {
		return aviao;
	}
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	public double getPrecoMinimo() {
		return precoMinimo;
	}
	public void setPrecoMinimo(double precoMinimo) {
		this.precoMinimo = precoMinimo;
	}

	
	
	
	
}
