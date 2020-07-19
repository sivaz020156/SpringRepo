
public class EmployeeSetter {
	private int id;  
	private String name;  
	private String city;
	
	private AddressSetter addressSetter; 
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	} 
	
	
	
	public AddressSetter getAddressSetter() {
		return addressSetter;
	}
	public void setAddressSetter(AddressSetter addressSetter) {
		this.addressSetter = addressSetter;
	}
	void displayInfo(){  
	    System.out.println(id+" "+name+" "+city);  
	    System.out.println(addressSetter);  
	}   
	
	
	
}
