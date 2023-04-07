import java.util.ArrayList;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069

public class SalesEmployee extends RegularEmployee {
	public SalesEmployee() {
		
	}
	private ArrayList<Product> sales = new ArrayList<Product>();
	public int numberOfSalesEmployees = 0;

	public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,
			double performanceScore, ArrayList<Product> sales) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				performanceScore);
		this.sales = sales;
		numberOfSalesEmployees++;
	}

	public SalesEmployee(RegularEmployee re, ArrayList<Product> s) {
		super(re.getId(), re.getFirstName(), re.getLastName(), re.getGender(), re.getBirthDate(),
				re.getMaritalStatus(), re.getHasDriverLicence(), re.getSalary(), re.getHireDate(), re.getDepartment(),
				re.getPerformanceScore());

		numberOfSalesEmployees++;
	}

	@Override
	public String toString() {
		return "				Person info [id= " + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender()+ "]"+"\n"+
				"				Employee Info [salary= "+ getSalary()+", hireDate= "+hireDate()+"]"+"\n"+"				RegularEmployee Info [performanceScore= "+getPerformanceScore()+", bonus= "+getBonus()+"]"+"\n"+"				"+sales.toString();
		
	}

	public boolean addSale(Product s) {
		return sales.add(s);
	}

	public boolean removeSale(Product s) {
		return sales.remove(s);
	}

	public ArrayList<Product> getSales() {
		return sales;
	}

	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}

	public int getNumberOfSalesEmployees() {
		return numberOfSalesEmployees;
	}

	public void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
		this.numberOfSalesEmployees = numberOfSalesEmployees;
	}
	public double sumProduct() {
		double sum=0;
		for (int i = 0; i < sales.size(); i++) {
			sum = sum + sales.get(i).getPrice();
		}
		return sum;
	}
	

}
