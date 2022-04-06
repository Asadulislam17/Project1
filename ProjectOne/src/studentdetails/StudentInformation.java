package studentdetails;


public class StudentInformation{
	private int id;
    private String name;
    private String department;
    private int age;
    private int admissionYear;
    private String contact;
    private String address;

    // constructor
    public StudentInformation(){
        //this.id = id;
        //this.name = name;
        //this.department = department;
        //this.age = age;
        //this.admissionYear = admissionYear;
        //this.contact = setContact(contact);
    }

	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact; 
	}
	
	/*
	 * public String setContact(String contact) { if (contact.length() == 6) {
	 * return contact; } else { return "Invalid Contact"; } }
	 */

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAdmissionYear() {
		return admissionYear;
	}

	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
	}

	public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}