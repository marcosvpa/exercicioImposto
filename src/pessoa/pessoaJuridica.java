package pessoa;

public class pessoaJuridica extends pessoa{
	Integer employeeNumber;
	double taxToPay = 0;

	
	//Creating constructors
	public pessoaJuridica () {
		
	}
	
	public pessoaJuridica(String name, Double anualIncome,Integer employeeNumber) {
		super(name,anualIncome);
		this.employeeNumber = employeeNumber;
	}
	
	//Settings getters and setters
	

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public double getTaxToPay() {
		return taxToPay;
	}

	public void setTaxToPay(double taxToPay) {
		this.taxToPay = taxToPay;
	}
	
	//Overrider functions
	
	@Override
	public double taxeCal () {
			if (employeeNumber >10) {
				taxToPay = (anualIncome * 0.14);
				return taxToPay;
			} else {
				taxToPay = (anualIncome * 0.16);
				return taxToPay;
			}
		}

}

	
	
	

