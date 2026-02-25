package in.ashokit.converters;

import java.io.File;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class ConverJavaToXml
{
	public static void main(String[] args) throws Exception 
	{
		// create Java Obj
		Address address=new Address();
		
		address.setCity("Pune");
		address.setState("MH");
		address.setCountry("India");
		
		
		
		// java Obj create
		Person per=new Person();
		per.setId(101);
		per.setName("John");
		per.setAge(25);
		per.setPhno(9049512140l);
		per.setTyoe("Doctor");
		per.setAddress(address);
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		
		Marshaller marshaller = instance.createMarshaller();
		
		marshaller.marshal(per, new File("Person.xml"));
		
		System.out.println("Marshalling Completed...!");
		
		
	}
}
