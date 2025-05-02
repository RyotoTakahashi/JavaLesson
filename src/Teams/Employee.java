package Teams;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
	private String name;
	private String department;
	private Integer salary;
	private Integer lengthasWorker;
	
	Employee(String name, String department, Integer salary, Integer lengthasWorker){
		setName(name);
		setDepartment(department);
		setSalary(salary);
		setLengthasWorker(lengthasWorker);
	}
	
	Employee(){
		setName(null);
		setDepartment(null);
		setSalary(null);
		setLengthasWorker(null);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getLengthasWorker() {
		return lengthasWorker;
	}
	public void setLengthasWorker(Integer lengthasWorker) {
		this.lengthasWorker = lengthasWorker;
	}
	
	public static class salaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO 自動生成されたメソッド・スタブ
			return Integer.compare(o2.getSalary(),o1.getSalary());
		}
		
	}
	
	//新規追加関数
	public static void addaYear(ArrayList<Employee> arrays) {
		for (Employee emp :arrays) {
			emp.setSalary(emp.getSalary()+10000*emp.getLengthasWorker());
			System.out.println(emp.getName()+"さんは"+emp.getLengthasWorker()*10000+"円昇給し、"+emp.getSalary()+"円になりました");
			emp.setLengthasWorker(emp.getLengthasWorker()+1);
		}
	}
	
}
