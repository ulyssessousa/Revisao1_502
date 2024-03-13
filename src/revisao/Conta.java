package revisao;

public class Conta {
	private int numero;
	private double saldo;
	private static int quantContas = 0;
	
	
	private String mensagemOp; 
	
	
	
	public Conta() {		
		numero = ++quantContas;
	}
	
	public Conta(double saldo) {
		numero = ++quantContas;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getQuantContas() {
		return quantContas;
	}
	
	public boolean creditar(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean debitar(double valor) {
		if (valor > 0) {
			if (valor <= saldo) {
				saldo -= valor;
				mensagemOp = "Débito realizado com sucesso.";
				return true;
			}
			mensagemOp = "Saldo insuficiente.";
			return false;
		}
		mensagemOp = "Valor inválido.";
		return false;
	}

	public String getMensagemOp() {
		return mensagemOp;
	}

	public void setMensagemOp(String mensagemOp) {
		this.mensagemOp = mensagemOp;
	}
	
	
	
}
