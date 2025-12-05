package rs.ac.ni.pmf.oop2.examples;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@AllArgsConstructor
public class StudentDto
{
	Integer id;
	String firstName;
	String lastName;

	LocalDateTime registrationDate;

	public StudentDto(final String firstName, final String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		id = null;
		registrationDate = LocalDateTime.now();
	}
}
