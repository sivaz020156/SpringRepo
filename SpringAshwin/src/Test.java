import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test { 
	
public static void main(String[] args) { 
	
	
	/*ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
	Student obj = (Student) context.getBean("studentbean");
	obj.displayInfo();*/
   Resource resource=new ClassPathResource("applicationContext.xml");  
//    
//    
//    
    BeanFactory factory=new XmlBeanFactory(resource);  
//    
//    
//      
   Student student=(Student)factory.getBean("studentbean");  
//    
  student.displayInfo(); 
  
  
  
  
  
  Employee emp=(Employee)factory.getBean("e");
  emp.show();
//    
//    
//    //Object getBean(String, Class)
//   Student student=(Student)factory.getBean("studentbean",Student.class);  
//    
//    student.displayInfo();
//    
//    //boolean containsBean(String)
//    
//    boolean test=factory.containsBean("studentbean1");
//    System.out.println(test);
//    
//    System.out.println(factory.getType("studentbean"));
//    //boolean isSingleton(String)
//    
//    System.out.println(factory.isSingleton("studentbean"));
//    
//    System.out.println(factory.getAliases("studentbean"));
  
  
  EmployeeSetter eSetter=(EmployeeSetter)factory.getBean("empObj");
  eSetter.displayInfo();
  
  EmployeeSetter eSetterDep=(EmployeeSetter)factory.getBean("empObjDependent");
  eSetterDep.displayInfo();
  
  
  QuestionSetter ques=(QuestionSetter)factory.getBean("q");
  
  
 
  ques.displayInfo();
  
  
  QuestionSetter2 ques2=(QuestionSetter2)factory.getBean("q2");
  
  
  
  ques2.displayInfo();
}  
}  