package rs.ac.ni.pmf.oop2.examples;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class StudentsManager
{
	private StudentDto _selectedStudent;

	private final StudentService _service = new StudentService();

	public void selectStudent(final StudentDto studentToSelect)
	{
		log.info("Trying to select student: " + studentToSelect);

		for (final StudentDto student : _service.getAllStudents())
		{
			if (student.equals(studentToSelect))
			{
				log.info("Selected student: " + student);
				_selectedStudent = student;
				return;
			}
		}

		log.error("Selected student not found!");
		_selectedStudent = null;
	}

	public void addAndSelect(final StudentDto newStudent)
	{
		final StudentDto addedStudent = _service.addStudent(newStudent);
		System.out.println("Added student");
		selectStudent(addedStudent);
	}

	public void listStudents()
	{
		final List<StudentDto> allStudents = _service.getAllStudents();

		if (allStudents.isEmpty())
		{
			System.out.println("No students in database!");
			return;
		}

		System.out.println("Students in database:");
		allStudents.forEach(System.out::println);

		if (_selectedStudent != null)
		{
			System.out.println("Selected student: " + _selectedStudent);
		}
		else
		{
			System.out.println("No student selected!");
		}

	}

	public static void main(final String[] args)
	{
		final StudentsManager manager = new StudentsManager();

        log.error("Hello World!");

        manager.listStudents();

		manager.addAndSelect(new StudentDto("John", "Doe"));

		manager.listStudents();
	}
}
