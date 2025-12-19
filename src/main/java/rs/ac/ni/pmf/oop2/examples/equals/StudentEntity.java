package rs.ac.ni.pmf.oop2.examples.equals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
public class StudentEntity {
    private static final String TEST = "test string";

    private Integer id;

    private BrojIndeksa brojIndeksa;

    private String firstName;
    private String lastName;

    private String registrationDate;

    public StudentEntity(final Integer id, final String firstName, final String lastName, final String registrationDate) {
        this.id = id;
        this.firstName = firstName;
        this.registrationDate = registrationDate;
        this.lastName = lastName;
    }

    public void setBrojIndeksa(final int brojIndeksa, final int godina) {
        this.brojIndeksa = new BrojIndeksa(brojIndeksa, godina);
    }

    @Value
    public static class BrojIndeksa {
        int broj;
        int godina;

        public String testMethod() {
            return TEST + ", " + broj + ", " + godina;
        }
    }

    public class DetailsPrinter {
        private String firstName = "blabla";

        public void printDetails() {
            System.out.println("Student details: " + StudentEntity.this.firstName + " " + lastName);
        }
    }
}
