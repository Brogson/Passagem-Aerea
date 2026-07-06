
public class PagamentoPix extends Pagamento {
	private String idTransacao;

    public PagamentoPix(String idTransacao) {
    	this.idTransacao = idTransacao;
    }

    public boolean processar(double valor) {
        System.out.println("Validando PIX: " + idTransacao);
        return true;
    }
}
