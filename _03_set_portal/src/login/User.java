package login;

public class User {

	private int id;
	private int levelId;
	private String userName;
	private String email;
	private String tel;
	private String address;
	private String postcode;
	private String companyName;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int levelId, String userName, String email, String tel,
			String address, String postcode, String companyName, String level) {
		super();
		this.levelId = levelId;
		this.userName = userName;
		this.email = email;
		this.tel = tel;
		this.address = address;
		this.postcode = postcode;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
}
