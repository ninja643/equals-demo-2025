package rs.ac.ni.pmf.oop2.examples;

import java.util.ArrayList;
import java.util.List;

public class StudentService
{
	private static int idCounter = 0;

	private final List<StudentEntity> _studentsDatabase = new ArrayList<>();

	public List<StudentDto> getAllStudents()
	{
		return _studentsDatabase.stream()
                .map(StudentMapper::toDto)
                .toList();
	}

	public StudentDto addStudent(final StudentDto student)
	{
		final StudentEntity studentEntity = StudentMapper.fromDto(student);

		if (studentEntity.getId() == null)
		{
			studentEntity.setId(++idCounter);
		}

		System.out.println("Adding student to database. New ID: " + studentEntity.getId());
		_studentsDatabase.add(studentEntity);

		return StudentMapper.toDto(studentEntity);
	}
}
