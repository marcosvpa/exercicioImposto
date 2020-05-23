package pessoa;

public abstract class pessoa {
	String name;
	Double anualIncome;
	
	
	//Setting the constructors 
	public pessoa () {
		
	}
	
	public pessoa(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	//Setting the getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	
	//Functions
	
	public double taxeCal() {
		return 0;
	}

	public double getTaxToPay() {
		return 0;
	};
	

	
	
}
