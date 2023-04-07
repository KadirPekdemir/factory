import java.util.ArrayList;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069


public class Manager extends Employee {
	private ArrayList<RegularEmployee> regularEmployees = new ArrayList<RegularEmployee>();
	private double bonusBudget;

	public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double bonusBudget) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate,
				department);
		this.bonusBudget = bonusBudget;
	}

	public Manager(Employee employee, double bonusBudget) {
		super(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getBirthDate(),employee.getMaritalStatus(),employee.getHasDriverLicence(),employee.getSalary(),employee.getHireDate(),employee.getDepartment());

		this.bonusBudget = bonusBudget;
	}

	@Override
	public String toString() {
		return "	Manager [id: " + getId() + "," + getFirstName() +" "+ getLastName() + "]";
	}

	public void addEmployee(RegularEmployee e) {
		regularEmployees.add(e);
	}

	public void removeEmployee(RegularEmployee e) {
		regularEmployees.remove(e);
	}

	public void distributeBonusBudget() {
		double sum = 0;
		double unit;
		for (int i = 0; i < regularEmployees.size(); i++) {
			sum += (regularEmployees.get(i).getSalary() * regularEmployees.get(i).getPerformanceScore());

		}
		unit = bonusBudget / sum;
		for (int i = 0; i < regularEmployees.size(); i++) {
			regularEmployees.get(i).setBonus(
					unit * regularEmployees.get(i).getSalary() * regularEmployees.get(i).getPerformanceScore());

		}

	}

	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}

	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}

	public double getBonusBudget() {
		return bonusBudget;
	}

	public void setBonusBudget(double bonusBudget) {
		this.bonusBudget = bonusBudget;
	}

}
