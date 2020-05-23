package pessoa;

public class pessoaJuridica extends pessoa{
	Integer employeeNumber;

	
	//Creating constructors
	public pessoaJuridica () {
		
	}
	
	public pessoaJuridica(String name, Double anualIncome, Integer employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}
	
	//Settings getters and setters
	

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	
	//Overrider functions
	
	@Override
	public double taxeCal () {
			if (employeeNumber >10) {
				return (anualIncome * 0.14);
			} else {
				return (anualIncome * 0.16);
			}
		}
	}

	
	
	

