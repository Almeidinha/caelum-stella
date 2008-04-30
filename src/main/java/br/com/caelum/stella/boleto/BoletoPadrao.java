package br.com.caelum.stella.boleto;

public class BoletoPadrao implements Boleto {
	
	private String valorBoleto;
	private String caminho;
	private String tipoSaida;

	private String localPagamento;
	private String qtdMoeda;
	private String valorMoeda;
	private double acrescimo;

	private String instrucao;
	private String especieDocumento;
	private String aceite;
	
	private Banco banco;
	private Datas datas;
	private Sacado sacado;
	private Emissor emissor;

	private BoletoPadrao() {
	}

	public BoletoPadrao newBoleto() {
		BoletoPadrao boleto = new BoletoPadrao();
		return boleto;
	}

	public String getAceite() {
		return this.aceite;
	}

	public double getAcrescimo() {
		return this.acrescimo;
	}

	public BoletoPadrao comAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
		return this;
	}

	public String getCaminho() {
		return this.caminho;
	}

	public BoletoPadrao comCaminho(String caminho) {
		this.caminho = caminho;
		return this;
	}

	public Datas getDatas() {
		return this.datas;
	}

	public BoletoPadrao comDatas(Datas datas) {
		this.datas = datas;
		return this;
	}

	public String getEspecieDocumento() {
		return this.especieDocumento;
	}

	public BoletoPadrao comEspecieDocumento(String especieDocumento) {
		this.especieDocumento = especieDocumento;
		return this;
	}

	public String getInstrucao() {
		return this.instrucao;
	}

	public BoletoPadrao comInstrucao(String instrucao) {
		this.instrucao = instrucao;
		return this;
	}

	public String getLocalPagamento() {
		return this.localPagamento;
	}

	public BoletoPadrao comLocalPagamento(String localPagamento) {
		this.localPagamento = localPagamento;
		return this;
	}

	public String getQtdMoeda() {
		return this.qtdMoeda;
	}

	public BoletoPadrao comQtdMoeda(String qtdMoeda) {
		this.qtdMoeda = qtdMoeda;
		return this;
	}

	public String getTipoSaida() {
		return this.tipoSaida;
	}

	public BoletoPadrao comTipoSaida(String tipoSaida) {
		this.tipoSaida = tipoSaida;
		return this;
	}

	public String getValorBoleto() {
		return this.valorBoleto;
	}

	public BoletoPadrao comValorBoleto(String valorBoleto) {
		this.valorBoleto = valorBoleto;
		return this;
	}

	public String getValorMoeda() {
		return this.valorMoeda;
	}

	public BoletoPadrao comValorMoeda(String valorMoeda) {
		this.valorMoeda = valorMoeda;
		return this;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public BoletoPadrao comBanco(Banco banco) {
		this.banco = banco;
		return this;
	}
	
	public Sacado getSacado() {
		return this.sacado;
	}
	
	public BoletoPadrao comSacado(Sacado sacado) {
		this.sacado = sacado;
		return this;
	}
	
	public Emissor getEmissor() {
		return this.emissor;
	}
	
	public BoletoPadrao comEmissor(Emissor emissor) {
		this.emissor = emissor;
		return this;
	}

	public void gerar() {
		BoletoFactory boletoFactory = new BoletoFactory();
		boletoFactory.generateBoleto(this);
	}

	public String getLinhaDigitavel() {
		// TODO Auto-generated method stub
		return null;
	}

}
