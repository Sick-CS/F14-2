
class Stu {

	private String name;
	private int id;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	int add(int a, int b) {
		a = 50;
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

}

public class Main {
	public static void main(String[] args) {
		Stu s = new Stu();
		
		s.setName("tom");
		System.out.println(s.getName());
		s.setId(21);
		System.out.println(s.getId());
		
		
		System.out.println(s.add(10, 20));
		System.out.println(s.add(10, 20, 10));

	}
}
