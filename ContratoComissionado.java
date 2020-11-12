package contrato;

import java.util.Date;

public class ContratoComissionado extends Contrato {

	private float percComissao;
	private float ajudaCusto;

	public ContratoComissionado(int id, Date dataInicio, Date dataEncerramento, Colaborador colaborador, boolean ativo,
			float percComissao, float ajudaCusto) {
		super(id, dataInicio, dataEncerramento, colaborador, ativo);
		this.percComissao = percComissao;
		this.ajudaCusto = ajudaCusto;
	}

	public float getPercComissao() {
		return percComissao;
	}

	public void setPercComissao(float percComissao) {
		this.percComissao = percComissao;
	}

	public float getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(float ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	public float calcVencimento(float vlFaturam) {

		return vlFaturam;
	}

}
