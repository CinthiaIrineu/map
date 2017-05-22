public class CapitalStrategyRevolver extends CapitalStrategy{
	
	public double capital(Loan loan){
        return (loan.outstandingRiskAmount() * duration(loan) * riskFactorFor(loan))
                + (loan.getUnusedPercentage() * duration(loan) * unusedRiskFactor(loan));
    }

    private double unusedRiskFactor(Loan loan){
        return 0;
    }
}
