public abstract class CapitalStrategy{	
	
	public abstract double capital(Loan loan);
	
	protected double duration(Loan loan){
        return duration(loan);
    }	
	
	protected double riskFactorFor(Loan loan){
        return riskFactorFor(loan);
    }
}
