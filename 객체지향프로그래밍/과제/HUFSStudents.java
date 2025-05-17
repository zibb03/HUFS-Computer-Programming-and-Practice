
public class HUFSStudents {
	
	private int ID;
	private String name;
	private String address;
	private String department;	
	
	HUFSStudents()
	{
		ID = 0;
		name= null;
		address= null;
		department= null;
	}
	
	HUFSStudents(int nID, String nName, String nAddress)
	{
		ID=nID;
		name = nName;
		address = nAddress;
	}
		
	HUFSStudents(int nID, String nName, String nAddress, String nDepartment)
	{
		ID=nID;
		name = nName;
		address = nAddress;
		department = nDepartment;
	}

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
		
	
}
