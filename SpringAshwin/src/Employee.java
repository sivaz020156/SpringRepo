import java.util.List;

public class Employee {  
private int id;  
private String name;  
private Address address;
private List<String> ans; 
private List<Answer> a;  
  
public Employee(int id, String name, Address address,List<String> ans,List<Answer> a) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address = address;  
    this.ans=ans;
    this.a=a;
}  
  
void show(){  
    System.out.println(id+" "+name); 
    System.out.println(address.toString()); 
    
    for(String str:ans)
    {
    	System.out.println(str);
    }
    
    for(Answer a1:a)
    {
    	System.out.println(a1);
    }
    
    
}  
  
} 