package contrato;

import java.util.Date;

public class ContratoAssalariado extends Contrato {

	private float salarioMensal;
	private float percInsalubridade;
	private float percPericulosidade;

	public ContratoAssalariado(int id, Date dataInicio, Date dataEncerramento, Colaborador colaborador, boolean ativo,
			float salarioMensal, float percInsalubridade, float percPericulosidade) {
		super(id, dataInicio, dataEncerramento, colaborador, ativo);
		this.salarioMensal = salarioMensal;
		this.percInsalubridade = percInsalubridade;
		this.percPericulosidade = percPericulosidade;
	}

	public float getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(float salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public float getPercInsalubridade() {
		return percInsalubridade;
	}

	public void setPercInsalubridade(float percInsalubridade) {
		this.percInsalubridade = percInsalubridade;
	}

	public float getPercPericulosidade() {
		return percPericulosidade;
	}

	public void setPercPericulosidade(float percPericulosidade) {
		this.percPericulosidade = percPericulosidade;
	}

	public float calcVencimento() {
		float calc = 0;

		return calc;
	}

}
