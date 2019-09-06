
public class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return 2;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("equals");
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
