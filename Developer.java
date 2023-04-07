import java.util.ArrayList;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069


public class Developer extends RegularEmployee {
	private  ArrayList<Project>projects = new ArrayList<Project>();
	@Override
	public String toString() {
		return "				Person info [id= " + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender()+ "]"+"\n"+
				"				Employee Info [salary= "+ getSalary()+", hireDate= "+hireDate()+"]"+"\n"+"				RegularEmployee Info [performanceScore= "+getPerformanceScore()+", bonus= "+getBonus()+"]"+"\n"+"				"+projects.toString();
		
	}
	public int numberOfDevelopers=0;

	
	public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double performanceScore,
			ArrayList<Project> projects) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				performanceScore);
		this.projects = projects;
		numberOfDevelopers++;
	}
	public Developer(RegularEmployee re, ArrayList<Project> p) {
		super(re.getId(), re.getFirstName(), re.getLastName(), re.getGender(), re.getBirthDate(),
				re.getMaritalStatus(), re.getHasDriverLicence(), re.getSalary(), re.getHireDate(), re.getDepartment(),
				re.getPerformanceScore());
		
		numberOfDevelopers++;
	}
	 
		
	
	
	public  boolean addProject(Project s) {
		return projects.add(s);
	}
	public boolean removeProjects(Project s) {
		return projects.remove(s);
	}
	public ArrayList<Project> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	public int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}
	public void setNumberOfDevelopers(int numberOfDevelopers) {
		this.numberOfDevelopers = numberOfDevelopers;
	}
	

}
