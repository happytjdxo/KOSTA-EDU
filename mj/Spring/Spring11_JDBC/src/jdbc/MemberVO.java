package jdbc;

public class MemberVO {
	private String id, name, password, address;

	public MemberVO(String id, String name, String password, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	public MemberVO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", password="
				+ password + ", address=" + address + "]";
	}
}
