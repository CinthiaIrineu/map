public class Gamma extends FilterOp{
	double gamma;
	
	public Gamma(double gamma) {
		super();
		this.gamma = gamma;
	}

	public void op(Imagem i) throws FilterError {
		System.out.println("Gamma" + gamma + "aplicado na imagem");
	}

}
