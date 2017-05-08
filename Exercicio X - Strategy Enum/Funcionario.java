public class Funcionario {
		
	protected Gratificacao cargo;
	protected double salarioBase;	
    protected int nivel;
    

	public Funcionario(Gratificacao cargo, double salarioBase, int nivel) {
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.nivel = nivel;		
	}

	public double calcularGratificacao() {			
		return cargo.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
}