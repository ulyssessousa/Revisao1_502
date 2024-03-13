package revisao;

public class ContaCorrente extends Conta{
	private double limite;
	
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double saldo) {
		super(saldo);		
	}

	public ContaCorrente(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void aumentarLimite(double valor) {
		this.limite += valor;
	}
	
	public double obterSaldoTotal() {
		return limite + this.getSaldo();
	}

	@Override
	public boolean debitar(double valor) {
		if (valor > obterSaldoTotal()) {
			this.setMensagemOp("Saldo insuficiente.");
			return false;
		}
		if (valor <= this.getSaldo()) {
			return super.debitar(valor);
		}
		
		double diferenca = valor - this.getSaldo();
		this.setSaldo(0);
		limite = limite - diferenca;
		this.setMensagemOp("Operação realizada, utilizando " + 
							diferenca + " reais do limite.");
		return true;
	}
	
	

}
