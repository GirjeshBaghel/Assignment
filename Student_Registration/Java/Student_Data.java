
public class Student_Data {
	private  String id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String cources;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCources() {
		return cources;
	}
	public void setCources(String cources) {
		this.cources = cources;
	}
	@Override
	public String toString() {
		return "Student_Data [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", cources=" + cources + "]";
	}
	public Student_Data(String id, String name, String email, String password, String gender, String cources) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.cources = cources;
	}
	public Student_Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
