//Create an Employee class with the related attributes and
 //behaviours. Create one more class EmployeeDB which has the
  //following methods. a. boolean addEmployee(Employee e) b.
//boolean deleteEmployee(int eCode) c. String showPaySlip(int
//eCode) d. Employee[] listAll() Use an ArrayList which will be
///used to store the emplyees and use enumeration/iterator to
//process the employees. Write a Test Program to test that all
//functionalities are operational.

//Listenumeration/ Iterator

package collectionassignments;






import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	List<EmployeeDB> employeeDb = new ArrayList<>();
	
	public boolean addEmployee(EmployeeDB e) {
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<EmployeeDB> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			EmployeeDB emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	private int getEmpId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (EmployeeDB e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpId();
			}
		}

		return paySlip;
	}
	
	public EmployeeDB[] listAll() {
		EmployeeDB[] empArray = new EmployeeDB[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
	
}