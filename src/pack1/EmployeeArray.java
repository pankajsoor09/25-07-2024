package pack1;

public class EmployeeArray {
	
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[5];
		
		emp[0] = new Employee (101,"Aditya",2500000.00f);
		emp[1] = new Employee (102,"Swara",2800000.00f);
		emp[2] = new Employee (103,"Harshad",2400000.0f);
		emp[3] = new Employee (104,"Suraj",2300000.00f);
		emp[4] = new Employee (105,"Pankaj",3000000.50f);
		
		System.out.println("Employww Details : ");
		for(int i =0 ; i < emp.length;i++) {
			
			System.out.println("Employee Id : "+emp[i].getId());
			System.out.println("Employee Name : "+emp[i].getName());
			System.out.println("Salary : "+emp[i].getSalary());
			
			System.out.println("--------------------");
		}
	}

}
