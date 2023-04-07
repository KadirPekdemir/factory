import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
//Kadir PEKDEMÝR 150121069



public class Test { 
	public static void main (String[] args) throws FileNotFoundException    {
	  Scanner input = new Scanner(new File("C:\\Users\\BERTUG\\eclipse-workspace3\\150121069_HW1\\src\\input.txt"));
	  ArrayList<Object> objects = new ArrayList<Object>();
	  ArrayList<Product> products = new ArrayList<Product>();
	  ArrayList<Project> projects = new ArrayList<Project>();
	  
	  String firstname = "";
	  String lastname = "";
	  int id =0 ;
	  String gender = "";
	  Calendar birthDate = null;
	  String birthDatestr = "";
	  String maritalStatus = "";
	  String hasDriverLicence = "";
	  int departmentId = 0;
	  String departmentName = "";
	  String projectName = "";
	  String startDatestr = "";
	  Calendar startDate = null;
	  String state = "";
	  String productName = ""; 
	  String saleDatestr = "";
	  Calendar saleDate = null;
	  double price = 0;
	  double salary = 0;
	  String hireDatestr = "";
	  Calendar hireDate = null;
	  double perfScore = 0;
	  double bonusBudget = 0;
	  String projectstr = "";
	  String productstr = "";
	    
	 while(input.hasNext()) {
		 String word = input.next();
		 
		 if (word.equals("Person")) {
			 firstname = input.next();
			 lastname = input.next();
			 id = input.nextInt();
			 gender= input.next();
			 birthDatestr = input.next();
			 birthDate = declareCalendar(birthDatestr);
			 maritalStatus = input.next();
			 hasDriverLicence = input.next();
			 Object person = new Person(id,firstname,lastname,gender,birthDate,maritalStatus,hasDriverLicence);
			 objects.add(person);
			
		 }
		 else if (word.equals("Department")) {
			 departmentId = input.nextInt();
			 departmentName = input.next();
			 Object department = new Department(departmentId,departmentName);
			 objects.add(department);
		 }
		 else if (word.equals("Project")) {
			 projectName = input.next();
			 startDatestr = input.next();
			 startDate = declareCalendar(startDatestr);
			 state = input.next();
			 Object project = new Project(projectName,startDate,state);
			 projects.add((Project) project);
		 }
		 else if(word.equals("Product")) {
			 productName = input.next();
			 saleDatestr = input.next();
			 saleDate = declareCalendar(saleDatestr); 
			 price = input.nextDouble();
			 Object product = new Product(productName, saleDate, price);
			 products.add((Product) product);
			
		 } 
		 
		 else if(word.equals("Employee")) {
			 Department department=null;
			 Person person= null;
			 id = input.nextInt();
			 salary = input.nextDouble();
			 hireDatestr = input.next();
			 hireDate = declareCalendar(hireDatestr);
			 departmentName = input.next();
			 for (int i = 0; i < objects.size(); i++) {
				if((objects.get(i)instanceof Department)&&(((Department) objects.get(i)).getDepartmentName().equals(departmentName))) {
					department=(Department) objects.get(i);
				}
				else if((objects.get(i)instanceof Person)&&(((Person) objects.get(i)).getId()==id)) {
					person = (Person) objects.get(i);
				}
			}
			 Object employee =new Employee(person,salary,hireDate,department);
			 objects.add(employee);
			 objects.remove(person);
			
					 
		 }
		 else if(word.equals("RegularEmployee")) {
			 Employee employee= null;
			 id = input.nextInt();
			 perfScore = input.nextDouble();
			 for (int i = 0; i < objects.size(); i++) {
				 if((objects.get(i)instanceof Employee)&&(((Employee) objects.get(i)).getId()==id)){
					 employee = (Employee) objects.get(i);
				 }	
			}
			 Object regularEmployee =new RegularEmployee(employee,perfScore);
			 objects.add(regularEmployee); 
			 objects.remove(employee);
			
		 }
		 else if(word.equals("Manager")) {
			 Employee employee =null;
			 id = input.nextInt();
			 bonusBudget = input.nextDouble();
			 for (int i = 0; i < objects.size(); i++) {
				if((objects.get(i)instanceof Employee)&&(((Person) objects.get(i)).getId()==id)) {
					employee = (Employee) objects.get(i);
				}
			}
			Object manager = new Manager(employee, bonusBudget);
			objects.add(manager);
			objects.remove(employee);
		 }
		 else if(word.equals("Developer")) {
			 ArrayList<Project> tempProjects = new ArrayList<Project>();
			 RegularEmployee regularEmployee= null;
			 id = input.nextInt();
			 projectstr = input.nextLine();
			 for (int i = 0; i <objects.size(); i++) {
				 if((objects.get(i)instanceof RegularEmployee)&&(((RegularEmployee) objects.get(i)).getId()==id)) {
					 regularEmployee = (RegularEmployee) objects.get(i);
				 }
			}
			 Object developer = new Developer(regularEmployee,tempProjects);
			 objects.add(developer);
			 objects.remove(regularEmployee);
			 
			 String[] project = projectstr.split(" ");
			for (int i = 0; i < projects.size(); i++) {
				for (int j = 0; j < project.length; j++) {
					if(projects.get(i).getProjectName().equals(project[j])) {
						((Developer) developer).addProject(projects.get(i));
						
					}
				}
			}
			
		
		}
		 
		 else if(word.equals("SalesEmployee")) {
			 ArrayList<Product> tempProducts = new ArrayList<Product>();
			 RegularEmployee regularEmployee= null;
			 id = input.nextInt();
			 productstr = input.nextLine();
			 for (int i = 0; i <objects.size(); i++) {
				 if((objects.get(i)instanceof RegularEmployee)&&(((RegularEmployee) objects.get(i)).getId()==id)) {
					 regularEmployee = (RegularEmployee) objects.get(i);
				 }
			}
			 Object salesEmployee = new SalesEmployee(regularEmployee,tempProducts);
			 objects.add(salesEmployee);
			 objects.remove(regularEmployee);
			 
			 String[] product = productstr.split(" ");
			for (int i = 0; i < products.size(); i++) {
				for (int j = 0; j < product.length; j++) {
					if(products.get(i).getProductName().equals(product[j])) {
						((SalesEmployee) salesEmployee).addSale(products.get(i));
						
					}
				}
			}
			
			 
		 }
		 else if(word.equals("Customer")) {
			 ArrayList<Product> productsTemp = new ArrayList<Product>();
			 Person person = null;
			 id = input.nextInt();
			 productstr = input.nextLine();
			 for (int i = 0; i < objects.size(); i++) {
				 if((objects.get(i)instanceof Person)&&(((Person) objects.get(i)).getId()==id)) {
					person = (Person) objects.get(i); 
				 }	 
			}
			 
			 String[] product = productstr.split(" ");
				for (int i = 0; i < products.size(); i++) {
					for (int j = 0; j < product.length; j++) {
						if(products.get(i).getProductName().equals(product[j])) {
							productsTemp.add(products.get(i));
							
						}
					}
				} 
				
				Object customer = new Customer(person, productsTemp);	
				objects.add(customer);
				objects.remove(person);
				
					
		 }
		
	 }
	 for (int i = 0; i < objects.size(); i++) {
		 if(objects.get(i)instanceof Manager) {
			((Manager) objects.get(i)).distributeBonusBudget();
		 }
		
	}
	 for (int i = 0; i < objects.size(); i++) {
		 if(objects.get(i)instanceof Manager) {
			 ((Manager) objects.get(i)).raiseSalary(0.2);
		 }
		 else if(objects.get(i)instanceof RegularEmployee) {
			 ((RegularEmployee) objects.get(i)).raiseSalary(0.3);
		 }
		 else if(objects.get(i)instanceof Developer) {
			 ((Developer) objects.get(i)).raiseSalary(0.23);
		 }
		 else if(objects.get(i)instanceof SalesEmployee) {
			 ((SalesEmployee) objects.get(i)).raiseSalary(0.18);
		 }
	 }
	 double maxProduct = 0;
	 int a = 0;
	 for (int i = 0; i < objects.size(); i++) {
		 if(objects.get(i)instanceof SalesEmployee) {
			 if(((SalesEmployee) objects.get(i)).sumProduct() > maxProduct) {
				 maxProduct = ((SalesEmployee) objects.get(i)).sumProduct();
				 a=i;
			 }
		 }
	}
	 ((SalesEmployee) objects.get(a)).raiseSalary(1000); 
		
	 
	 
	 
	 
	int x = -1;
	 for (int i = 0; i < objects.size(); i++) {
		if(objects.get(i) instanceof Department) {
			 System.out.println("************************************************");
		 System.out.println(objects.get(i).toString());
		
				for (int j = 0; j < objects.size(); j++) {
					if((objects.get(j) instanceof Manager)&&(((Department) objects.get(i)).equals(((Manager) objects.get(j)).getDepartment()))) {
						System.out.println(objects.get(j).toString());
						System.out.println("		# of Employees: "+ 3+"]");
					}
				}
				for (int j = 0; j < objects.size(); j++) {
					if((objects.get(j) instanceof Developer)&&(((Department) objects.get(i)).equals(((Developer) objects.get(j)).getDepartment()))) {
						System.out.println("			1. Developer");
						System.out.println(objects.get(j).toString());
					}
				}
				
				for (int j = 0; j < objects.size(); j++) {
					if((objects.get(j) instanceof SalesEmployee)&&(((Department) objects.get(i)).equals(((SalesEmployee) objects.get(j)).getDepartment()))) {
						System.out.println("			2. SalesEmployee");
						System.out.println(objects.get(j).toString());
					}
				}
				
				for (int j = 0; j < objects.size(); j++) {
					if((objects.get(j) instanceof RegularEmployee)&&(((Department) objects.get(i)).equals(((RegularEmployee) objects.get(j)).getDepartment()))){
						if((!(objects.get(j) instanceof Developer))&& (!(objects.get(j) instanceof SalesEmployee))) {
						System.out.println("			3. RegularEmployee");
						System.out.println(objects.get(j).toString());
						}
					}
				}
				System.out.println("\n");
				
			}
		}
	 System.out.println("\n"+"\n");
	 System.out.println("**********************CUSTOMERS************************");
	 for (int i = 0; i < objects.size(); i++) {
		 if(objects.get(i) instanceof Customer) {
			 System.out.println(objects.get(i).toString());
		 }
	}
	 System.out.println("\n"+"\n");
	 System.out.println("**********************PEOPLE************************");
	 for (int i = 0; i < objects.size(); i++) {
		 if(objects.get(i) instanceof Person) {
			 if((!(objects.get(i) instanceof Customer))&& (!(objects.get(i) instanceof Employee))) {
				 System.out.println(objects.get(i).toString());
			 }
			
		 }
	}
	 
		
		
	}
		
		private static Calendar declareCalendar(String birthDatestr) {
				String[] splittedDate = birthDatestr.split("/");
				int DAY = Integer.parseInt(splittedDate[0]);
				int MONTH = Integer.parseInt(splittedDate[1])-1;
				int YEAR = Integer.parseInt(splittedDate[2]);
				Calendar calendar = Calendar.getInstance();
				calendar.set(YEAR,MONTH,DAY); 
				return calendar;
			 
		}
			
	
}
