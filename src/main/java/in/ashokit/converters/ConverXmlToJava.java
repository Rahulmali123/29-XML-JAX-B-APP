package in.ashokit.converters;

import java.io.File;

import in.ashokit.bindings.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class ConverXmlToJava {
	public static void main(String[] args) throws Exception 
	{

		File xmlfile = new File("Person.xml");

		JAXBContext instance = JAXBContext.newInstance(Person.class);
		
		Unmarshaller unmarshaller = instance.createUnmarshaller();
		
		Object object = unmarshaller.unmarshal(xmlfile);
		
		Person person=(Person) object;
		
		System.out.println("UnMarshalling Completed...!"+person);

	}
}
