import java.util.ArrayList;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069


public class Customer extends Person{
	
	private ArrayList<Product> products = new ArrayList<Product>();
	
	
	public Customer(int id, String firstName, String lastName, String gender,Calendar birthDate, String maritalStatus,String hasDriverLicence, ArrayList<Product> products) {
       super(id,firstName,lastName,gender,birthDate,maritalStatus,hasDriverLicence);
       this.products=products;
	}
	public Customer(Person person, ArrayList<Product> products) {
		super(person.getId(),person.getFirstName(),person.getLastName(),person.getGender(),person.getBirthDate(),person.getMaritalStatus(),person.getHasDriverLicence());
	}
	
	
	@Override
	public String toString() {
		return "Customer [id: "+ getId() +" products=" + products.toString() + "]";
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
}
