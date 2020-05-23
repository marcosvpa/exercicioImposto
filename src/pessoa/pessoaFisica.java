package pessoa;

public class pessoaFisica extends pessoa {
	Double healthCost;

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
	
	//Overrider functions
	
	@Override
	public double taxeCal() {
		if (anualIncome >= 20000) {
			return (anualIncome * 0.25)-(healthCost - 0.50);
		} else {
			return (anualIncome * 0.15)-(healthCost - 0.50);
		}
	}
	
	
	
}
