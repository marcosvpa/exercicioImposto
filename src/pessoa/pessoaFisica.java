package pessoa;

public class pessoaFisica extends pessoa {
	Double healthCost;
	double taxToPay = 0;


	//Creating constructors
	public pessoaFisica() {
		
	}
	
	public pessoaFisica(String name, Double anualIncome, Double healthCost) {
		super(name, anualIncome);
		this.healthCost = healthCost;
	}

	
	//Settings getter and setters
	
	public Double getHealthCost() {
		return healthCost;
	}

	
	public void setHealthCost(Double healthCost) {
		this.healthCost = healthCost;
	}
	
	public double getTaxToPay() {
		return taxToPay;
	}

	public void setTaxToPay(double taxToPay) {
		this.taxToPay = taxToPay;
	}
	
	//Overrider functions

	@Override
	public double taxeCal() {
	if (anualIncome >= 20000) {
		taxToPay = (anualIncome * 0.25)-(healthCost * 0.50);
		return taxToPay;
	} else {
		taxToPay = (anualIncome * 0.15)-(healthCost * 0.50);
		return taxToPay;
	}
}


	
}
