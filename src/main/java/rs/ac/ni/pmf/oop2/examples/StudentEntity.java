package rs.ac.ni.pmf.oop2.examples;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentEntity
{
	private Integer id;
	private String firstName;
	private String lastName;

	private String registrationDate;
}
