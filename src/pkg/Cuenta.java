package pkg;

public class Cuenta {
	
	Double saldo;
	
	public Cuenta(Double i) {
		this.saldo = i;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(Double i) {
		saldo += i;
	}

}
