# Employee Management System

This Java program is designed to simulate an employee and department management system. It reads data from an input file, processes various entities like `Person`, `Department`, `Employee`, `Manager`, `SalesEmployee`, `Developer`, `RegularEmployee`, and `Customer`, and manages their relationships and attributes. The program supports operations like salary adjustments, bonus distribution, and employee promotion.

### Features:
- **Object-Oriented Design**: The system models real-world entities like people, employees, managers, and products using classes and objects.
- **Input Parsing**: The system processes an input file that describes different objects and their attributes, which are parsed and stored in corresponding objects.
- **Salary Management**: The program calculates and updates salaries based on employee roles and performance.
- **Bonus Distribution**: Managers distribute a bonus budget to employees in their department.
- **Product and Sales Management**: Sales employees can manage products and customers.
- **Customer Management**: Each customer can be associated with one or more products they purchase.

### How It Works:
1. **Input File**: The program expects an input file (`input.txt`) located in the `src` directory. The file contains information about different entities in the system, including:
   - `Person`: Details about people (e.g., name, ID, birthdate).
   - `Department`: Information about company departments.
   - `Project`: Details of projects assigned to employees.
   - `Product`: Information about products, including prices and sale dates.
   - `Employee`: Employees with salary and hire date.
   - `Manager`, `Developer`, `RegularEmployee`, `SalesEmployee`: These are different types of employees, each with their own attributes and responsibilities.
   - `Customer`: Customers associated with products they purchase.

2. **Entity Relationships**: The program manages relationships between entities. For example, employees are associated with departments, and products are associated with sales employees.

3. **Salary & Bonus Calculations**: 
   - Managers distribute bonus budgets among employees.
   - Employee salaries are adjusted based on their role, with percentage increases applied to different employee types (e.g., RegularEmployee, Manager, etc.).

4. **Output**: The program prints the details of departments, employees, and customers in a structured format, showing the relationships between them.

### Example Input:
The `input.txt` file should contain data formatted as follows:
	Person John Doe 101 Male 01/01/1990 Single Yes Department 1 IT Project AI_Project 01/01/2022 Active Product Laptop 01/01/2023 1000 Employee 101 5000 01/01/2023 IT SalesEmployee 101 Laptop Customer 101 Laptop


### Example Output:
After processing the input, the program will output the details of departments, employees, and customers:
		Department IT Manager: John Doe # of Employees: 3 Developer: Jane Smith RegularEmployee: Alex Brown SalesEmployee: Mike Johnson

CUSTOMERS** Customer: John Doe Purchased Products: Laptop

PEOPLE** Person: Alice Williams


### Technologies Used:
- **Java**: The programming language used for the development of this project.
- **File I/O**: The program reads data from a file (`input.txt`) using Java's `Scanner` and `File` classes.
- **Object-Oriented Programming**: The program leverages OOP principles to model real-world entities and their relationships.

### How to Run:
1. Ensure you have a `input.txt` file with the correct format, placed in the `src` directory.
2. Compile the program:
   ```bash
   javac Test.java




