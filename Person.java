import java.text.SimpleDateFormat;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069

public class Person {
	
	private int id;
	private String firstName, lastName;
	private byte gender;
	private java.util.Calendar birthDate;
	private byte maritalStatus;
	private boolean hasDriverLicence;
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");

	public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender1(gender);
		this.birthDate = birthDate;
		this.maritalStatus = maritalStatus1(maritalStatus);
		this.hasDriverLicence = hasDriverLicence1(hasDriverLicence);
		
	}

	public Person() {

	}
	public byte gender1(String gender) {
		if (gender.equals("Woman"))
			this.gender=1;
		else if (gender.equals("Man"))
			this.gender=2;
		return this.gender;
	}
	public byte maritalStatus1(String maritalStatus) {
		if (maritalStatus .equals("Single"))
			this.maritalStatus = 1;
	    else if (maritalStatus .equals("Married")) 
			this.maritalStatus = 2;
		return this.maritalStatus;
	}
	public boolean hasDriverLicence1(String hasDriverLicence) {
		if (hasDriverLicence.equals("Yes")) 
			this.hasDriverLicence = true;
		else if (hasDriverLicence.equals("No")) 
			this.hasDriverLicence = false;
		return this.hasDriverLicence;
		
	}

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + getGender()
				+ ", birthDate=" + sdf.format(birthDate.getTime()) + ", maritalStatus=" + getMaritalStatus() + ", hasDriverLicence="
				+ getHasDriverLicence() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getGender() {
		String genderr="";
		if(gender==1) 
			genderr="Woman";
		else if ( gender==2) 
			genderr="Man";
		return genderr;
	}

	public void setGender(String gender) {
		if (gender=="Woman") {
			this.gender = 1;
		} else if (gender=="Man") {
			this.gender = 2;
		}

	}

	public java.util.Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.util.Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public String getMaritalStatus() {
		String maritalStatuss="";
		if(maritalStatus==1)
			maritalStatuss="Single";
		else if(maritalStatus==2)
			maritalStatuss="Maried";
		return maritalStatuss;
	}

	public void setMaritalStatus(String status) {
		if (status == "Single") {
			this.maritalStatus = 1;
		} else if (status == "Married") {
			this.maritalStatus = 2;
		}
	}

	public String getHasDriverLicence() {
		String hasDriverLicencee = "";
		if(hasDriverLicence)
			hasDriverLicencee="Yes";
		else
			hasDriverLicencee="No";
		return hasDriverLicencee;
	}

	public void setHasDriverLicence(String info) {
		if (info == "Yes") {
			this.hasDriverLicence = true;
		} else if (info == "No") {
			this.hasDriverLicence = false;
		}
	}
}
