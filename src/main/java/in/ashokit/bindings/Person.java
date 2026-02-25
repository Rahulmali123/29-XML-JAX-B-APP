package in.ashokit.bindings;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorOrder;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.Data;


@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class Person 
{
	private Integer id;

	private String name;
	
	@XmlTransient
	private Integer age;
	
	@XmlElement(name = "PhoneNumber")
	private Long phno;
	
	@XmlAttribute
	private String tyoe;
	
	private Address address;

}
