import java.text.SimpleDateFormat;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069

public class Employee extends Person {

	private double salary;
	private java.util.Calendar hireDate;
	private Department department;
	public int numberofEmployees = 0;
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");

	public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
		numberofEmployees++;
	}

	public Employee(Person person, double salary, Calendar hireDate, Department department) {
		super(person.getId(),person.getFirstName(),person.getLastName(),person.getGender(),person.getBirthDate(),person.getMaritalStatus(),person.getHasDriverLicence());
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
		numberofEmployees++;

	}
    @Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + sdf.format(hireDate.getTime()) + "]";
	}

	public Employee() {
		
	}

	public double raiseSalary(double percent) {
		this.salary = this.salary + (this.salary * percent);
		return salary;
	}

	public double raiseSalary(int amount) {
		this.salary = this.salary + amount;
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public java.util.Calendar getHireDate() {
		return hireDate;
	}
	public String hireDate() {
		return sdf.format(hireDate.getTime());
	}
	

	public void setHireDate(java.util.Calendar hireDate) {
		this.hireDate = hireDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getNumberofEmployees() {
		return numberofEmployees;
	}

	public void setNumberofEmployees(int numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}

}
