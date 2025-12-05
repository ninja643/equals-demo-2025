package rs.ac.ni.pmf.oop2.examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentMapper
{
	private static final DateTimeFormatter _formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

	public static StudentDto toDto(final StudentEntity entity)
	{
		return new StudentDto(entity.getId(),
							  entity.getFirstName(),
							  entity.getLastName(),
							  LocalDateTime.parse(entity.getRegistrationDate(), _formatter));
	}

	public static StudentEntity fromDto(final StudentDto dto)
	{
		return new StudentEntity(dto.getId(),
								 dto.getFirstName(),
								 dto.getLastName(),
								 _formatter.format(dto.getRegistrationDate()));
	}
}
