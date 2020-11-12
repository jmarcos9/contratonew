package contrato;

import java.util.Date;

public abstract class Contrato {

	private static int gerarId = 0;
	
	private int id;
	private Date dataInicio;
	private Date dataEncerramento;
	private Colaborador colaborador;
	private boolean ativo;
	
	public Contrato(int id, Date dataInicio, Date dataEncerramento
			, Colaborador colaborador, boolean ativo) {
		super();
		this.id = gerarId();
		this.dataInicio = dataInicio;
		this.dataEncerramento = dataEncerramento;
		this.colaborador = colaborador;
		this.ativo = ativo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void encerrarContrato() {
		this.ativo = false;
	}

	public int gerarId() {
		return ++gerarId;
	}
	
	

}
