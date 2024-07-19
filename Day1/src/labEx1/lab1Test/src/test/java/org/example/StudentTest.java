package labEx1.lab1Test.src.test.java.org.example;

import labEx1.lab1Test.src.main.java.org.example.LabEx1_2;



import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentTest {

    private LabEx1_2 student1, student2, student3;
    private LabEx1_2[] students;

    @BeforeEach
    void setUp(){
        student1 = new LabEx1_2(1, "Student One", "City A", 70, 80, 90, 1000.0f, false);
        student2 = new LabEx1_2(2, "Student Two", "City B", 85, 90, 95, 800.0f, false);
        student3 = new LabEx1_2(3, "Student Three", "City C", 60, 70, 80, 1200.0f, false);

        students = new LabEx1_2[]{student1, student2, student3};

    }
    @Order(1)
    @Test
    void testGetAnnualFee() {
        assertEquals(12000.0f, student1.getAnnualFee());
        assertEquals(9600.0f, student2.getAnnualFee());
        assertEquals(14400.0f, student3.getAnnualFee());
    }
    @Order(4)
    @Test
    void testGetTotalMarks(){
        assertEquals(student1.getMarks1()+student1.getMarks2()+student1.getMarks3() , student1.getTotalMarks());
        assertEquals(student2.getMarks1()+student2.getMarks2()+student2.getMarks3() , student2.getTotalMarks());
        assertEquals(student3.getMarks1()+student3.getMarks2()+student3.getMarks3() , student3.getTotalMarks());

    }
    @Order(2)
    @Test
    void testGetAverage() {
        assertEquals((float) (student1.getMarks1() + student1.getMarks2() + student1.getMarks3())/3, student1.getAverage());
        assertEquals((float) (student2.getMarks1() + student2.getMarks2() + student2.getMarks3())/3, student2.getAverage());
        assertEquals((float) (student3.getMarks1() + student3.getMarks2() + student3.getMarks3())/3, student3.getAverage());
    }
    @Order(3)
    @Test
    void testGetResult(){
        assertEquals("pass",student1.getResult());
        assertEquals("pass",student2.getResult());
        assertEquals("fail",student3.getResult());

    }




    @Order(7)
    @Test
    public void testHighestTotalMarks() {
        LabEx1_2 highestScorer = students[0];
        for (LabEx1_2 student : students) {
            if (student.getTotalMarks() > highestScorer.getTotalMarks()) {
                highestScorer = student;
            }
        }
        assertEquals("Student Two", highestScorer.getStudentName());
    }

    @Order(6)
    @Test
    public void testLeastMonthlyFee() {
        LabEx1_2 leastFeeStudent = students[0];
        for (LabEx1_2 student : students) {
            if (student.getFeePerMonth() < leastFeeStudent.getFeePerMonth()) {
                leastFeeStudent = student;
            }
        }
        assertEquals("Student Two", leastFeeStudent.getStudentName());
    }

    @Order(5)
    @Test
    public void testScholarshipEligibility() {
        assertTrue(student2.isEligibleForScholarship());
        assertFalse(student1.isEligibleForScholarship());
        assertFalse(student3.isEligibleForScholarship());
    }

    @Order(8)
    @Test
    public void testDisplayStudentDetails() {
        for (LabEx1_2 student : students) {
            System.out.println("\nName: " + student.getStudentName());
            System.out.println("Total Marks: " + student.getTotalMarks());
            System.out.println("Average Marks: " + student.getAverage());
            System.out.println("Result: " + student.getResult());
            System.out.println("Scholarship: " + (student.isEligibleForScholarship() ? "available" : "not available"));
        }
    }









}
