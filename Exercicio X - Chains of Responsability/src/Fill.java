public class Fill extends FilterOp{
	
	String fill;
	
	public Fill(String fill) {
		this.fill = fill;
	}

	public void op(Imagem i) throws FilterError {
		System.out.println("-fill " + fill + " aplicado na iamgem");
		
	}

}
