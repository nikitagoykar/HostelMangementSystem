/*Write a program that will have a Vector which is capable of
storing emp objects. Use an Iterator and enumeration to list
all the elements of the Vector.
Develop a java class with a instance variable CountryMap HashMap (M1)
* add a method saveCountryCapital(String CountryName, String capital) ,
* the method should add the passed country and capital as key/value in the map M1 and return the
Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed
from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name
passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as
the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi India
Tokyo Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all
the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.*/


package collectionassignments;


import java.util.Iterator;
import java.util.Vector;

class Employee1 {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee1(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee(103, "John", "345 street, India", 25000.0));
		list.add(new Employee(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}
