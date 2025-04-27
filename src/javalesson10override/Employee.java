package javalesson10override;

public class Employee {
	String name;
	int id;

	Employee(String n, int i) {
		this.name = n;
		this.id = i;
	}

	@Override
	public boolean equals(Object y) {
		if (!(y instanceof Employee x)) {
			return false;
		} else {
			if (this.id == x.id) {
				return true;
			} else {
				return false;
			}
		}
	}

}
