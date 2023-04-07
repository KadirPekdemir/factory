import java.util.Calendar;
//Kadir PEKDEMÝR 150121069

public class RegularEmployee extends Employee{
	
	private double performanceScore;
	private double bonus;
	
	
	public RegularEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,
			 double performanceScore) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department);
		this.performanceScore = performanceScore;
		
	}
	public RegularEmployee(Employee employee, double perfScore) {
		super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getGender(), employee.getBirthDate(),
				employee.getMaritalStatus(), employee.getHasDriverLicence(), employee.getSalary(), employee.getHireDate(), employee.getDepartment());
		this.performanceScore = perfScore;
		
	}
	@Override
	public String toString() {
		return "				Person info [id= " + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender()+ "]"+"\n"+
				"				Employee Info [salary= "+ getSalary()+", hireDate= "+hireDate()+"]"+"\n"+"				RegularEmployee Info [performanceScore= "+getPerformanceScore()+", bonus= "+getBonus()+"]";
		
	}
	public RegularEmployee() {
	}
	public double getPerformanceScore() {
		return performanceScore;
	}
	public void setPerformanceScore(double performanceScore) {
		this.performanceScore = performanceScore;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

}
